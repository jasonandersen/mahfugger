package com.palarran.mahfugger.exercise05;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import com.palarran.mahfugger.util.StringUtils;

/**
 * Testing the ability to split a paragraph into words sorted alphabetically.
 */
public class StringUtilsSplitWordsAlphabeticallyTest {

    private String paragraph;

    private Object[] expectedWords;

    private List<String> actualWords;

    /*
     * FIXME - make these tests pass!
     */

    @Test
    public void testNoDuplicates() {
        paragraph = "I punt monkeys.";
        expectedWords = new String[] { "I", "monkeys", "punt" };
        actualWords = StringUtils.splitWordsAlphabetically(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }

    @Test
    public void testDuplicateWords() {
        paragraph = "I punt monkeys and I punt koalas.";
        expectedWords = new String[] { "and", "I", "koalas", "monkeys", "punt" };
        actualWords = StringUtils.splitWordsAlphabetically(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }

    @Test
    public void testDuplicateWordsWithDifferentCapitalization() {
        paragraph = "I punt monkeys. Monkeys don't like to be punted.";
        expectedWords = new String[] { "be", "don't", "I", "like", "monkeys", "punt", "punted", "to" };
        actualWords = StringUtils.splitWordsAlphabetically(paragraph);
        assertArrayEquals(expectedWords, actualWords.toArray());
    }
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
 * 
 * 
 * 
 * 
 * 
 * splitWordsAlphabetically()
 * --------------------------
 * For uniqueness, look at implementations of the Set interface.
 * 
 * For the sorting, you can either try Collections.sort() or use a SortedSet.
 * 
 */
