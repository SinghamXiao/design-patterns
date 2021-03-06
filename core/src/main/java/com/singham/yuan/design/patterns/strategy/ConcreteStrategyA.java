package com.singham.yuan.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteStrategyA implements Strategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStrategyA.class);

    @Override
    public void execute() {
        LOGGER.info("StrategyA");
    }

}
