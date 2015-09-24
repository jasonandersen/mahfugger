package com.palarran.mahfugger.location;

/**
 * This exception indicates that coordinates passed in to a Location's constructor
 * are invalid.
 */
public class InvalidCoordinatesException extends RuntimeException {

    private final Double latitude;

    private final Double longitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     */
    public InvalidCoordinatesException(Double latitude, Double longitude, String message) {
        super(message); //<-- What does this mean?
        this.latitude = latitude;
        this.longitude = longitude;
        /*
         * Why isn't the message argument being stored in this class?
         */
    }

    /**
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

}
