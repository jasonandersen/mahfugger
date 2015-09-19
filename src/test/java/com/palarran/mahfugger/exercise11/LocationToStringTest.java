package com.palarran.mahfugger.exercise11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.palarran.mahfugger.location.Location;

/**
 * Test that the Location class is properly formatting itself.
 */
public class LocationToStringTest {

    /*
     * The toString() method of any instance should represent the current value of that instance.
     * In this case, we want to make sure the toString() method in the location class will format
     * the location in DD° MM' SS.S" H format.
     * 
     * FIXME - make these tests pass!
     */
    private Location location;

    @Test
    public void test1() {
        location = new Location(47.89234, -123.456);
        assertEquals("47° 53' 32.424\"N 123° 27' 21.6\"W", location.toString());
    }

    @Test
    public void test2() {
        location = new Location(47.0, -123.0);
        assertEquals("47°N 123°W", location.toString());
    }

    /*
     * ****** SPOILER ALERT - ONLY READ BELOW IF YOU'RE STUCK *******
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
     * HINT: override toString() in the Location class. Right now the Location class is inheriting the
     * toString() method from the Object class.
     * 
     * HINT: You probably started out with StringBuilder which is great. Much better than concatenating. However,
     * see the Javadocs for the java.util.Formatter class. Also look up printf() formatting in Evernote. It's
     * a really powerful way to format strings. I didn't commit the syntax to memory. Like regex, I have to look
     * it up anytime I do something complicated. But it's the tits when it comes to dynamic strings.
     * 
     * 
     * 
     * 
     * 
     */
}
