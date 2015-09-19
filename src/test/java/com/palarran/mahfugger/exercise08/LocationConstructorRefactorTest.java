package com.palarran.mahfugger.exercise08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.palarran.mahfugger.location.InvalidCoordinatesException;
import com.palarran.mahfugger.location.Location;

/**
 * Test that the Location constructor has been refactored to use a custom exception.
 */
public class LocationConstructorRefactorTest {

    /*
     * When an attempt is made to instantiate a Location instance with invalid coordinates,
     * right now we throw an IllegalArgumentException. However, that exception doesn't tell
     * us much about what the problem is. If we want to know more about the exception and
     * possibly recover from it, lets refactor Location to use a custom exception that tells
     * us what the problem is and a message that is much more specific to the exception condition.
     * 
     * FIXME - make these tests pass!
     */

    private Location location;

    @Test
    public void testNullLatitude() {
        try {
            location = new Location(null, 50.0);
            fail("No exception was thrown when a null latitude was passed in.");
        } catch (InvalidCoordinatesException e) {
            /*
             * Let's make sure the exception is populated as expected.
             */
            assertNull(e.getLatitude());
            assertEquals(50.0, e.getLongitude(), 0.00001);
            assertEquals(e.getMessage(), "A location's latitude cannot be null.");
        } catch (Exception e) {
            /*
             * The wrong exception was thrown.
             */
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

    @Test
    public void testNullLongitude() {
        try {
            location = new Location(25.0, null);
            fail("No exception was thrown when a null longitude was passed in.");
        } catch (InvalidCoordinatesException e) {
            assertNull(e.getLongitude());
            assertEquals(25f, e.getLatitude(), 0.00001);
            assertEquals(e.getMessage(), "A location's longitude cannot be null.");
        } catch (Exception e) {
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

    @Test
    public void testLatitudeTooLarge() {
        try {
            location = new Location(90.1, 50.0);
            fail("No exception was thrown when a latitude was passed in that was too large.");
        } catch (InvalidCoordinatesException e) {
            assertEquals(90.1, e.getLatitude(), 0.00001);
            assertEquals(50.0, e.getLongitude(), 0.00001);
            assertEquals(e.getMessage(),
                    "Latitude (90.1) must be less than or equal to 90 degrees and greater than or equal to -90 degrees.");
        } catch (Exception e) {
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

    @Test
    public void testLatitudeTooSmall() {
        try {
            location = new Location(-90.1, 50.0);
            fail("No exception was thrown when a latitude was passed in that was too small.");
        } catch (InvalidCoordinatesException e) {
            assertEquals(-90.1, e.getLatitude(), 0.00001);
            assertEquals(50.0, e.getLongitude(), 0.00001);
            assertEquals(e.getMessage(),
                    "Latitude (-90.1) must be less than or equal to 90 degrees and greater than or equal to -90 degrees.");
        } catch (Exception e) {
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

    @Test
    public void testLongtideTooLarge() {
        try {
            location = new Location(25.0, 180.1);
            fail("No exception was thrown when a longitude was passed in that was too large.");
        } catch (InvalidCoordinatesException e) {
            assertEquals(180.1, e.getLongitude(), 0.00001);
            assertEquals(25.0, e.getLatitude(), 0.00001);
            assertEquals(e.getMessage(),
                    "Longitude (180.1) must be less than or equal to 180 degrees and greater than or equal to -180 degrees.");
        } catch (Exception e) {
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

    @Test
    public void testLongtideTooSmall() {
        try {
            location = new Location(25.0, -180.1);
            fail("No exception was thrown when a longitude was passed in that was too small.");
        } catch (InvalidCoordinatesException e) {
            assertEquals(-180.1, e.getLongitude(), 0.00001);
            assertEquals(25.0, e.getLatitude(), 0.00001);
            assertEquals(e.getMessage(),
                    "Longitude (-180.1) must be less than or equal to 180 degrees and greater than or equal to -180 degrees.");
        } catch (Exception e) {
            fail(String.format("Expected InvalidCoordinatesException but %s was thrown instead.",
                    e.getClass().getSimpleName()));
        }
    }

}
