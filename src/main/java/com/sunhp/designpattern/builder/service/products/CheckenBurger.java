package com.sunhp.designpattern.builder.service.products;

import com.sunhp.designpattern.builder.service.impl.Burger;
import org.springframework.stereotype.Service;

@Service
public class CheckenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
