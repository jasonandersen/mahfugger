package com.palarran.mahfugger.exercise06;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.palarran.mahfugger.util.StringUtils;

/**
 * Test the ability to read a text file and return a count of each word in the file.
 */
public class StringUtilsUniqueWordsTest {

    private static final Logger log = Logger.getLogger(StringUtilsUniqueWordsTest.class);

    /*
     * FIXME - make these tests pass.
     */

    private String output;

    @Test
    public void testFile() throws IOException {
        String path = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/i-like-monkeys.txt";
        output = StringUtils.loadFileContents(path);
        log.debug(output);
        //make sure the file was loaded
        assertEquals(2618, output.length());
        assertTrue(output.startsWith("I like monkeys."));
        assertTrue(output.endsWith("I like monkeys."));
        assertTrue(output.contains("plumber"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullFile() throws IOException {
        /*
         * According to the Javadocs of the StringUtils.loadFileContents(), passing in a File object
         * that is null should throw an IllegalArgumentException.
         */
        StringUtils.loadFileContents(null);
    }

    @Test(expected = IOException.class)
    public void testInvalidFile() throws IOException {
        /*
         * According to the Javadocs of the StringUtils.loadFileContents(), passing in a File object
         * that doesn't exist should throw an IllegalArgumentException.
         */
        StringUtils.loadFileContents("/this/is/a/deliberately/bad/path");
    }

    @Test
    public void testLoadWordCount() {
        Map<String, Integer> wordCount = StringUtils
                .countWordsInFile("/Users/jason/dev/workspace/mahfugger/src/test/resources/files/i-like-monkeys.txt");
        assertEquals(new Integer(13), wordCount.get("monkeys"));
        assertEquals(new Integer(2), wordCount.get("freezer"));
    }

    /*
     * ****** SPOILER ALERT - ONLY READ BELOW IF YOU'RE STUCK *******
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *
     * public static String loadFileContents(String path) throws IOException {
     *     byte[] encoded = Files.readAllBytes(Paths.get(path));
     *     return new String(encoded, StandardCharsets.UTF_8);
     * }
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * testInvalidFile() 
     * -----------------
     * Look at the File object. There's a method in there that will tell you if the file is valid or not.
     * 
     * 
     */

}
