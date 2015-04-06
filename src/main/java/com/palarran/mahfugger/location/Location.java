package com.palarran.mahfugger.location;

/**
 * Represents two-dimensional coordinates of a geophysical location. 
 * This is an immutable object.
 */
public class Location {

    /**
     * Static constant representing the location of the Sloop Tavern.
     */
    private final static Location THE_SLOOP = new Location(47.668772, -122.394300);

    private final Double latitude;

    private final Double longitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     */
    public Location(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return the latitude of the location, positive latitudes in the northern hemisphere and 
     *      negative latitudes in the southern hemisphere
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude of the location, positive longitudes in the eastern hemisphere and
     *      negative longitudes in the western hemisphere
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Calculates the shortest distance along the Earth's surface (ignoring altitude) between two
     * locations.
     * @param that the other location to calculate distance to
     * @return a number in meters representing the distance between the two points
     */
    public Double distanceTo(Location that) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Determines if this location is in the northern or southern hemisphere.
     * @return an enum indicating which hemisphere this location is in.
     */
    public LatitudinalHemisphere getLatitudinalHemisphere() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Determines if this location is in the eastern or western hemisphere.
     * @return an enum indicating which hemisphere this location is in.
     */
    public LongitudinalHemisphere getLongitudinalHemisphere() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * Calculates the shortest distance along the Earth's surface (ignoring altitude) between
     * this location and the location of the Sloop Tavern in Ballard, WA.
     * @return distance in meters
     */
    public Double distanceFromTheSloop() {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
