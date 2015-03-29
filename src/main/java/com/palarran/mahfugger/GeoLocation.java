package com.palarran.mahfugger;

/**
 * Represents coordinates of a geophysical location.
 */
public class GeoLocation {

    private final Float latitude;

    private final Float longitude;

    /**
     * Constructor.
     * @param latitude
     * @param longitude
     */
    public GeoLocation(Float latitude, Float longitude) {
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

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("latitude=%f longitude=%f", latitude, longitude);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GeoLocation other = (GeoLocation) obj;
        if (latitude == null) {
            if (other.latitude != null) {
                return false;
            }
        } else if (!latitude.equals(other.latitude)) {
            return false;
        }
        if (longitude == null) {
            if (other.longitude != null) {
                return false;
            }
        } else if (!longitude.equals(other.longitude)) {
            return false;
        }
        return true;
    }

}
