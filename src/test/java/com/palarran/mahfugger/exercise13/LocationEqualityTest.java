package com.palarran.mahfugger.exercise13;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Ensure the Location class can handle equality correctly.
 */
public class LocationEqualityTest {

    /*
     * A class can determine it's own algorithm for equality. Here we're going to ensure that the
     * Location class correctly determines equality. In Java, in order to check equality, we use 
     * two different methods:
     *      equals()
     *      hashcode()
     * 
     * We'll test both of these for the Location class to make sure they are functioning ok.
     * 
     * FIXME - make these tests pass
     */

    private Location locationA;

    private Location locationB;

    @Test
    public void testEquality() {
        locationA = new Location(45.0, 90.0);
        locationB = new Location(45.0, 90.0);
        /*
         * These two instances both have the same latitudes and longitudes so they should be 
         * considered equal.
         */
        assertTrue(locationA.equals(locationB));
        /*
         * Java equals() methods must be transitive. In other words, if a == b, then b == a.
         */
        assertTrue(locationB.equals(locationA));
    }

    @Test
    public void testInequality() {
        locationA = new Location(45.0, -90.0);
        locationB = new Location(45.0, 90.0);
        /*
         * These two instances have different latitudes and longitudes so they should be
         * considered inequal.
         */
        assertFalse(locationA.equals(locationB));
        assertFalse(locationB.equals(locationA));
    }

    @Test
    public void testNull() {
        locationA = new Location(45.0, 90.0);
        /*
         * Passing a null into equals() should always return false.
         */
        assertFalse(locationA.equals(null));
    }

    @Test
    public void testEqualityHashcode() {
        locationA = new Location(45.0, 90.0);
        locationB = new Location(45.0, 90.0);
        /*
         * These two instances both have the same latitudes and longitudes so they should return 
         * the same hashcode.
         */
        assertTrue(locationA.hashCode() == locationB.hashCode());
    }

    @Test
    public void testInequalityHashcode() {
        locationA = new Location(45.0, -90.0);
        locationB = new Location(45.0, 90.0);
        /*
         * These two instances have different latitudes and longitudes so they should return
         * different hashcodes.
         */
        assertFalse(locationA.hashCode() == locationB.hashCode());
    }

    @Test
    public void testEqualityInSet() {
        /*
         * Sets contain a unique collection of objects. Any object placed in a set must
         * be considered unique from all the other objects with in the Set. Here we're going
         * to check that equals() and hashCode() work correctly within the context of a Set.
         */
        Set<Location> uniqueLocations = new HashSet<Location>();
        uniqueLocations.add(new Location(45.0, 90.0));
        uniqueLocations.add(new Location(45.1, 90.0));
        uniqueLocations.add(new Location(45.2, 90.0));
        uniqueLocations.add(new Location(45.2, 90.0)); //<-- duplicate, should not store

        /*
         * The fourth location was a duplicate so it should not have been stored.
         */
        assertEquals(3, uniqueLocations.size());
    }

}
