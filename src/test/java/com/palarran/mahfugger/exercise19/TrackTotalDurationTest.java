package com.palarran.mahfugger.exercise19;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.test.Paths;

/**
 * Test the ability to calculate the total time duration of a track.
 */
public class TrackTotalDurationTest {

    private Track track;

    /*
     * FIXME - make these tests pass
     */

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(Paths.BULL_HARBOR_TO_SEA_OTTER);
    }

    @Test
    public void testGetStartTime() {
        ZonedDateTime start = track.getStartTime();
        assertEquals("2013-07-08T13:18:39Z", start.format(DateTimeFormatter.ISO_INSTANT));
    }

    @Test
    public void testGetEndTime() {
        ZonedDateTime end = track.getEndingTime();
        assertEquals("2013-07-08T21:28:58Z", end.format(DateTimeFormatter.ISO_INSTANT));
    }

    @Test
    public void testTotalDuration() {
        Duration duration = track.getTotalDuration();
        assertEquals(29419, duration.getSeconds());
    }

}
