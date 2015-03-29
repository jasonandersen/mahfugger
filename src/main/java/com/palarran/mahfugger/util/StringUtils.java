package com.palarran.mahfugger.util;

import java.util.List;

/**
 * A grab bag of string-based utility methods.
 */
public class StringUtils {

    /**
     * Private constructor.
     */
    private StringUtils() {
        /*
         * This is a private constructor. By making the constructor private, that prevents anyone
         * from instantiating this class. This class will be comprised of static methods only.
         */
    }

    /**
     * @param original the string to reverse
     * @return a new string that contains all of the characters from the original string in
     *      reverse order.
     * @throws IllegalArgumentException if original is null     
     */
    public static String reverse(String original) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @param paragraph the string to break down into words
     * @return a list containing the words in the paragraph in the order in which they appear
     *      in the original string. No punctuation or whitespace should be included in the 
     *      returned list.
     * @throws IllegalArgumentException if paragraph is null
     */
    public static List<String> splitWords(String paragraph) {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
