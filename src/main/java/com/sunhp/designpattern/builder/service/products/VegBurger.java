package com.sunhp.designpattern.builder.service.products;

import com.sunhp.designpattern.builder.service.impl.Burger;
import org.springframework.stereotype.Service;

@Service
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
