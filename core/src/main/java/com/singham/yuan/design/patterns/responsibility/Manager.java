package com.singham.yuan.design.patterns.responsibility;

public class Manager implements Handler {

    private Handler handler;

    @Override
    public void handleRequest(int number) {
        if (number > 5000) {
            if (handler != null) {
                handler.handleRequest(number);
                return;
            }

            System.out.println("Nobody Can Handle!");
            return;
        }

        System.out.println("Manager Handled!");
    }

    @Override
    public void setSuperior(Handler handler) {
        this.handler = handler;
    }

}