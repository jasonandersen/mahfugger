package com.palarran.mahfugger.location;

import java.time.ZonedDateTime;

/**
 * Represents a point on a track. It includes the latitude, longitude and the point in time
 * recorded at that location. This is an immutable object.
 */
public class TrackPoint extends Location {

    private final ZonedDateTime timestamp;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     * @param altitude in meters above sea level
     */
    public TrackPoint(Double latitude, Double longitude, ZonedDateTime timestamp) {
        super(latitude, longitude);
        this.timestamp = timestamp;
    }

    /**
     * @return the timestamp
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

}
