package com.singham.yuan.design.patterns.adapter;

public class Main {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.isTypeC();

        ObjectAdapter objectAdapter = new ObjectAdapter(new LightningUser());
        objectAdapter.isTypeC();

        TestUser testUser = new TestUser();
        testUser.test1();
    }

}
