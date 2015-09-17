package com.palarran.mahfugger.exercise18;

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

    private final static String BULL_HARBOR_TO_SEA_OTTER = "/Users/jason/dev/workspace/mahfugger/src/test/resources/files/bull-harbor-to-sea-otter-cove.csv";

    private GeographicBoundingBox box;

    private Track track;

    @Before
    public void setup() throws IOException {
        track = TrackFactory.loadTrackFromFile(BULL_HARBOR_TO_SEA_OTTER);
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

}
