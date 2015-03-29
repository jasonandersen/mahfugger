package com.palarran.mahfugger.excercise03;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is a typical Selenium test class. In this class, we will open up a web
 * browser and read some simple data off the web page via the browser.
 */
public class SimpleSeleniumTest {

    /**
     * The WebDriver class represents an idealized web browser. This object
     * gives us access to control the web browser in question. All Selenium 
     * testing will go through a WebDriver instance.
     */
    private WebDriver driver;

    @Before
    public void setup() {
        /*
         * This will create a new instance of a Firefox browser.
         */
        driver = new FirefoxDriver();
        /*
         * This will tell that Firefox instance to load this file URL from your hard
         * drive. Change this URL to your directory structure. At some point, I should
         * dynamically build this URL but file paths in Java are a pain in my dick and
         * I'm inherently lazy.
         */
        driver.get("file://localhost/Users/jason/dev/workspace/mahfugger/src/test/resources/craigslist/ads/4836761369/index.html");
    }

    @After
    public void tearDown() {
        /*
         * This will shut down the Firefox instance after each test.
         */
        driver.quit();
    }

    /**
     * Use static assert methods from JUnit's org.junit.Assert class to perform the actual
     * test assertions.
     */
    @Test
    public void testPostingTitle() {
        /*
         * A WebElement represents something within a web page's DOM (document object model).
         * Pretty much everything we do in web automation testing revolves around finding the 
         * right WebElement and then reading to it or interacting with it. In this case, we're
         * looking for any web element with a class name of "postingtitle". The first one we find,
         * we're going to assume is the one we're looking for.
         */
        WebElement title = driver.findElement(By.className("postingtitle"));
        String adTitle = title.getText();

        /*
         * Here I'm using the static assertEquals method from the org.junit.Assert class to make
         * sure the adTitle string is what I expected it to be. If they are equal, the test passes.
         * If not - failure pile. Delicious potato-ey failure pile.
         */
        assertEquals("1998 Alpenlite M-31-RL Augusta 5th Wheel - $10500 (Puyallup)", adTitle);
    }

    /**
     * Finish this test to verify that the <title> element on the page is what we expect it to be.
     */
    @Test
    public void testPageTitle() {
        String pageTitle = "";
        /*
         * FIXME - Write some code here that will find the text of the <title> element on the web page and
         * store it in the pageTitle variable. 
         */
        assertEquals("1998 Alpenlite M-31-RL Augusta 5th Wheel", pageTitle);
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
     * testPageTitle()
     * ---------------
     * Read through the methods and Javadoc in the WebDriver class.
     * 
     * 
     * 
     * 
     * 
     * 
     */

}
