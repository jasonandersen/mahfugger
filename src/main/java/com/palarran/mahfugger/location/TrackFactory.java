package com.palarran.mahfugger.location;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

/**
 * Factory class to create {@link Track} instances.
 */
public class TrackFactory {

    /**
     * Private constructor.
     */
    private TrackFactory() {
        //no instantiation for you!
    }

    /**
     * Builds a {@link Track} object from a CSV file containing
     * latitudes, longitudes and timestamps. Each line in the file will contain a numeric
     * latitude, numeric longitude and timestamp (in ISO_INSTANT format) separated by a comma. 
     * The list will be ordered by appearance in the file.
     * @param path string containing the absolute path to the file
     * @return a {@link Track} instance from the points in the file
     * @throws IOException when the file can't be read
     * @throws IllegalArgumentException when path is null
     * @see {@link DateTimeFormatter}
     */
    public static Track loadTrackFromFile(String path) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("bleh");
        }
        List<TrackPoint> points = loadTrackPointsFromFile(path);
        return new Track(points);
    }

    /**
     * Loads track points from file.
     * @param path
     * @return a list of track points
     * @throws IOException 
     */
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

    /**
     * @param line
     * @return a TrackPoint parsed from a line from the file.
     */
    private static TrackPoint parseTrackPoint(String line) {
        String[] fields = line.split(",");
        Double latitude = Double.parseDouble(fields[0]);
        Double longitude = Double.parseDouble(fields[1]);
        return new TrackPoint(latitude, longitude, fields[2]);
    }
}
