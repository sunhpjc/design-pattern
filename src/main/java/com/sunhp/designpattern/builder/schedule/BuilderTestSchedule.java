package com.sunhp.designpattern.builder.schedule;

import com.sunhp.designpattern.builder.service.builder.Meal;
import com.sunhp.designpattern.builder.service.builder.MealBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableScheduling
public class BuilderTestSchedule {
    @Resource
    private MealBuilder mealBuilder;

    @Scheduled(cron = "0/5 * * * * ?")
    public void testSchedule(){
        Meal meal = mealBuilder.build1();
        System.out.println("=========套餐1=========");
        meal.showItem();
        System.out.println("总费用："+meal.countPrice());

        Meal meal1 = mealBuilder.build2();
        System.out.println("=========套餐2=========");
        meal1.showItem();
        System.out.println("总费用："+meal1.countPrice());

        System.out.println(">>>>>>>>>>>>>>>>>>分割线<<<<<<<<<<<<<<<<<<<<<<");
    }
}
