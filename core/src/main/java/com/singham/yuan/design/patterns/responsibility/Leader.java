package com.singham.yuan.design.patterns.responsibility;

public class Leader implements Handler {

    private Handler handler;

    @Override
    public void handleRequest(int number) {
        if (number > 2000) {
            handler.handleRequest(number);
            return;
        }

        System.out.println("Leader Handled!");
    }

    @Override
    public void setSuperior(Handler handler) {
        this.handler = handler;
    }

}
