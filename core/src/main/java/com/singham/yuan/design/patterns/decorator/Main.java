package com.singham.yuan.design.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        CommonBird commonBird = new CommonBird();

        FlyMoreDecorator flyMoreDecorator = new FlyMoreDecorator(commonBird);
        flyMoreDecorator.fly();
    }

}
