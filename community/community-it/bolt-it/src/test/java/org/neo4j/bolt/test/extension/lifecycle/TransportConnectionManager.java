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
package org.neo4j.bolt.test.extension.lifecycle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.neo4j.bolt.testing.client.TransportConnection;
import org.neo4j.bolt.testing.client.TransportType;
import org.neo4j.internal.helpers.HostnamePort;

public class TransportConnectionManager implements AfterEachCallback {
    private final TransportType transportType;

    private final Lock lock = new ReentrantLock();
    private final List<TransportConnection> activeConnections = new ArrayList<>();

    public TransportConnectionManager(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        this.lock.lock();

        try {
            this.activeConnections.forEach(connection -> {
                try {
                    connection.close();
                } catch (Throwable ignore) {
                }
            });

            this.activeConnections.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public TransportConnection acquire(HostnamePort address) {
        var connection = this.transportType.getFactory().create(address);
        this.lock.lock();
        try {
            this.activeConnections.add(connection);
        } finally {
            this.lock.unlock();
        }

        return connection;
    }
}
