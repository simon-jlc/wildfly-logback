package com.simon.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by margot on 07/01/2017.
 */
public class AppLogger {

    public static void main (String [] args) {

        Logger logger = LoggerFactory.getLogger("AppLogger");
        logger.info("Hello AppLogger !");
    }
}
