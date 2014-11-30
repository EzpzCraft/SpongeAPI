/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api;

import com.google.common.base.Optional;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.item.ItemType;

/**
 * Provides an easy way to retrieve and set types from a {@link Game}.
 */
public interface GameRegistry {

    /**
     * Gets a {@link BlockType} by its identifier.
     *
     * @param id The id to look up
     * @return The block or null if not found
     */
    Optional<BlockType> getBlock(String id);

    /**
     * Gets an {@link ItemType} by its identifier.
     *
     * @param id The id to look up
     * @return The item or null if not found
     */
    Optional<ItemType> getItem(String id);

    /**
     * Gets the ID registered to the object.
     *
     * @param obj The object to look up
     * @return The id or null if none found
     */
    Optional<String> getId(Object obj);

    /**
     * Registers an item type in the item type dictionary.
     *
     * @param type The type of the item to set
     */
    void registerItem(ItemType type);

}
