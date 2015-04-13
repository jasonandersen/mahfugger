package com.palarran.mahfugger.exercise14;

import static org.junit.Assert.assertEquals;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Test;

import com.palarran.mahfugger.location.TrackPoint;

/**
 * Test the toString() method on TrackPoint.
 */
public class TrackPointToStringTest {

    /*
     * TrackPoint inherits from Location which means right now, its toString() method is being inherited
     * from the Location class. Since we added a timestamp property to the class, override the toString()
     * method in TrackPoint to properly reflect the toString value we want.
     * 
     * FIXME - make these tests pass
     */

    private TrackPoint location;

    @Test
    public void test1() {
        ZonedDateTime timestamp = ZonedDateTime.of(2015, 4, 1, 12, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
        location = new TrackPoint(47.89234, -123.456, timestamp);
        assertEquals("4/1/2015 12:00:00PM PST 47° 53' 32.424\"N 123° 27' 21.6\"W", location.toString());
    }

    @Test
    public void test2() {
        ZonedDateTime timestamp = ZonedDateTime.of(2015, 4, 1, 12, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
        location = new TrackPoint(47.0, -123.0, timestamp);
        assertEquals("4/1/2015 12:00:00PM PST 47°N 123W", location.toString());
    }

    /*
     * ******************* SPOILER ALERT - ONLY SCROLL BELOW IF YOU'RE STUCK **********************
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
     * You can leverage the code you wrote for Location.toString() without having to rewrite it in TrackPoint.toString()
     * by calling super.toString(). That will call the parent class' version of toString(). That way in TrackPoint.toString()
     * all you have to focus on is how to format the timestamp.
     * 
     * 
     * 
     * 
     * 
     * 
     */

}
