package com.palarran.mahfugger.exercise09;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Test the ability of the Location class to calculate distance.
 */
public class LocationDistanceToTest {

    /*
     * Implement the Location.distanceTo() method using the Haversine method. Evernote has the
     * Haversine formula in it.
     * 
     * FIXME - make these tests pass!
     */

    private Location seattle;

    private Location testLocation;

    @Before
    public void setup() {
        seattle = new Location(48f, -123f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLocation() {
        /*
         * some clown sooner or later is going to pass in a null Location so let's make sure
         * we can handle it.
         */
        seattle.distanceTo(null);
    }

    @Test
    public void test1() {
        testLocation = new Location(50f, -126f);
        assertEquals(311965.9, seattle.distanceTo(testLocation), 0.1);
    }

    @Test
    public void test2() {
        testLocation = new Location(50f, 126f);
        assertEquals(7280106.2, seattle.distanceTo(testLocation), 0.1);
    }
}
