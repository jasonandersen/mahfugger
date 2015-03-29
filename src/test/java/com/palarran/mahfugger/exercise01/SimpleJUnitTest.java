package com.palarran.mahfugger.exercise01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a simple JUnit test class.
 */
public class SimpleJUnitTest {

    /*
     * The instance variables in a JUnit test class house any objects used to setup
     * tests or the actual objects to be tested.
     */

    private String message = "default message text";

    /**
     * The @Before annotation in a JUnit test is used to annotate a method that
     * you want to run before each test. Use this annotation to create setup 
     * methods that setup the environment for each of your tests to run.
     */
    @Before
    public void setup() {
        System.out.println("\n*** This is in the setup() method. ***");
        System.out.println("message = " + message);
    }

    /**
     * The @After annotation in a JUnit test is used to annotate a method that 
     * you want to run after each test. Use this annotation to tear down the 
     * environment after your test is complete. 
     */
    @After
    public void tearDown() {
        System.out.println("*** This is in the tearDown() method. ***");
        System.out.println("message = " + message);
    }

    /**
     * The @Test annotation indicates a method that is an actual test. 
     */
    @Test
    public void test1() {
        System.out.println("*** This is in the test1() method. ***");
        System.out.println("message = " + message);

        message = "I like monkeys.";
        System.out.println("message = " + message);

        /*
         * Use assertion methods from JUnit's Assert class to perform tests.
         */
        assertEquals("I like monkeys.", message);
        assertTrue(message.length() >= 13);
        assertFalse(message.startsWith("poo"));
    }

    @Test
    public void test2() {
        System.out.println("*** This is in the test2() method. ***");
        System.out.println("message = " + message);

        message = "Monkey face. Monkey face. Everyone is looking at your monkey face.";
        System.out.println("message = " + message);
    }

}
