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
package org.neo4j.kernel.api.vector;

import java.util.List;
import java.util.Objects;
import org.neo4j.values.storable.FloatingPointArray;
import org.neo4j.values.storable.Values;

public interface VectorCandidate {
    float floatElement(int index);

    int dimensions();

    static VectorCandidate maybeFrom(Object candidate) {
        if (candidate == null || candidate == Values.NO_VALUE) {
            return null;
        }

        if (candidate instanceof final FloatingPointArray floatingPointArray) {
            return new FloatingPointArrayVectorCandidate(floatingPointArray);
        }
        if (candidate instanceof final List<?> list && (list.isEmpty() || list.get(0) instanceof Double)) {
            return new ListVectorCandidate((List<Double>) list);
        }

        return null;
    }

    static VectorCandidate from(Object candidate) {
        final var vectorCandidate = maybeFrom(candidate);
        if (vectorCandidate == null) {
            Objects.requireNonNull(candidate, "Value cannot be null");
            throw new IllegalArgumentException("Value is not a valid vector candidate. Provided: " + candidate);
        }
        return vectorCandidate;
    }

    record FloatingPointArrayVectorCandidate(FloatingPointArray array) implements VectorCandidate {

        @Override
        public float floatElement(int index) {
            return array.floatValue(index);
        }

        @Override
        public int dimensions() {
            return array.length();
        }
    }

    record ListVectorCandidate(List<Double> list) implements VectorCandidate {
        @Override
        public float floatElement(int index) {
            return list.get(index).floatValue();
        }

        @Override
        public int dimensions() {
            return list.size();
        }
    }
}
