package com.sunhp.designpattern.builder.service.impl;

import com.sunhp.designpattern.builder.service.Packing;
import org.springframework.stereotype.Service;

@Service(value = "wrappers")
public class Wrappers implements Packing {
    @Override
    public String Packing() {
        return "盒子";
    }
}
