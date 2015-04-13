package com.palarran.mahfugger.exercise17;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

import com.palarran.mahfugger.location.LocationUtils;
import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test the ability to load track points from a file.
 */
public class LoadTrackPointsFromFileTest {

    private final static String FILE_1 = "/path/to/file/1";

    /*
     * FIXME - make these tests pass
     */

    @Test
    public void testLoadFile() {
        List<TrackPoint> points = LocationUtils.loadTrackPointsFromFile(FILE_1);
        assertFalse(points.isEmpty());
    }
}
