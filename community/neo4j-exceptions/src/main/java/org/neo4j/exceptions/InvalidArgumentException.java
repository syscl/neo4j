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
package org.neo4j.exceptions;

import java.util.List;
import org.neo4j.gqlstatus.ErrorClassification;
import org.neo4j.gqlstatus.ErrorGqlStatusObject;
import org.neo4j.gqlstatus.ErrorGqlStatusObjectImplementation;
import org.neo4j.gqlstatus.GqlParams;
import org.neo4j.gqlstatus.GqlStatusInfoCodes;
import org.neo4j.kernel.api.exceptions.Status;

public class InvalidArgumentException extends Neo4jException {
    @Deprecated
    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArgumentException(ErrorGqlStatusObject gqlStatusObject, String message, Throwable cause) {
        super(gqlStatusObject, message, cause);
    }

    @Deprecated
    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(ErrorGqlStatusObject gqlStatusObject, String message) {
        super(gqlStatusObject, message);
    }

    @Override
    public Status status() {
        return Status.Statement.ArgumentError;
    }

    public static InvalidArgumentException unknownNormalForm(String normalForm) {
        var gql = ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_42001)
                .withClassification(ErrorClassification.CLIENT_ERROR)
                .withCause(ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_42N49)
                        .withClassification(ErrorClassification.CLIENT_ERROR)
                        .withParam(GqlParams.StringParam.input, normalForm)
                        .build())
                .build();
        return new InvalidArgumentException(gql, "Unknown normal form. Valid values are: NFC, NFD, NFKC, NFKD.");
    }

    public static InvalidArgumentException incompleteSpatialValue(
            String crs, String mandatoryKeys, List<String> mandatoryKeysList) {
        var gql = ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_22000)
                .withClassification(ErrorClassification.CLIENT_ERROR)
                .withCause(ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_22N18)
                        .withClassification(ErrorClassification.CLIENT_ERROR)
                        .withParam(GqlParams.StringParam.crs, String.valueOf(crs))
                        .withParam(GqlParams.ListParam.mapKeyList, mandatoryKeysList)
                        .build())
                .build();
        return new InvalidArgumentException(gql, String.format("A %s point must contain %s", crs, mandatoryKeys));
    }

    public static InvalidArgumentException timezoneAndOffsetMismatch(
            String zoneName, String offset, List<String> validOffsets, String matcherGroup) {
        var gql = ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_22003)
                .withClassification(ErrorClassification.CLIENT_ERROR)
                .withCause(ErrorGqlStatusObjectImplementation.from(GqlStatusInfoCodes.STATUS_22N04)
                        .withClassification(ErrorClassification.CLIENT_ERROR)
                        .withParam(GqlParams.StringParam.input, zoneName)
                        .withParam(GqlParams.StringParam.context, String.valueOf(offset))
                        .withParam(GqlParams.ListParam.inputList, validOffsets)
                        .build())
                .build();
        return new InvalidArgumentException(gql, "Timezone and offset do not match: " + matcherGroup);
    }
}
