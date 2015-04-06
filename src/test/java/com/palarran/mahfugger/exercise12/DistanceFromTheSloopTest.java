package com.palarran.mahfugger.exercise12;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Test the ability to calculate the distance from the Sloop Tavern.
 */
public class DistanceFromTheSloopTest {

    /*
     * FIXME - make these tests pass
     */

    private Location target;

    @Test
    public void test1() {
        target = new Location(51.0, -128.0);
        assertEquals(549439.3, target.distanceFromTheSloop(), 100);
    }

    @Test
    public void test2() {
        target = new Location(-51.0, -128.0);
        assertEquals(10984530.3, target.distanceFromTheSloop(), 100);
    }

}
