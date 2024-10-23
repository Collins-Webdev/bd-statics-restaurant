package com.amazon.ata.statics;

public final class StringValidator {

    // Constant for the forbidden word
    private static final String FORBIDDEN_WORD = "fish";

    // Constant for the maximum allowed length
    private static final int MAX_LENGTH = 250;

    // Private constructor to prevent instantiation of the class
    private StringValidator() {}

    /**
     * Checks to see if the string entered contains a forbidden string.
     *
     * @param input string that's being checked
     * @throws InvalidStringException if the input contains the forbidden string
     */
    public static void containsForbiddenWord(String input) throws InvalidStringException {
        if (input.toLowerCase().contains(FORBIDDEN_WORD)) {
            throw new InvalidStringException("The given String contains a forbidden word: '" + FORBIDDEN_WORD + "'.");
        }
    }

    /**
     * Checks to see if the string entered has a length greater than the max allowed length.
     *
     * @param input string that's being checked
     * @throws InvalidStringException if the input exceeds the maximum allowed length
     */
    public static void greaterThanMaxLength(String input) throws InvalidStringException {
        if (input.length() > MAX_LENGTH) {
            throw new InvalidStringException("The given String exceeds the maximum allowed length of " + MAX_LENGTH + " characters.");
        }
    }
}
