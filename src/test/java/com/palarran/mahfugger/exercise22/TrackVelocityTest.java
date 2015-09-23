package com.palarran.mahfugger.exercise22;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.test.Paths;

/**
 * Test the ability to calculate velocities for the entire track.
 */
public class TrackVelocityTest {

    private Track track;

    /*
     * FIXME - make these tests pass
     */

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(Paths.BULL_HARBOR_TO_SEA_OTTER);
    }

    @Test
    public void testMinVelocity() {
        assertEquals(0.0, track.getMiniumVelocityInKnots(), 0.1);
    }

}
