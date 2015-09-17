package com.palarran.mahfugger.location;

import java.time.ZonedDateTime;

/**
 * Represents a point on a track. It includes the latitude, longitude and the point in time
 * recorded at that location. This is an immutable object.
 */
public class TrackPoint extends Location {

    /*
     * Why does this member variable have the final keyword on it?
     */
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
     * Overloaded onstructor that will parse timestamps in ISO_FORMAT
     * @param latitude
     * @param longitude
     * @param timestampText - timestamp in the ISO_INSTANT format
     */
    public TrackPoint(Double latitude, Double longitude, String timestampText) {
        super(latitude, longitude);
        this.timestamp = parseTimeStamp(timestampText);
        /*
         * Why is it OK to have two different constructors?
         * Why would I want to have two different constructors?
         */
    }

    /**
     * @param timestamp2
     * @return
     */
    private ZonedDateTime parseTimeStamp(String timestampText) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the timestamp
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

}
