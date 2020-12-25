package com.sunhp.designpattern.builder.service.impl;

import com.sunhp.designpattern.builder.service.Item;
import com.sunhp.designpattern.builder.service.Packing;

import javax.annotation.Resource;

public abstract class ColdDrink implements Item {
    @Resource(name = "bottle")
    private Bottle bottle;

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return bottle;
    }
}
