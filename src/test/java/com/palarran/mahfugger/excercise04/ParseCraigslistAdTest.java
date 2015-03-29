package com.palarran.mahfugger.excercise04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

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

    /*
     * Make these tests all pass.
     */

    @Test
    public void testPostingId() {
        String postingId = null;

        /*
         * FIXME - parse the ad's posting ID and store in the postingId variable
         */

        assertEquals("4836761369", postingId);
    }

    @Test
    public void testAttributes() {
        String fuel = null;
        String transmission = null;
        String condition = null;

        /* 
         * FIXME - parse the ad attributes
         */

        assertEquals(fuel, "gas");
        assertEquals(transmission, "other");
        assertEquals(condition, "excellent");
    }

    @Test
    public void testPostingDate() {
        String postingDate = null;

        /*
         * FIXME - parse the posting date
         */

        assertEquals("2015-01-07T11:37:47-0800", postingDate);
    }

    @Test
    public void testLastUpdatedDate() {
        String lastUpdatedDate = null;

        /*
         * FIXME - parse the date the ad was last updated
         */

        assertEquals("2015-01-28T17:41:09-0800", lastUpdatedDate);
    }

    @Test
    public void testAdText() {
        String adText = null;

        /*
         * FIXME - parse the text of the ad
         */

        assertTrue(adText.startsWith("Alpenlite Augusta Limited M-31RL ; Lots of Upgrades Oak Cabinetry"));
    }

    @Test
    public void testPrice() {
        String adPrice = "";

        /*
         * FIXME - parse the price for this ad
         */

        log.debug("adPrice = " + adPrice);
        assertEquals("$10500", adPrice);
    }

    @Test
    public void testLocation() {
        GeoLocation expectedLocation = new GeoLocation(47.1991f, -122.3151f);
        GeoLocation actualLocation = null;

        /*
         * FIXME - find the latitude and longitude of this Craigslist ad
         */

        log.debug(actualLocation);
        assertEquals(expectedLocation, actualLocation); //<-- How does Java know if these two separate instances of the
                                                        //    GeoLocation class are equal?
    }

    @Test
    public void testAdPhotos() {
        List<String> photoThumbUrls = new ArrayList<String>();

        /*
         * FIXME - parse the URLs for all the ad photo thumbnails and put them in this list
         */

        assertFalse(photoThumbUrls.isEmpty());
        assertEquals(15, photoThumbUrls.size());
        assertEquals("./index_files/00h0h_dUQA05Rb3N9_50x50c.jpg", photoThumbUrls.get(0));
        assertEquals("./index_files/00u0u_5UvoP9CQPAA_50x50c.jpg", photoThumbUrls.get(14));
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
