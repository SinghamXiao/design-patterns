package com.singham.yuan.design.patterns.observer;

public class Main {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        subject.addObserver(new ConcreteObserver("user1"));

        subject.addObserver(new ConcreteObserver("user2"));

        subject.addObserver(new ConcreteObserver("user3"));

        subject.notifyObservers("Message Update!");
    }
}
