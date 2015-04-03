package com.palarran.mahfugger.location;

/**
 * Represents coordinates of a geophysical location. This is an immutable object.
 */
public class Location {

    private final Float latitude;

    private final Float longitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     */
    public Location(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return the latitude of the location, positive latitudes in the northern hemisphere and 
     *      negative latitudes in the southern hemisphere
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude of the location, positive longitudes in the eastern hemisphere and
     *      negative latitudes in the western hemisphere
     */
    public Float getLongitude() {
        return longitude;
    }

}
