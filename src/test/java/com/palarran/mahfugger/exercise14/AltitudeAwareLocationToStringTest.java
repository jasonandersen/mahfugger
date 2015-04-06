package com.palarran.mahfugger.exercise14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.AltitudeAwareLocation;

/**
 * Test that we can correctly calculate distances using altitude aware locations.
 */
public class AltitudeAwareLocationToStringTest {

    /*
     * AltitudeAwareLocation is a sub-class of Location. That is, AltitudeAwareLocation inherits
     * from Location. There are some behaviors that we are going to want to modify for this new
     * class. The first is toString().
     * 
     * FIXME - make these tests pass
     */

    private AltitudeAwareLocation location;

    @Test
    public void test1() {
        location = new AltitudeAwareLocation(47.89234, -123.456, 1234.0);
        assertEquals("47° 53' 32.424\" N 123° 27' 21.6\" W 1,234 meters", location.toString());
    }

    @Test
    public void test2() {
        location = new AltitudeAwareLocation(47.0, -123.0, 1234.0);
        assertEquals("47° N 123 W 1,234 meters", location.toString());
    }

}
