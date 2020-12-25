package com.sunhp.designpattern.builder.service.impl;

import com.sunhp.designpattern.builder.service.Packing;
import org.springframework.stereotype.Service;

@Service(value = "bottle")
public class Bottle implements Packing {
    @Override
    public String Packing() {
        return "瓶子";
    }
}
