package com.palarran.mahfugger.exercise17;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.LocationUtils;
import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test the ability to load track points from a file.
 */
public class LoadTrackPointsFromFileTest {

    private final static String FILE_1 = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/coordinates.csv";

    private List<TrackPoint> points;

    @Before
    public void setup() {
        points = LocationUtils.loadTrackPointsFromFile(FILE_1);
    }

    /*
     * FIXME - make these tests pass
     */

    @Test(expected = IllegalArgumentException.class)
    public void testNullPath() {
        LocationUtils.loadTrackPointsFromFile(null);
    }

    @Test
    public void testLoadFile() {
        assertFalse(points.isEmpty());
    }

    @Test
    public void testCorrectNumberOfPoints() {
        assertEquals(5, points.size());
    }

    @Test
    public void testSecondPointIsCorrect() {
        TrackPoint second = points.get(0); //<-- should be 50.917278,-127.937508
        assertEquals(50.917278, second.getLatitude(), 0.000001);
        assertEquals(-127.937508, second.getLongitude(), 0.000001);
    }

    @Test
    public void testLastPointIsCorrect() {
        TrackPoint last = points.get(points.size() - 1); //<-- should be 89.234,-126.491
        assertEquals(89.234, last.getLatitude(), 0.001);
        assertEquals(-126.491, last.getLongitude(), 0.001);
    }
}
