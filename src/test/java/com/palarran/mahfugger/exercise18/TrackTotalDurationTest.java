package com.palarran.mahfugger.exercise18;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;

/**
 * Test the ability to calculate the total time duration of a track.
 */
public class TrackTotalDurationTest {

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
     * These tests are going to fail unless you sort the track points properly in the Track constructor.
     * Don't take the easy way out and change the CSV file. Sort those bitches.
     * 
     * 
     */
}
