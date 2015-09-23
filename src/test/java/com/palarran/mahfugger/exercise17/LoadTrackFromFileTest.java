package com.palarran.mahfugger.exercise17;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.palarran.mahfugger.location.Track;
import com.palarran.mahfugger.location.TrackFactory;
import com.palarran.mahfugger.test.Paths;

/**
 * Test the ability to load track points from a file.
 */
public class LoadTrackFromFileTest {

    /* 
     * Now that we understand track points, I want to be able to aggregate all my track points
     * into a single Track object. This single Track object is going to give me information
     * about my entire GPS track, not just a single point.
     * 
     * I store all the data points for Tracks in a CSV file. I want to be able to load all of 
     * those track points in the CSV file into a single Track object. This particular track 
     * file came from our run around Cape Scott in 2013. I captured locations every 10 seconds.
     * 
     * FIXME - make these tests pass
     */

    private Track track;

    @Before
    public void setup() throws IOException {
        /*
         * FIXME - right now these paths are hardcoded to paths on my hard drive. Go into the Paths
         * class and change the PATH_ROOT constant to the directory that your project is stored in. 
         */
        track = TrackFactory.loadTrackFromCSVFile(Paths.BULL_HARBOR_TO_SEA_OTTER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPath() throws IOException {
        TrackFactory.loadTrackFromCSVFile(null);
    }

    @Test
    public void testCountTrackPoints() {
        assertEquals(2918, track.getNumberTrackPoints());
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
     * If you're struggling with how to load the file, here's how I implemented the code.
    
            //Loads track points from file.
            //@param path
            //@return a list of track points
            //@throws IOException 
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
                    reader.close(); //<-- make sure the reader is closed regardless of what happens!
                }
                return points;
            }
        
            //@param line
            //@return a TrackPoint parsed from a line from the file.
            private static TrackPoint parseTrackPoint(String line) {
                String[] fields = line.split(",");
                Double latitude = Double.parseDouble(fields[0]);
                Double longitude = Double.parseDouble(fields[1]);
                String timestamp = fields[2];
                return new TrackPoint(latitude, longitude, timestamp);
            }
     * 
     */

}
