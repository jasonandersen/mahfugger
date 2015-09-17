package com.palarran.mahfugger.location;

import java.util.Collection;

/**
 * A collection of {@link Location}s.
 */
public interface Locations {

    /**
     * @return a collection of {@link Location} objects. No sort order is specified. Cannot return null.
     */
    public Collection<Location> getLocations();
}
