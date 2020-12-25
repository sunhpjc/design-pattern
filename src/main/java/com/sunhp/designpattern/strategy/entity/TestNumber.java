package com.sunhp.designpattern.strategy.entity;

import lombok.Data;

@Data
public class TestNumber {
    private int a;
    private int b;
    private String type;

    public TestNumber(int a, int b, String type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }
}
