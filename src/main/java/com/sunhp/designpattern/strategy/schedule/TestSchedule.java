package com.sunhp.designpattern.strategy.schedule;

import com.sunhp.designpattern.strategy.context.StrategyContext;
import com.sunhp.designpattern.strategy.entity.TestNumber;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@EnableScheduling
@Component
public class TestSchedule {
    @Resource
    private StrategyContext strategyContext;

//    @Scheduled(cron = "0/5 * * * * ?")
    public void testSchedule(){
        TestNumber testNumber1 = new TestNumber(10,2,"strategyServiceAddImpl");
        TestNumber testNumber2 = new TestNumber(10, 2, "strategyServiceReduceImpl");
        TestNumber testNumber3 = new TestNumber(10, 2, "strategyServiceMultiplicationImpl");

        strategyContext.executeStrategy1(testNumber1);
        strategyContext.executeStrategy1(testNumber2);
        strategyContext.executeStrategy1(testNumber3);
    }
}
