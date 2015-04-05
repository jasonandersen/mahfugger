package com.palarran.mahfugger.exercise10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.LatitudinalHemisphere;
import com.palarran.mahfugger.location.Location;
import com.palarran.mahfugger.location.LongitudinalHemisphere;

/**
 * Test that we can correctly determine the right hemisphere for a location.
 */
public class LocationHemisphereTest {

    /*
     * FIXME - make these tests pass!
     */

    private Location target;

    @Test
    public void testNorthWest() {
        target = new Location(50f, -100f);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testNorthEast() {
        target = new Location(50f, 100f);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testSouthWest() {
        target = new Location(-50f, -100f);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testSouthEast() {
        target = new Location(-50f, 100f);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

}
