package com.sunhp.designpattern.singleton.schedule;

import com.sunhp.designpattern.singleton.enums.TypeEnum;
import com.sunhp.designpattern.singleton.singletons.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EnableScheduling
@Component
public class SingletonTestSchedule {
    private static final Logger logger = LoggerFactory.getLogger(SingletonTestSchedule.class);

//    @Scheduled(cron = "0/7 * * * * ?")
    public void testSchedule1(){
        String key1 = "001";
        String key2 = "002";
        String key3 = "003";
        String key4 = "004";
        List<String> stringList = new ArrayList<>();
        stringList.add(key1);
        stringList.add(key2);
        stringList.add(key3);
        stringList.add(key4);

        stringList.forEach(item -> {
            TypeEnum typeEnum = TypeEnum.getEnumsByCode(item);
            switch (typeEnum){
                case HUNGER:
                    SingletonHunger instance = SingletonHunger.getInstance();
                    instance.testSingleton();
                    System.out.println("饿汉式："+ instance.toString());
                    break;
                case DCL:
                    SingletonDCL singletonDCL = SingletonDCL.getSingletonDCL();
                    singletonDCL.testSingleton();
                    System.out.println("双检锁："+ singletonDCL.toString());
                    break;
                case REGISTER:
                    SingletonRegister instance1 = SingletonRegister.getInstance();
                    instance1.testSingleton();
                    System.out.println("登记式："+ instance1.toString());
                    break;
                case ENUMS:
                    SingletonEnum instance2 = SingletonEnum.INSTANCE;
                    instance2.testSingleton();
                    System.out.println("枚举式："+ instance2.getClass().toString());
                    break;
                default:
                    logger.info("枚举参数不匹配");
                    break;
            }
        });
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("饿汉式："+ SingletonHunger.getInstance().toString());
        System.out.println("双检锁："+ SingletonDCL.getSingletonDCL().toString());
        System.out.println("登记式："+ SingletonRegister.getInstance().toString());
        System.out.println("枚举式："+ SingletonEnum.INSTANCE.getClass().toString());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("=======================================分割线===========================================");
    }
}
