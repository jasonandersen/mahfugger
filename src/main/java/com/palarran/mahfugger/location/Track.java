package com.palarran.mahfugger.location;

import java.util.List;

/**
 * A track followed by a person or vehicle.
 * 
 * @author Jason Andersen (andersen.jason@gmail.com)
 */
public class Track {

    private final List<TrackPoint> points;

    /**
     * @param points
     */
    public Track(List<TrackPoint> points) {
        this.points = points;
    }

    /**
     * @return the number of track points in this track, will never return null but can
     *      return zero.
     */
    public int getNumberTrackPoints() {
        return points.size();
    }

    /**
     * @param index
     * @return the track point at the specified index
     */
    public TrackPoint getTrackPoint(int index) {
        return points.get(index);
    }

}
