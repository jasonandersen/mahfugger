package com.palarran.mahfugger.excercise04;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.palarran.mahfugger.GeoLocation;

/**
 * Parse different attributes of a Craiglist ad.
 */
public class ParseCraigslistAdTest {

    private static final Logger log = Logger.getLogger(ParseCraigslistAdTest.class);

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("file://localhost/Users/jason/dev/workspace/mahfugger/src/test/resources/craigslist/ads/4836761369/index.html");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testAttributes() {
        String fuel = null;
        String transmission = null;
        String condition = null;

        /* 
         * FIXME - make this test pass. Use Selenium to parse the attributes of this RV.
         */

        assertEquals(fuel, "gas");
        assertEquals(transmission, "other");
        assertEquals(condition, "excellent");
    }

    @Test
    public void testPrice() {
        String adPrice = "";

        /*
         * FIXME - make this test pass. Use Selenium to parse the price of the ad.
         */

        log.debug("adPrice = " + adPrice);
        assertEquals("$10500", adPrice);
    }

    @Test
    public void testLocation() {
        GeoLocation expectedLocation = new GeoLocation(47.1991f, -122.3151f);
        GeoLocation actualLocation = null;

        /*
         * FIXME - make this test pass. Use Selenium to parse the coordinates of the location of this ad.
         */

        log.debug(actualLocation);
        assertEquals(expectedLocation, actualLocation); //<-- How does Java know if these two separate instances of the
                                                        //    GeoLocation class are equal?
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
     * testPrice()
     * -----------
     * Investigate regular expressions to parse the price out of the ad's posting title.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * testLocation()
     * --------------
     * Look at the Google Maps URL in the HTML.
     * 
     * To determine equality, look at the equals() and hashcode() methods of the GeoLocation class.
     * 
     * 
     */

}
