//package com.sunhp.designpattern.singleton.factory;
//
//import com.sunhp.designpattern.singleton.enums.TypeEnum;
//import com.sunhp.designpattern.singleton.singletons.SingletonHunger;
//
///**
// * 暂时不使用
// */
//public class SingletonFactory {
//
//    public static Object getInstance(String key){
//        TypeEnum typeEnum = TypeEnum.getEnumsByCode(key);
//
//        switch (typeEnum){
//            case HUNGER:
//                return SingletonHunger.getInstance();
//            default:
//                return null;
//        }
//    }
//}
