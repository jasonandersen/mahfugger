package com.palarran.mahfugger.location;

import java.util.List;

/**
 * Utilities for working with {@link Location} and {@link TrackPoint} objects.
 */
public class LocationUtils {

    /**
     * Private constructor.
     */
    private LocationUtils() {
        //no instantiation for you!
    }

    /**
     * Loads a list of {@link Location} objects from within a CSV file containing
     * latitudes and longitudes. Each line in the file will contain a numeric
     * latitude and numeric longitude separated by a comma.
     * @param path string containing the absolute path to the file
     * @return a list containing all the {@link Location} objects loaded from the
     *      file
     * @throws IllegalArgumentException when path is null
     */
    public static List<TrackPoint> loadTrackPointsFromFile(String path) {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
