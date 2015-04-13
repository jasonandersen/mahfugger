package com.palarran.mahfugger.exercise11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Test that the Location class is properly formatting itself.
 */
public class LocationToStringTest {

    /*
     * The toString() method of any instance should represent the current value of that instance.
     * In this case, we want to make sure the toString() method in the location class will format
     * the location in DD° MM' SS.S" H format.
     * 
     * FIXME - make these tests pass!
     */
    private Location location;

    @Test
    public void test1() {
        location = new Location(47.89234, -123.456);
        assertEquals("47° 53' 32.424\"N 123° 27' 21.6\"W", location.toString());
    }

    @Test
    public void test2() {
        location = new Location(47.0, -123.0);
        assertEquals("47°N 123°W", location.toString());
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
     * HINT: override toString() in the Location class. Right now the Location class is inheriting the
     * toString() method from the Object class.
     * 
     * HINT: see the Javadocs for the java.util.Formatter class. Also look up printf() formatting in Evernote.
     * You really don't ever want to build dynamic strings by just concatenating them together "a" + "b", ect.
     * Use printf() style formatting to do that.
     * 
     * 
     * 
     * 
     * 
     */
}
