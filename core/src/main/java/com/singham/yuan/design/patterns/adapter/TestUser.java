package com.singham.yuan.design.patterns.adapter;

public class TestUser extends TestAdapter {

    @Override
    public void test1() {
        System.out.println("实现A方法被调用");
    }
}
