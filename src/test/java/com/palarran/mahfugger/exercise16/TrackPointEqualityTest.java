package com.palarran.mahfugger.exercise16;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test to see if equality is handled correctly for TrackPoint instances.
 */
public class TrackPointEqualityTest {

    /*
     * Equality means something different when it comes to TrackPoint objects. Override 
     * equals() and hashCode() for the TrackPoint class so they properly consider
     * equality using the timestamp as well as coordinates.
     * 
     * FIXME - make these tests pass!
     */

    private TrackPoint trackPointA;

    private TrackPoint trackPointB;

    private ZoneId timeZone = ZoneId.of("America/Los_Angeles");

    @Test
    public void testEquality() {
        trackPointA = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        trackPointB = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        assertTrue(trackPointA.equals(trackPointB));
        assertTrue(trackPointB.equals(trackPointA));
    }

    @Test
    public void testInequality() {
        trackPointA = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        trackPointB = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2014, 03, 2, 11, 0, 0, 0, timeZone));
        assertFalse(trackPointA.equals(trackPointB));
        assertFalse(trackPointB.equals(trackPointA));
    }

    @Test
    public void testEqualityHashcode() {
        trackPointA = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        trackPointB = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        assertTrue(trackPointA.hashCode() == trackPointB.hashCode());
    }

    @Test
    public void testInequalityHashcode() {
        trackPointA = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone));
        trackPointB = new TrackPoint(45.0, 90.0, ZonedDateTime.of(2014, 03, 2, 11, 0, 0, 0, timeZone));
        assertFalse(trackPointA.hashCode() == trackPointB.hashCode());
    }

    @Test
    public void testEqualityInSet() {
        Set<TrackPoint> uniqueLocations = new HashSet<TrackPoint>();
        uniqueLocations.add(new TrackPoint(45.0, 90.0, ZonedDateTime.of(2015, 04, 1, 12, 0, 0, 0, timeZone)));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, ZonedDateTime.of(2014, 04, 1, 12, 0, 0, 0, timeZone)));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, ZonedDateTime.of(2013, 04, 1, 12, 0, 0, 0, timeZone)));
        uniqueLocations.add(new TrackPoint(45.0, 90.0, ZonedDateTime.of(2013, 04, 1, 12, 0, 0, 0, timeZone))); //<-- duplicate

        assertEquals(3, uniqueLocations.size());

    }

}
