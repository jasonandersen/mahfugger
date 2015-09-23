package com.palarran.mahfugger.exercise21;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.test.Paths;

/**
 * Test the ability to calculate the total distance traveled of a {@link Track}.
 */
public class TrackTotalDistanceTest {

    private Track track;

    /*
     * FIXME - make these tests pass
     */

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(Paths.BULL_HARBOR_TO_SEA_OTTER);
    }

    @Test
    public void testTotalDistanceMeters() {
        assertEquals(71514.0, track.getTotalDistanceInMeters(), 100);
    }

    @Test
    public void testTotalDistanceNM() {
        assertEquals(38.614, track.getTotalDistanceInNauticalMiles(), .25);
    }

}
