package com.palarran.mahfugger.location;

/**
 * Indicates which longitudinal hemisphere a location is in.
 */
public enum LongitudinalHemisphere {
    EASTERN("E"),
    WESTERN("W");

    private final String alias;

    private LongitudinalHemisphere(String alias) {
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
