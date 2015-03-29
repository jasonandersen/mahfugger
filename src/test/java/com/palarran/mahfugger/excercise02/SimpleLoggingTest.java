package com.palarran.mahfugger.excercise02;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.palarran.mahfugger.GeoLocation;

/**
 * This is a simple JUnit test to demonstrate how to do logging using log4j, the more
 * popular Java logging framework. There are several logging frameworks (and framework
 * wrappers) but if you know log4j, that's enough. Whenever you're tempted to use
 * System.out.println(), you should almost always use a log message instead.
 */
public class SimpleLoggingTest {

    /**
     * This is a log4j Logger instance. All logging commands will go through this object.
     * Each log4j logger is associated with a class so when the log messages come through
     * you can see what class generated the log message. In order to setup the Logger for
     * this class, we use the Logger.getLogger() static method and pass in this class.
     * 
     * We always instantiate Logger objects as private static. If we didn't use static, we'd
     * have a new Logger instance for every instance of this class. We only want one instance 
     * of this logger regardless of how many instances of SimpleLoggingTest get created.
     * 
     * Whenever you create an instance of a Logger, make sure that the class you are passing
     * in to the getLogger method is the current class. Putting the wrong class name into the
     * getLogger method will make problem sovling collosally more difficult. AMHIK.
     */
    private static final Logger log = Logger.getLogger(SimpleLoggingTest.class);

    /*
     * configuration
     * 
     * log4j configuration is done in a single configuration file called log4j.properties. It 
     * is located in src/main/resource/log4j.properties. You can also use an Eclipse shortcut:
     * Shift+Ctrl+R and type log4j.
     */

    /*
     * log levels
     * 
     * Logging can be done at several levels. Each level tells the logging framework the criticality
     * of the particular log message. This way, you can control how many log messages actually 
     * get written. Sometimes you want every single last log message. Sometimes you only want to
     * know the important messages. I've seen whole servers brought down to their knees because an
     * admin left the log level on DEBUG and the server was writing a firehose of log messages.
     * 
     * DEBUG - use this level for most of your log messages. Especially if you're trying to trace
     *         execution through a stack trace or you want to dump the value of variables out while
     *         you're executing.
     *         
     * INFO  - I use this when interesting things happen. When I start up services or instantiate 
     *         important application-wide objects. Most of the time, production code should be logging
     *         at an INFO level so I put things in here that are good to know while the application
     *         is running in production.
     *         
     * WARN  - something happened and it wasn't good. It wasn't catastrophic but we are no longer at
     *         DEFCON PUPPIES & RAINBOWS
     *         
     * ERROR - shit is going down. This level of message is almost always accompanied by some
     *         kind of exception object to at least let us know what kind of shit is going down.
     */

    @Test
    public void testWarnLogMessage() {
        log.warn("HOT SNAKES!!!"); //<-- did this show up in the console?
    }

    @Test
    public void testDebugLogMessage() {
        /*
         * Why doesn't this show up in the console? How do you fix it so it will show up?
         */
        log.debug("Meh, just some normal debugging going on here.");
    }

    @Test
    public void testLogObject() {
        GeoLocation walkerGroup = new GeoLocation(50.898659f, -127.531532f);
        /*
         * What happens when you log an object instead of just a string?
         */
        log.debug(walkerGroup);
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
     * testDebugLogMessage()
     * ---------------------
     * Look at the log4j.properties file. The setting for log4j.logger.com.palarran.mahfugger.excercise02.SimpleLoggingTest
     * is higher than DEBUG and therefore DEBUG messages will be ignored until the setting is lowered.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * testLogObject()
     * ---------------
     * Look at the GeoLocation class and the toString() method. That method is called to return a string
     * representation of the instance. Look at the Javadocs for the String class and the format() method
     * to learn more about how I formatted that string.
     */

}
