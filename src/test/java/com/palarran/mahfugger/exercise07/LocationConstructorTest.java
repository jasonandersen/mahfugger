package com.palarran.mahfugger.exercise07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Tests the constructor of the Location class is properly guarding against
 * invalid values.
 */
public class LocationConstructorTest {

    /*
     * You're going to start working with the Location class. Location represents a geographic
     * point somewhere on Earth as defined by a Latitude and Longitude. For this exercise, you're
     * going to be writing the constructor for the Location class. If you're not familiar with 
     * constructors, do some reading on them. A constructor is the code that's going to setup the
     * object for use.
     * 
     * In these tests, I'm asking you to setup a Location instance correctly. I want to make sure
     * that we can never get an incorrect latitude or longitude into an instance of a Location.
     * 
     * FIXME - make these tests pass.
     */

    private Location location;

    @Test
    public void testValidConstructorValues() {
        location = new Location(25.0, 50.0);
        assertEquals(25.0, location.getLatitude(), 0.000001);
        assertEquals(50.0, location.getLongitude(), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLatitude() {
        /*
         * A null latitude doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(null, 50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLongitude() {
        /*
         * A null longitude doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25.0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLatitude() {
        /*
         * A latitude of 91 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(91.0, 50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLongitude() {
        /*
         * A longitude of 181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25.0, 181.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeLatitude() {
        /*
         * A latitude of -91 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(-91.0, 50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeLongitude() {
        /*
         * A longitude of -181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25.0, -181.0);
    }

}
