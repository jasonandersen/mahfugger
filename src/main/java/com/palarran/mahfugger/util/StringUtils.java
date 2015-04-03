package com.palarran.mahfugger.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
         * from instantiating this class. This class will be comprised of static methods only and
         * therefore would not make sense to instantiate.
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

    /**
     * @param paragraph
     * @return a list of unique words (regardless of case) contained in paragraph in ascending alphabetical order. No
     *      punctuation or whitespace should be included in the returned list.
     * @throws IllegalArgumentException if paragraph is null
     */
    public static List<String> splitWordsAlphabetically(String paragraph) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @param path 
     * @return a string containing the contents of the file
     * @throws IOException if the file can't be read
     * @throws IllegalArgumentException if path is null
     * 
     */
    public static String loadFileContents(String path) throws IOException {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @param path
     * @return a map containing word counts within the file. The String key in the returned
     *      map is the word and the Integer value in the map is the number of times that
     *      word appears in the file
     */
    public static Map<String, Integer> countWordsInFile(String path) {
        throw new IllegalArgumentException("not implemented yet");
    }

}
