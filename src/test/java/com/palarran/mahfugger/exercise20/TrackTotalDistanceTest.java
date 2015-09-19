package com.palarran.mahfugger.exercise20;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;

/**
 * Test the ability to calculate the total distance of a {@link Track}.
 */
public class TrackTotalDistanceTest {

    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private Track track;

    /*
     * FIXME - make these tests pass
     */

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(BULL_HARBOR_TO_SEA_OTTER);
    }

    @Test
    public void testTotalDistance() {
        assertEquals(99999, track.getTotalDistance()); //FIXME - calculate this distance!!
    }

}
