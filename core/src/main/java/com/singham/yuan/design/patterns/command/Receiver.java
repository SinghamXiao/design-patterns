package com.singham.yuan.design.patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    public void execute() {
        LOGGER.info("Execute Command!");
    }

}
