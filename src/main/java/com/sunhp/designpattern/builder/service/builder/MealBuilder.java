package com.sunhp.designpattern.builder.service.builder;

import com.sunhp.designpattern.builder.service.products.CheckenBurger;
import com.sunhp.designpattern.builder.service.products.Coke;
import com.sunhp.designpattern.builder.service.products.Pepsi;
import com.sunhp.designpattern.builder.service.products.VegBurger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MealBuilder {
    @Resource
    private VegBurger vegBurger;
    @Resource
    private CheckenBurger checkenBurger;
    @Resource
    private Coke coke;
    @Resource
    private Pepsi pepsi;

    public Meal build1(){
        Meal meal = new Meal();
        meal.add(vegBurger);
        meal.add(checkenBurger);
        meal.add(pepsi);
        return meal;
    }

    public Meal build2(){
        Meal meal = new Meal();
        meal.add(vegBurger);
        meal.add(coke);
        return meal;
    }

}
