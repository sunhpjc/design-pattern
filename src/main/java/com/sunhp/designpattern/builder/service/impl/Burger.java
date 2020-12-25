package com.sunhp.designpattern.builder.service.impl;

import com.sunhp.designpattern.builder.service.Item;
import com.sunhp.designpattern.builder.service.Packing;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "burger")
public abstract class Burger implements Item {
    @Resource(name = "wrappers")
    private Wrappers wrappers;

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return wrappers;
    }
}
