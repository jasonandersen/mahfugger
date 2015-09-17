package com.palarran.mahfugger.location;

import java.util.Collection;
import java.util.List;

/**
 * A track followed by a person or vehicle.
 * 
 * @author Jason Andersen (andersen.jason@gmail.com)
 */
public class Track implements Locations {

    /**
     * @param points
     */
    public Track(List<TrackPoint> points) {
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
     * @param index
     * @return the track point at the specified index
     */
    public TrackPoint getTrackPoint(int index) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @see com.palarran.mahfugger.location.Locations#getLocations()
     */
    public Collection<Location> getLocations() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return a geographic rectangle that surrounds all of the points in this track
     */
    public GeographicBoundingBox getBoundingBox() {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
