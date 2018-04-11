package com.singham.yuan.design.patterns.decorator;

public abstract class Decorator implements Bird {

    private Bird bird;

    public Decorator(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
    }

}
