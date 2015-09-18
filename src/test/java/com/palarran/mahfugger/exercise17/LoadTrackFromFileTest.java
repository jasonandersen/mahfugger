package com.palarran.mahfugger.exercise17;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.location.TrackPoint;

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
        TrackPoint actualFirst = track.getFirstTrackPoint();
        assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void testLastTrackPoint() {
        TrackPoint expectedLast = new TrackPoint(50.677971, -128.351074, "2013-07-08T21:28:58Z");
        TrackPoint actualLast = track.getLastTrackPoint();
        assertEquals(expectedLast, actualLast);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetTrackPointIllegalIndex() {
        track.getTrackPoint(-1);
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
     * If you're struggling with how to load the file, here's how I implemented the code.
    
            Loads track points from file.
            @param path
            @return a list of track points
            @throws IOException 
            private static List<TrackPoint> loadTrackPointsFromFile(String path) throws IOException {
                List<TrackPoint> points = new LinkedList<TrackPoint>();
                BufferedReader reader = new BufferedReader(new FileReader(path));
                try {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        TrackPoint point = parseTrackPoint(line);
                        points.add(point);
                    }
                } finally {
                    reader.close();
                }
                return points;
            }
        
            @param line
            @return a TrackPoint parsed from a line from the file.
            private static TrackPoint parseTrackPoint(String line) {
                String[] fields = line.split(",");
                Double latitude = Double.parseDouble(fields[0]);
                Double longitude = Double.parseDouble(fields[1]);
                return new TrackPoint(latitude, longitude, fields[2]);
            }
     * 
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
