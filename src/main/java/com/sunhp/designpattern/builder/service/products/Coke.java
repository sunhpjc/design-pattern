package com.sunhp.designpattern.builder.service.products;

import com.sunhp.designpattern.builder.service.impl.ColdDrink;
import org.springframework.stereotype.Service;

@Service
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
