package com.singham.yuan.design.patterns.responsibility;

public class Clerk implements Handler {

    private Handler handler;

    @Override
    public void handleRequest(int number) {
        if (number > 1000) {
            handler.handleRequest(number);
            return;
        }

        System.out.println("Clerk Handled!");

    }

    @Override
    public void setSuperior(Handler handler) {
        this.handler = handler;
    }

}