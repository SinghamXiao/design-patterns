package com.singham.yuan.design.patterns.decorator;

public class FlyMoreDecorator extends Decorator {

    public FlyMoreDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void fly() {
        System.out.println("Armed!");
        super.fly();
        enhanceFly();
    }

    private void enhanceFly() {
        System.out.println("Fly another 50m !!!");
    }

}
