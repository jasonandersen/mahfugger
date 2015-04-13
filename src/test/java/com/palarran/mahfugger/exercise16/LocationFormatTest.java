package com.palarran.mahfugger.exercise16;

import static org.junit.Assert.assertEquals;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;
import com.palarran.mahfugger.location.LocationFormat;
import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test to ensure Locations are properly formatted.
 */
public class LocationFormatTest {

    /*
     * LocationFormat is an enum that represents the only possible location formatting options
     * for a Location class. Enum are objects however and they can contain both data and behavior.
     * Each enumeration in an enum class is it's own instance of that class. So for LocationFormat,
     * we're using the different instances to contain the algorithm for the formatting. This is a
     * clean way to house Location formatting code in one spot without kludgy if/else blocks or 
     * select blocks.
     * 
     * FIXME - make these tests pass!
     */

    private LocationFormat format;

    private Location location = new Location(47.89234, -123.456);

    @Test
    public void testDegMinSec() {
        format = LocationFormat.DEGREES_MINS_SECS;
        assertEquals("47° 53' 32.424\"N 123° 27' 21.6\"W", format.format(location));
    }

    @Test
    public void testDegMin() {
        format = LocationFormat.DEGREES_MINS;
        assertEquals("47° 53.5404'N 123° 27.36'W", format.format(location));
    }

    @Test
    public void testDeg() {
        format = LocationFormat.DEGREES;
        assertEquals("47.89234°N 123.456°W", format.format(location));
    }

    @Test
    public void testTrackPointFormat() {
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        TrackPoint point = new TrackPoint(47.89234, -123.456, ZonedDateTime.of(2015, 4, 1, 12, 0, 0, 0, zone));
        format = LocationFormat.DEGREES_MINS_SECS;
        assertEquals("47° 53' 32.424\"N 123° 27' 21.6\"W", format.format(point));
        /*
         * Why does Java let me pass in a TrackPoint to LocationFormat.format(Location)?
         */
    }

    /*
     * ************************** SPOILER ALERT **************************
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * Refactor Location.toString() method to use LocationFormat.DEG_MIN_SEC.format(this) 
     * That way this logic only ever exists in a single place. Any logic that exists in
     * more than one place is a way for defects to propogate through your code in a way
     * that is unbelievably frustrating to fix.
     * 
     * 
     */
}
