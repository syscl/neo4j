/*
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.shell;

import java.io.IOException;
import java.io.Serializable;
import java.rmi.RemoteException;

public class SilentLocalOutput implements Output
{
    @Override
    public Appendable append( CharSequence csq ) throws IOException
    {
        return this;
    }

    @Override
    public Appendable append( CharSequence csq, int start, int end ) throws IOException
    {
        return this;
    }

    @Override
    public Appendable append( char c ) throws IOException
    {
        return this;
    }

    @Override
    public void print( Serializable object ) throws RemoteException
    {
    }

    @Override
    public void println() throws RemoteException
    {
    }

    @Override
    public void println( Serializable object ) throws RemoteException
    {
    }
}
