package com.palarran.mahfugger.location;

/**
 * Different formatting options for {@link Location} instances.
 */
public enum LocationFormat {
    /**
     * Example: 47° 36' 23.2"N 127° 12' 24.6"W
     */
    DEGREES_MINS_SECS {
        @Override
        public String format(Location location) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    },
    /**
     * Example: 47° 36.425'N 127° 12.475'W
     */
    DEGREES_MINS {
        @Override
        public String format(Location location) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    },
    /**
     * Example: 47.582°N 127.2391°W
     */
    DEGREES {
        @Override
        public String format(Location location) {
            throw new UnsupportedOperationException("not implemented yet");
        }
    };

    /*
     * The following abstract method tells Java that each enumeration instance must
     * provide its own implementation of the format(Location) method.
     */

    /**
     * Formats the location based on the specified format.
     * @param location
     * @return a formatted string for the location
     * @throws IllegalArgumentException when location is null
     */
    public abstract String format(Location location);

}
