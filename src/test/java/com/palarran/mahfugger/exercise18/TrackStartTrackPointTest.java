package com.palarran.mahfugger.exercise18;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test the starting track point and ending track point of a track.
 */
public class TrackStartTrackPointTest {
    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private Track track;

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(BULL_HARBOR_TO_SEA_OTTER);
    }

    /*
     * FIXME - make these tests pass
     */

    @Test
    public void testFirstTrackPoint() {
        TrackPoint expectedStart = new TrackPoint(50.917278, -127.937508, "2013-07-08T13:18:39Z");
        TrackPoint actualStart = track.getStartTrackPoint();
        assertEquals(expectedStart, actualStart);
    }

    @Test
    public void testLastTrackPoint() {
        TrackPoint expectedStart = new TrackPoint(50.677971, -128.351074, "2013-07-08T21:28:58Z");
        TrackPoint actualStart = track.getEndingTrackPoint();
        assertEquals(expectedStart, actualStart);
    }

    /*
     * ****** SPOILER ALERT - ONLY READ BELOW IF YOU'RE STUCK ******* 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * These tests are going to fail unless you sort the track points properly in the Track constructor.
     * Don't take the easy way out and change the CSV file. Sort those bitches.
     *
     * In the Track class constructor, you need to load the track points into a member variable. However, you
     * can't assume that they are in the right order when they get passed in so you'll need to sort them. 
     * If you make the TrackPoint class implement the Comparable<TrackPoint> interface, you can setup TrackPoint 
     * objects so they naturally sort by timestamp. Then you can just add all the TrackPoint instances
     * to a SortedSet implementation and you will inherently get a sorted collection.
     * 
     * 
     */
}
