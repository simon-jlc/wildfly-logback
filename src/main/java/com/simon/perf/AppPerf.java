package com.simon.perf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by margot on 07/01/2017.
 */
public class AppPerf implements AppMXBean {

    Logger logger = LoggerFactory.getLogger(AppPerf.class);

    private static String name = "AppPerf";
    private int value = 100;

    @Override
    public String getName() {
        return "AppPerf";
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public synchronized void setValue(int value) {
        this.value = value;
    }

    @Override
    public void refresh() {
        logger.info("Refresh MBean");
    }
}
