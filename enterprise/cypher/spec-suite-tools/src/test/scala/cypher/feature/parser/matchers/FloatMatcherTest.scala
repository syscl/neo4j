/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) with the
 * Commons Clause, as found in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * Neo4j object code can be licensed independently from the source
 * under separate terms from the AGPL. Inquiries can be directed to:
 * licensing@neo4j.com
 *
 * More information is also available at:
 * https://neo4j.com/licensing/
 */
package cypher.feature.parser.matchers

import cypher.feature.parser.ParsingTestSupport

class FloatMatcherTest extends ParsingTestSupport {

  test("should match simple float") {
    new FloatMatcher(1.0) should accept(1.0)
    new FloatMatcher(.1e1) should accept(1.0)
  }

  test("should match infinities") {
    new FloatMatcher(Double.PositiveInfinity) should accept(Double.PositiveInfinity)
    new FloatMatcher(Double.NegativeInfinity) should accept(Double.NegativeInfinity)
  }

  test("should match NaN") {
    new FloatMatcher(Double.NaN) should accept(Double.NaN)
  }

  test("should not match integers") {
    new FloatMatcher(1.0) shouldNot accept(1)
    new FloatMatcher(0.0) shouldNot accept(0)
  }

  test("should not match strings") {
    new FloatMatcher(0.0) shouldNot accept("0.0")
    new FloatMatcher(0.0e1) shouldNot accept("0")
  }

}
