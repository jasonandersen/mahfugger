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

    /*
     * EVERYTHING FROM HERE DOWN IS THROW AWAY CODE
     */

    private HaversineDistance dist = new HaversineDistance();

    @Test
    public void test() {
        dist.distance(48.0, -123.0, 50.0, 126.0);
    }

    private class HaversineDistance {

        /**
         * @param args
         * arg 1- latitude 1
         * arg 2 - latitude 2
         * arg 3 - longitude 1
         * arg 4 - longitude 2
         */
        public void distance(Double lat1, Double lon1, Double lat2, Double lon2) {
            final int R = 6371; // Radious of the earth
            Double latDistance = toRad(lat2 - lat1);
            Double lonDistance = toRad(lon2 - lon1);
            Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                    Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
                    Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
            Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            Double distance = R * c * 1000;

            System.out.println("The distance between two lat and long is::" + distance);

        }

        private Double toRad(Double value) {
            return value * Math.PI / 180;
        }

    }
}
