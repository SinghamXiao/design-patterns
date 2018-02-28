package com.singham.yuan.design.patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherSubject {

    private static final Logger LOGGER = LoggerFactory.getLogger(OtherSubject.class);

    public void execute(String message) {
        LOGGER.info("Real Subject Do Something With: " + message);
    }

}
