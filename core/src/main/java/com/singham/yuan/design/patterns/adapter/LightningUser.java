package com.singham.yuan.design.patterns.adapter;

public class LightningUser implements Lightning {

    @Override
    public void isLightning() {
        System.out.println("Lightning!");
    }
}
