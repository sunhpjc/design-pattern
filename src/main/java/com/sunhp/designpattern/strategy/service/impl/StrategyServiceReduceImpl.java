package com.sunhp.designpattern.strategy.service.impl;

import com.sunhp.designpattern.strategy.service.StrategyService;
import org.springframework.stereotype.Service;

@Service(value = "strategyServiceReduceImpl")
public class StrategyServiceReduceImpl implements StrategyService {
    @Override
    public void testMethod(int a, int b) {
        int c = a - b;
        System.out.println("减法： " + c);
    }
}
