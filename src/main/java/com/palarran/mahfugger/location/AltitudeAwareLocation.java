package com.palarran.mahfugger.location;

/**
 * Represents three-dimensional coordinates of a geophysical location.
 * This is an immutable object.
 */
public class AltitudeAwareLocation extends Location {

    private final Double altitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     * @param altitude in meters above sea level
     */
    public AltitudeAwareLocation(Double latitude, Double longitude, Double altitude) {
        super(latitude, longitude);
        this.altitude = altitude;
    }

    /**
     * @return the altitude
     */
    public Double getAltitude() {
        return altitude;
    }

}
