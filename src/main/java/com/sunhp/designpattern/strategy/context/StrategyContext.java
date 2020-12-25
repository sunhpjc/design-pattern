package com.sunhp.designpattern.strategy.context;

import com.sunhp.designpattern.strategy.entity.TestNumber;
import com.sunhp.designpattern.strategy.service.StrategyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StrategyContext {
    /***、
     *通过Spring将实现Strategy的实现类都自动注入到strategyServiceMap类中，
     * k为service别名
     */
    /**
     * 注意：
     */
    @Resource
    private final Map<String,StrategyService> strategyServiceMap = new ConcurrentHashMap<>();

    public StrategyContext(Map<String,StrategyService> strategyServiceMap) {
        this.strategyServiceMap.clear();
        strategyServiceMap.forEach((k, v) ->this.strategyServiceMap.put(k, v));
    }

    /**
     * 方法一：通过实体类参数传入
     * 注：也可以只用枚举类
     * @param testNumber
     */
    public void executeStrategy1(TestNumber testNumber){
//        strategyServiceMap.get(testNumber.getType())如果传进来的参数有错误，这里会抛出异常，在这里做处理
//        strategyServiceMap.get(testNumber.getType()).testMethod(testNumber.getA(), testNumber.getB());
        if(strategyServiceMap.containsKey(testNumber.getType())){
            strategyServiceMap.get(testNumber.getType()).testMethod(testNumber.getA(), testNumber.getB());
        }
        else {
            System.out.println("当前策略不存在");
        }
    }
}
