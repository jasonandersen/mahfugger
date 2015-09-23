package com.palarran.mahfugger.location;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Collection;

/**
 * A GPS track followed by a person or vehicle. A track consists of a series of
 * {@link TrackPoint}s.
 * 
 * @author Jason Andersen (andersen.jason@gmail.com)
 */
public class Track implements Locations {

    /**
     * Constructor
     * @param points
     */
    public Track(Collection<TrackPoint> points) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the number of track points in this track, will never return null but can
     *      return zero.
     */
    public int getNumberTrackPoints() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return a geographic rectangle that surrounds all of the points in this track
     */
    public GeographicBoundingBox getBoundingBox() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the total duration of time spent on the track
     */
    public Duration getTotalDuration() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the track point with the earliest timestamp
     */
    public TrackPoint getStartTrackPoint() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the track point with the latest timestamp
     */
    public TrackPoint getEndingTrackPoint() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the start time of this track
     */
    public ZonedDateTime getStartTime() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the ending time of this track
     */
    public ZonedDateTime getEndingTime() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the total distance traveled in this track in meters
     */
    public long getTotalDistanceInMeters() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return all {@link Location}s for this track
     * @see com.palarran.mahfugger.location.Locations#getLocations()
     */
    public Collection<Location> getLocations() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the minimum velocity between any two sequential track points
     */
    public double getMiniumVelocityInKnots() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the maximum velocity between any two sequential track points
     */
    public double getMaximumVelocity() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the average velocity over the entire track
     */
    public double getAverageVelocity() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the total distance traveled in this track in nautical miles
     */
    public double getTotalDistanceInNauticalMiles() {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
