package com.palarran.mahfugger.location;

/**
 * This exception indicates that coordinates passed in to a Location's constructor
 * are invalid.
 */
public class InvalidCoordinatesException extends RuntimeException {

    private final Float latitude;

    private final Float longitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     */
    public InvalidCoordinatesException(Float latitude, Float longitude, String message) {
        super(message);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

}
