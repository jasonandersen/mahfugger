package com.palarran.mahfugger.exercise04;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import com.palarran.mahfugger.util.StringUtils;

/**
 * Test the ability to decompose a string down into words.
 */
public class StringUtilsSplitWordsTest {

    private String paragraph;

    private Object[] expectedWords;

    private List<String> actualWords;

    /*
     * FIXME - make these tests pass!
     */

    @Test
    public void test1() {
        paragraph = "I like monkeys.";
        expectedWords = new String[] { "I", "like", "monkeys" };
        actualWords = StringUtils.splitWords(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }

    @Test
    public void test2() {
        paragraph = "HOLY SHIT - I REALLY like monkeys!!!!";
        expectedWords = new String[] { "HOLY", "SHIT", "I", "REALLY", "like", "monkeys" };
        actualWords = StringUtils.splitWords(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }

    @Test
    public void testEmptyString() {
        paragraph = "";
        expectedWords = new String[] {};
        actualWords = StringUtils.splitWords(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }

    /*
     * Once again, we should get an IllegalArgumentException when a null value is passed
     * into the method. The previous exercise, we used a tedious way to test that we should
     * get an expected exception. In this test, I use an easier way to verify that we should
     * get an expected exception. When you use the expected argument on the @Test annotation,
     * the only way the test will pass is if it results in an IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullArgument() {
        StringUtils.splitWords(null);
    }

}
