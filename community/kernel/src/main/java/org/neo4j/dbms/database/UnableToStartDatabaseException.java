/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [https://neo4j.com]
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.neo4j.dbms.database;

import static java.lang.String.format;

import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.gqlstatus.ErrorClassification;
import org.neo4j.gqlstatus.ErrorGqlStatusObject;
import org.neo4j.gqlstatus.ErrorGqlStatusObjectImplementation;
import org.neo4j.gqlstatus.GqlParams;
import org.neo4j.gqlstatus.GqlStatusInfoCodes;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.database.NamedDatabaseId;

/**
 * An error
 */
public class UnableToStartDatabaseException extends DatabaseManagementException {
    @Deprecated
    public UnableToStartDatabaseException(String message) {
        super(message);
    }

    private UnableToStartDatabaseException(ErrorGqlStatusObject gqlStatusObject, String message) {
        super(gqlStatusObject, message);
    }

    @Deprecated
    public UnableToStartDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    private UnableToStartDatabaseException(ErrorGqlStatusObject gqlStatusObject, String message, Throwable cause) {
        super(gqlStatusObject, message, cause);
    }

    public static UnableToStartDatabaseException unableToStartDb(NamedDatabaseId namedDatabaseId, Throwable cause) {
        var gql = ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_51N40)
                .withParam(GqlParams.StringParam.db, namedDatabaseId.name())
                .withClassification(ErrorClassification.DATABASE_ERROR)
                .build();

        return new UnableToStartDatabaseException(
                gql, format("An error occurred! Unable to start `%s`.", namedDatabaseId), cause);
    }

    @Override
    public Status status() {
        return Status.Database.UnableToStartDatabase;
    }
}
