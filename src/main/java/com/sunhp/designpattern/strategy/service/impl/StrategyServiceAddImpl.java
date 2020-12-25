package com.sunhp.designpattern.strategy.service.impl;

import com.sunhp.designpattern.strategy.service.StrategyService;
import org.springframework.stereotype.Service;

@Service(value = "strategyServiceAddImpl")
public class StrategyServiceAddImpl implements StrategyService {
    @Override
    public void testMethod(int a, int b) {
        int c = a + b;
        System.out.println("加法： " + c);
    }
}
