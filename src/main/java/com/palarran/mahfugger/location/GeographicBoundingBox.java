package com.palarran.mahfugger.location;

/**
 * Represents an imaginary rectangle drawn around a group of {@link Location}s that contains
 * every {@link Location}.
 */
public class GeographicBoundingBox {

    /* 
     * You can choose to implement the logic to find the corners of the bounding box for these
     * locations in three different ways.
     * 
     * 1. Put the logic to find all the corners in the constructor and store the corners as member
     * variables. Then when any instance of GeographicBoundingBox is created, the corners are all 
     * resolved right away. This works great if collection of locations will never change.
     * 
     * 2. Put the logic for each corner in each getter method. So the logic to find the northeast 
     * corner would live in getNorthEastCorner(). That means every time you call getNorthEastCorner(),
     * you rerun your logic. That works well if the collection of locations changes but it gets 
     * expensive if you call it a lot and they don't ever change.
     * 
     * 3. Lazy loading. This means store the corners as member variables. But put the logic in each
     * getter method. So to find the northeast corner, you'd have logic in getNorthEastCorner() that
     * looks like so:
     *      have we identified the north east corner yet?
     *          return it
     *      else
     *          find it
     *          return it
     */

    /**
     * Constructor
     * @param locations - all locations that this bounding box draws a boundary around
     */
    public GeographicBoundingBox(Locations locations) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the northeast most corner of the bounding box
     */
    public Location getNorthEastCorner() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the northwest most corner of the bounding box
     */
    public Location getNorthWestCorner() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the southwest more corner of the bounding box
     */
    public Location getSouthWestCorner() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * @return the southeast more corner of the bounding box
     */
    public Location getSouthEastCorner() {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
