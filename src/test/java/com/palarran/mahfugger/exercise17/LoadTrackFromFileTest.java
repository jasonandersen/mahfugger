package com.palarran.mahfugger.exercise17;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test the ability to load track points from a file.
 */
public class LoadTrackFromFileTest {

    private static final Logger log = Logger.getLogger(LoadTrackFromFileTest.class);

    /* 
     * FIXME - change this file path to your local drive
     */
    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private Track track;

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromFile(BULL_HARBOR_TO_SEA_OTTER);
    }

    /*
     * FIXME - make these tests pass
     */

    @Test(expected = IllegalArgumentException.class)
    public void testNullPath() throws IOException {
        TrackFactory.loadTrackFromFile(null);
    }

    @Test
    public void testCountTrackPoints() throws IOException {
        track = TrackFactory.loadTrackFromFile(BULL_HARBOR_TO_SEA_OTTER);
        assertEquals(2918, track.getNumberTrackPoints());
    }

    @Test
    public void testFirstTrackPoint() {
        TrackPoint expectedFirst = new TrackPoint(50.917278, -127.937508, "2013-07-08T13:18:39Z");
        TrackPoint actualFirst = track.getTrackPoint(0);
        assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void testGetTrackPointIllegalIndex() {
        //FIXME implement this!
    }

}
