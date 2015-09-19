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
     * I'm using enums to indicate which hemisphere the latitude is in and which hemisphere
     * the longitude is in. Enums (short for enumerated value) is the best way to handle a
     * value that can be only one of a finite list of values. In this instance, a latitudinal
     * hemisphere can only be either NORTHERN or SOUTHERN. If we use a String to hold that value
     * with "N" and "S" as expected values, there's nothing to say some assknuckle couldn't 
     * come along and store "FU" in there instead. Using an enum restricts us to just valid
     * values. Whenever you're faced with a data type with a finite list of values, make an
     * enum. Trust me, you'll be happier that you did.
     * 
     * FIXME - make these tests pass!
     */

    private Location target;

    @Test
    public void testNorthWest1() {
        target = new Location(50.0, -100.0);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testNorthWest2() {
        target = new Location(0.1, -0.1);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testNorthWest3() {
        target = new Location(90.0, -180.0);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testNorthEast1() {
        target = new Location(50.0, 100.0);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testNorthEast2() {
        target = new Location(0.1, 0.1);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testNorthEast3() {
        target = new Location(90.0, 180.0);
        assertEquals(LatitudinalHemisphere.NORTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testSouthWest1() {
        target = new Location(-50.0, -100.0);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testSouthWest2() {
        target = new Location(-0.1, -0.1);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testSouthWest3() {
        target = new Location(-90.0, -180.0);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.WESTERN, target.getLongitudinalHemisphere());
    }

    @Test
    public void testSouthEast1() {
        target = new Location(-50.0, 100.0);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testSouthEast2() {
        target = new Location(-0.1, 0.1);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

    @Test
    public void testSouthEast3() {
        target = new Location(-90.0, 180.0);
        assertEquals(LatitudinalHemisphere.SOUTHERN, target.getLatitudinalHemisphere());
        assertEquals(LongitudinalHemisphere.EASTERN, target.getLongitudinalHemisphere());

    }

}
