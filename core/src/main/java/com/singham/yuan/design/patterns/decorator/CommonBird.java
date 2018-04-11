package com.singham.yuan.design.patterns.decorator;

public class CommonBird implements Bird {

    @Override
    public void fly() {
        System.out.println("Fly 100m !!!");
    }

}
