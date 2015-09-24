package com.palarran.mahfugger.location;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

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
     * @param path string containing the absolute path to the file
     * @return a {@link Track} instance from the points in the file
     * @throws IOException when the file can't be read
     * @throws IllegalArgumentException when path is null
     * @see {@link DateTimeFormatter}
     */
    public static Track loadTrackFromCSVFile(String path) throws IOException {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
