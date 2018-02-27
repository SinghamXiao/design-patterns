package com.singham.yuan.design.patterns.observer;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String message);

}
