/*
 * Copyright (c) 2014, 2025, Jane Doe, John Smith
 *
 * MathSim is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MathSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MathSim. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mathsim.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Vector normalization tests.
 * 
 * @author Jane Doe (@janedoe)
 * @author John Smith (@jsmith)
 */
class VectorUtilsTest {
    private final static double ERROR_EPSILON = 1e-9;

    @Test
    void testNormalization() {
        Vector3d vector = new Vector3d(3, 4, 0);
        Vector3d normalized = VectorUtils.normalize(vector);

        double expectedLength = 1.0;
        double actualLength = VectorUtils.length(normalized);

        assertEquals(expectedLength, actualLength, ERROR_EPSILON);
        assertEquals(0.6, normalized.x, ERROR_EPSILON);
        assertEquals(0.8, normalized.y, ERROR_EPSILON);
        assertEquals(0.0, normalized.z, ERROR_EPSILON);
    }
}
