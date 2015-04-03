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
        location = new Location(25f, 50f);
        assertEquals(25f, location.getLatitude(), 0.000001);
        assertEquals(50f, location.getLongitude(), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLatitude() {
        /*
         * A null latitude doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(null, 50f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLongitude() {
        /*
         * A null longitude doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25f, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLatitude() {
        /*
         * A latitude of 181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(181f, 50f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLongitude() {
        /*
         * A longitude of 181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25f, 181f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeLatitude() {
        /*
         * A latitude of -181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(-181f, 50f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeLongitude() {
        /*
         * A longitude of -181 degrees doesn't make sense. Should throw an IllegalArgumentException.
         */
        location = new Location(25f, -181f);
    }

}
