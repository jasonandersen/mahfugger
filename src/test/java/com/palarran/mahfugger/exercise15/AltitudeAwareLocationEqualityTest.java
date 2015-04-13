package com.palarran.mahfugger.exercise15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test to see if equality is handled correctly for AltitudeAwareLocation instances.
 */
public class AltitudeAwareLocationEqualityTest {

    /*
     * AltitudeAwareLocation inherits from Location which mean it inherits equals()
     * and hashCode() from Location. Those don't accurately represent equality for
     * this class since we added a third data element - altitude - that should be 
     * considered as part of equality.
     * 
     * FIXME - make these tests pass!
     */

    private TrackPoint locationA;

    private TrackPoint locationB;

    @Test
    public void testEquality() {
        locationA = new TrackPoint(45.0, 90.0, 100.0);
        locationB = new TrackPoint(45.0, 90.0, 100.0);
        assertTrue(locationA.equals(locationB));
        assertTrue(locationB.equals(locationA));
    }

    @Test
    public void testInequality() {
        locationA = new TrackPoint(45.0, 90.0, 100.0);
        locationB = new TrackPoint(45.0, 90.0, 99.0);
        assertFalse(locationA.equals(locationB));
        assertFalse(locationB.equals(locationA));
    }

    @Test
    public void testEqualityHashcode() {
        locationA = new TrackPoint(45.0, 90.0, 100.0);
        locationB = new TrackPoint(45.0, 90.0, 100.0);
        assertTrue(locationA.hashCode() == locationB.hashCode());
    }

    @Test
    public void testInequalityHashcode() {
        locationA = new TrackPoint(45.0, 90.0, 100.0);
        locationB = new TrackPoint(45.0, 90.0, 99.0);
        assertFalse(locationA.hashCode() == locationB.hashCode());
    }

    @Test
    public void testEqualityInSet() {
        Set<TrackPoint> uniqueLocations = new HashSet<TrackPoint>();
        uniqueLocations.add(new TrackPoint(45.0, 90.0, 100.0));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, 101.0));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, 102.0));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, 102.0)); //<-- duplicate

        assertEquals(3, uniqueLocations.size());

    }

}
