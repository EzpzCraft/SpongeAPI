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
package org.spongepowered.api.text.message;

import org.spongepowered.api.text.translation.Translatable;
import org.spongepowered.api.text.translation.Translation;

/**
 * Utility class to work with and create Messages.
 */
public final class Messages {

    private static final MessageFactory factory = null;

    private Messages() {
    }

    /**
     * Creates a {@link MessageBuilder} with empty text.
     *
     * @return A new message builder with empty text
     */
    public static MessageBuilder builder() {
        return factory.createEmptyBuilder();
    }

    /**
     * Creates a {@link MessageBuilder.Text} with the specified text.
     *
     * @param text The text for the message
     * @return A new message builder with the specified text
     * @see Message.Text
     */
    public static MessageBuilder.Text builder(String text) {
        return factory.createTextBuilder(text);
    }

    /**
     * Creates a {@link MessageBuilder.Translatable} with the specified
     * translation and arguments.
     *
     * @param translation The translation to use for the message
     * @param args The arguments for the translation, can be empty
     * @return A new message builder with the specified translation and
     *         arguments
     * @see Message.Translatable
     */
    public static MessageBuilder.Translatable builder(Translation translation, Object... args) {
        return factory.createTranslatableBuilder(translation, args);
    }

    /**
     * Creates a {@link MessageBuilder.Translatable} with the specified
     * {@link Translatable} object and arguments.
     *
     * @param translatable The translatable object to insert to the message
     * @param args The arguments for the translation, can be empty
     * @return A new message builder with the translation of the translatable
     *         object
     * @see Message.Translatable
     */
    public static MessageBuilder.Translatable builder(Translatable translatable, Object... args) {
        return builder(translatable.getTranslation(), args);
    }

    // TODO: Change to builder() when possible?

    /**
     * Creates a new {@link MessageBuilder.Selector} with the specified
     * selector.
     *
     * @param selector The selector for the message
     * @return A new message builder with the specified selector
     * @see Message.Selector
     */
    public static MessageBuilder.Selector selector(String selector) {
        return factory.createSelectorBuilder(selector);
    }

    /**
     * Creates a new {@link MessageBuilder.Score} with the specified score.
     *
     * @param score The score for the message
     * @return A new message builder with the specified score
     * @see Message.Score
     */
    public static MessageBuilder.Score score(Object score) {
        return factory.createScoreBuilder(score);
    }

    /**
     * Creates a {@link Message} with the specified plain text. The created
     * message won't have any formatting or events configured.
     *
     * @param content The content of the Message
     * @return The created {@link Message}
     */
    public static Message.Text of(String content) {
        return factory.createPlain(content);
    }

    /**
     * Returns the default legacy formatting character.
     *
     * @return The legacy formatting character
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static char getLegacyChar() {
        return factory.getColorChar();
    }

    /**
     * Creates a Message from a legacy string using the default legacy.
     *
     * @param text The text to be converted as a String
     * @return The converted Message
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static Message.Text fromLegacy(String text) {
        return fromLegacy(text, getLegacyChar());
    }

    /**
     * Creates a Message from a legacy string, given a color character.
     *
     * @param text The text to be converted as a String
     * @param color The color character to be replaced
     * @return The converted Message
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static Message.Text fromLegacy(String text, char color) {
        return factory.parseLegacyMessage(text, color);
    }

    /**
     * Removes the legacy formatting character from a legacy string.
     *
     * @param text The legacy text as a String
     * @return The stripped text
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static String stripCodes(String text) {
        return stripCodes(text, getLegacyChar());
    }

    /**
     * Removes the legacy formatting character from a legacy string.
     *
     * @param text The legacy text as a String
     * @param color The color character to be replaced
     * @return The stripped text
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static String stripCodes(String text, char color) {
        return factory.stripLegacyCodes(text, color);
    }

    /**
     * Replaces the given formatting character with the default legacy
     * formatting character from a legacy string.
     *
     * @param text The legacy text as a String
     * @param from The color character to be replaced
     * @return The replaced text
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static String replaceCodes(String text, char from) {
        return replaceCodes(text, from, getLegacyChar());
    }

    /**
     * Replaces the given formatting character with another given formatting
     * character from a legacy string.
     *
     * @param text The legacy text as a String
     * @param from The color character to be replaced
     * @param to The color character to replace with
     * @return The replaced text
     * @deprecated Legacy formatting codes are being phased out of Minecraft
     */
    @Deprecated
    public static String replaceCodes(String text, char from, char to) {
        return factory.replaceLegacyCodes(text, from, to);
    }

}
