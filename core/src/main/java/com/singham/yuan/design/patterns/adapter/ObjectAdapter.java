package com.singham.yuan.design.patterns.adapter;

public class ObjectAdapter implements TypeC {

    private Lightning lightning;

    public ObjectAdapter(Lightning lightning) {
        this.lightning = lightning;
    }

    @Override
    public void isTypeC() {
        lightning.isLightning();
    }

}
