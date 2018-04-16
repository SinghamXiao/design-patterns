package com.singham.yuan.design.patterns.responsibility;

public interface Handler {

    void handleRequest(int number);

    void setSuperior(Handler handler);

}
