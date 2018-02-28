package com.singham.yuan.design.patterns.proxy;

public class StaticProxy implements Subject {

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void execute(String message) {
        subject.execute(message);
    }

}
