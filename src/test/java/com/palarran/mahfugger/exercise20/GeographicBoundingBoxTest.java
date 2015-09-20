package com.palarran.mahfugger.exercise20;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.GeographicBoundingBox;
import com.palarran.mahfugger.location.Location;
import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;

/**
 * Test the ability to find the bounding box around a group of locations.
 */
public class GeographicBoundingBoxTest {

    /*
     * A bounding box is a rectangle drawn around a group of locations that contains every
     * location inside the rectangle. This is useful for things like drawing a track on
     * Google Maps. Google Maps needs to know the bounding box for the area you need to display
     * to show every single location.
     * 
     * FIXME - make this test pass
     */

    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private GeographicBoundingBox box;

    private Track track;

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromCSVFile(BULL_HARBOR_TO_SEA_OTTER);
        box = track.getBoundingBox();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullConstructorArgument() {
        box = new GeographicBoundingBox(null);
    }

    @Test
    public void testNECorner() {
        Location expected = new Location(50.917759, -127.931114);
        assertEquals(expected, box.getNorthEastCorner());
    }

    @Test
    public void testNWCorner() {
        Location expected = new Location(50.917759, -128.501556);
        assertEquals(expected, box.getNorthWestCorner());
    }

    @Test
    public void testSWCorner() {
        Location expected = new Location(50.653496, -128.501556);
        assertEquals(expected, box.getSouthWestCorner());
    }

    @Test
    public void testSECorner() {
        Location expected = new Location(50.653496, -127.931114);
        assertEquals(expected, box.getSouthEastCorner());
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
     * How do you find the north east most corner? What defines the north east corner is that it's latitude
     * is the latitude of the trackpoint with the maximum latitude and its longitude is the longitude of 
     * the trackpoint with the maximum longitude.
     * 
     * Northwest corner? Maximum latitude, minimum longitude.
     * 
     * Southwest corner? Minimum latitude, minimum longitude.
     * 
     * Southeast corner? Minimum latitude, maximum longitude.
     * 
     * For extra credit, can you write your algorithm so you only loop through the trackpoints one time to
     * find all four points?
     * 
     */
}
