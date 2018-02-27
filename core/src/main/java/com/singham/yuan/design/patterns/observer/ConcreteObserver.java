package com.singham.yuan.design.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteObserver implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteObserver.class);

    private String user;

    public ConcreteObserver(String user) {
        this.user = user;
    }

    @Override
    public void update(String message) {
        LOGGER.info(user + ": " + message);
    }

}
