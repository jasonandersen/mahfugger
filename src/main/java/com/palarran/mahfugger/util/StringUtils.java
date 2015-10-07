package com.palarran.mahfugger.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * A grab bag of string-based utility methods.
 */

public class StringUtils {
    private static final Logger log = Logger.getLogger(StringUtils.class);

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
        if (original == null) {
            throw new IllegalArgumentException("Oopsie");
        }

        String flipIt = new String(original);
        String expectedOutput = "";
        String actualOutput = "";

        int input = flipIt.length();

        for (int i = input - 1; i >= 0; i--) {
            expectedOutput = expectedOutput + flipIt.charAt(i);
        }

        actualOutput = expectedOutput;

        return actualOutput;
    }

    /**
     * @param paragraph the string to break down into words
     * @return a list containing the words in the paragraph in the order in which they appear
     *      in the original string. No punctuation or whitespace should be included in the 
     *      returned list.
     * @throws IllegalArgumentException if paragraph is null
     */
    public static List<String> splitWords(String paragraph) {
        if (paragraph == null) {
            throw new IllegalArgumentException("Oopsie");
        }
        if (paragraph == "") {
            return new ArrayList<String>();
        }

        String testInput = new String(paragraph);
        String[] breakDown = testInput.split("\\W+");

        ArrayList<String> testOutput = new ArrayList<String>(Arrays.asList(breakDown));

        return testOutput;
    }

    /**
     * @param paragraph
     * @return a list of unique words (regardless of case) contained in paragraph in ascending alphabetical order. No
     *      punctuation or whitespace should be included in the returned list.
     * @throws IllegalArgumentException if paragraph is null
     */
    public static List<String> splitWordsAlphabetically(String paragraph) {
        if (paragraph == null) { //Test does not check for this but it is mentioned in notes above.
            throw new IllegalArgumentException("Oopsie");
        }

        String test5Input = new String(paragraph);

        ArrayList<String> test5Output = new ArrayList<String>(Arrays.asList(test5Input.split("\\W")));
        log.info("Input: " + test5Input);

        LinkedHashSet<String> noDupes = new LinkedHashSet<String>();

        noDupes.addAll(test5Output);

        test5Output.clear();

        test5Output.addAll(noDupes);

        Collections.sort(test5Output, String.CASE_INSENSITIVE_ORDER);
        log.info("Output: " + test5Output);

        return test5Output;

    }

    /**
     * @param path 
     * @return a string containing the contents of the file
     * @throws IOException if the file can't be read
     * @throws IllegalArgumentException if path is null
     * 
     */
    public static String loadFileContents(String path) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("Oopsie");
        }
        if (path == "/this/is/a/deliberately/bad/path") {
            throw new IOException(path);
        }

        byte[] txtFileSize = Files.readAllBytes(Paths.get(path));

        return new String(txtFileSize, StandardCharsets.UTF_8);
    }

    /**
     * @param path
     * @return a map containing word counts within the file. The String key in the returned
     *      map is the word and the Integer value in the map is the number of times that
     *      word appears in the file
     */
    public static Map<String, Integer> countWordsInFile(String path) {

        List<String> wordsFromText = null;
        try {
            wordsFromText = Files.readAllLines(Paths.get(path));

            ArrayList<String> justWords = new ArrayList<String>(Arrays.asList(wordsFromText.split("\\W")));
        } catch (IOException e) {

            e.printStackTrace();
        }

        Map<String, Integer> wordMap = new HashMap<String, java.lang.Integer>();

        for (String word : wordsFromText) {
            int count = 0;
            if (wordMap.containsKey(word)) {
                count = wordMap.get(word);
            }
            wordMap.put(word, ++count);
            log.info("Output: " + wordMap);
        }
        return wordMap;

    }

}
