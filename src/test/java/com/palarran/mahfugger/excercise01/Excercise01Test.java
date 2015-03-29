package com.palarran.mahfugger.excercise01;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is a typical JUnit test class. In this class, we will open up a web
 * browser and read some simple data off the web page via the browser.
 */
public class Excercise01Test {

    /**
     * The WebDriver class represents an idealized web browser. This object
     * gives us access to control the web browser in question. All Selenium 
     * testing will go through a WebDriver instance.
     */
    private WebDriver driver;

    /**
     * The @Before annotation in a JUnit test is used to annotate a method that
     * you want to run before each test. Use this annotation to create setup 
     * methods that setup the environment for each of your tests to run. In this
     * example, we want to create an instance of the Firefox browser and make it
     * load a web page from the local drive.
     */
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

    /**
     * The @After annotation in a JUnit test is used to annotate a method that 
     * you want to run after each test. Use this annotation to tear down the 
     * environment after your test is complete. In this example, we want to make
     * sure the instance of the Firefox browser we created for the test gets shut 
     * down.
     */
    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * The @Test annotation indicates a method that is an actual test. Use static
     * assert methods from JUnit's org.junit.Assert class to perform the actual
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
         * 
         * HINT: read through the methods and Javadoc in the WebDriver class.
         */
        assertEquals("1998 Alpenlite M-31-RL Augusta 5th Wheel", pageTitle);
    }

}
