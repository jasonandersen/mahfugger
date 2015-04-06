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
