package com.palarran.mahfugger.location;

/**
 * Indicates which latitudinal hemisphere a location is in.
 */
public enum LatitudinalHemisphere {
    SOUTHERN("S"),
    NORTHERN("N");

    private final String alias;

    private LatitudinalHemisphere(String alias) {
        this.alias = alias;
    }

    /**
     * The alias for the hemisphere can be useful when formatting locations 
     * into readable strings.
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

}
