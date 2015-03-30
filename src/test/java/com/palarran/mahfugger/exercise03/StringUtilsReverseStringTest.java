package com.palarran.mahfugger.exercise03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.palarran.mahfugger.util.StringUtils;

/**
 * Test the ability to reverse a string.
 */
public class StringUtilsReverseStringTest {

    private String original;

    private String expectedOutput;

    private String actualOutput;

    /*
     * FIXME - make these tests pass.
     */

    @Test
    public void test1() {
        original = "abc";
        expectedOutput = "cba";
        actualOutput = StringUtils.reverse(original);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        original = "AaBbCc";
        expectedOutput = "cCbBaA";
        actualOutput = StringUtils.reverse(original);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSingleCharacter() {
        original = "F";
        expectedOutput = "F";
        actualOutput = StringUtils.reverse(original);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEmptyString() {
        original = "";
        expectedOutput = "";
        actualOutput = StringUtils.reverse(original);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNullParameter() {
        /*
         * Based on the Javadocs for StringUtils.reverse(), when a null value is passed into the
         * method, the method should throw an IllegalArgumentException. Let's pass in a null value
         * and find out what happens.
         */
        try {
            StringUtils.reverse(null); //<-- uh oh
            /*
             * If we call the reverse() method with a null value, we should never be able to reach
             * this next line of code. If we did, then this test fails because an exception was not 
             * thrown.
             */
            fail();
        } catch (IllegalArgumentException e) {
            /*
             * An IllegalArgumentException was thrown. This was the expected behavior so the test
             * should pass and everything is fat, dumb and happy. No need to put in any code in here
             * because the test will pass by default.
             */
        } catch (Exception e) {
            /*
             * Some other kind of exception was thrown, not an IllegalArgumentException. This is not
             * expected behavior so therefore this test should fail.
             */
            fail();
        }
    }
}
