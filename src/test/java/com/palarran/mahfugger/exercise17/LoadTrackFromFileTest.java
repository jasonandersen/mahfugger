package com.palarran.mahfugger.exercise17;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;

/**
 * Test the ability to load track points from a file.
 */
public class LoadTrackFromFileTest {

    /* 
     * FIXME - change this file path to your local drive
     */
    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private Track track;

    @Before
    public void setup() {
        track = TrackFactory.loadTrackFromFile(BULL_HARBOR_TO_SEA_OTTER);
    }

    /*
     * FIXME - make these tests pass
     */

    @Test(expected = IllegalArgumentException.class)
    public void testNullPath() {
        TrackFactory.loadTrackFromFile(null);
    }

}
