/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.world.liquid;

import org.terasology.module.sandbox.API;

/**
 * Describes the liquid state of a single block
 *
 */
@API
public class LiquidData {
    public static final byte MAX_LIQUID_DEPTH = 0x07;

    private byte depth;

    public LiquidData() {
        depth = (byte) 0;
    }

    public LiquidData(byte depth) {
        this.depth = depth;
    }


    public byte getDepth() {
        return depth;
    }

    public byte toByte() {
        return depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof LiquidData) {
            LiquidData other = (LiquidData) o;
            return depth == other.depth || depth == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return depth;
    }

    @Override
    public String toString() {
        if (depth > 0) {
            return "Liquid depth: " + depth;
        }
        return "DRY";
    }
}
