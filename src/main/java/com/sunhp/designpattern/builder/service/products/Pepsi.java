package com.sunhp.designpattern.builder.service.products;

import com.sunhp.designpattern.builder.service.impl.ColdDrink;
import org.springframework.stereotype.Service;

@Service
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 6.0f;
    }
}
