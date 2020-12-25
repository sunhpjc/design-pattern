package com.sunhp.designpattern.builder.service.builder;

import com.sunhp.designpattern.builder.service.Item;
import com.sunhp.designpattern.builder.service.Packing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//组合类
@Service(value = "meal")
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public float countPrice(){
        float price = 0.0f;
        for (Item item : items){
            price += item.price();
        }
        return price;
    }

    public void showItem(){
        for (Item item : items){
            Packing packing = item.packing();
            System.out.println("名称："+item.name());
            System.out.println("打包："+packing.Packing());
            System.out.println("价格："+item.price());
        }
    }
}
