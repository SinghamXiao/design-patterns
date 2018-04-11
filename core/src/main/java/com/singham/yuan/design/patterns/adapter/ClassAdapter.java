package com.singham.yuan.design.patterns.adapter;

public class ClassAdapter extends LightningUser implements TypeC {

    @Override
    public void isTypeC() {
        isLightning();
    }

}
