/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher

import org.neo4j.configuration.Config
import org.neo4j.configuration.connectors.BoltConnector
import org.neo4j.configuration.helpers.SocketAddress
import org.neo4j.cypher.testing.api.CypherExecutorFactory
import org.neo4j.cypher.testing.impl.FeatureDatabaseManagementService
import org.neo4j.cypher.testing.impl.driver.DriverCypherExecutorFactory
import org.neo4j.dbms.api.DatabaseManagementService
import org.neo4j.fabric.FabricFeatureToggles
import org.neo4j.graphdb.config.Setting
import org.neo4j.test.TestDatabaseManagementServiceBuilder

import scala.jdk.CollectionConverters.MapHasAsJava

class DefaultDeprecationBoltAcceptanceTest()
    extends DeprecationBoltAcceptanceTest(FabricFeatureToggles.NEW_COMPOSITE_STACK.defaultValue())
class QueryRouterDeprecationBoltAcceptanceTest() extends DeprecationBoltAcceptanceTest(true)

abstract class DeprecationBoltAcceptanceTest(queryRouter: Boolean) extends DeprecationAcceptanceTestBase {

  override def beforeAll() {
    super.beforeAll()
    FabricFeatureToggles.NEW_COMPOSITE_STACK.set(queryRouter)
  }

  override def afterAll() {
    super.afterAll()
    FabricFeatureToggles.NEW_COMPOSITE_STACK.clear()
  }

  val boltConfig: Map[Setting[_], Object] =
    Map(
      BoltConnector.enabled -> java.lang.Boolean.TRUE,
      BoltConnector.listen_address -> new SocketAddress("localhost", 0)
    )

  private val config = Config.newBuilder().set(boltConfig.asJava).build()

  private val managementService: DatabaseManagementService =
    new TestDatabaseManagementServiceBuilder().impermanent.setConfig(config).build()
  private val executorFactory: CypherExecutorFactory = DriverCypherExecutorFactory(managementService, config)

  override protected val dbms: FeatureDatabaseManagementService =
    FeatureDatabaseManagementService(managementService, executorFactory)
}
