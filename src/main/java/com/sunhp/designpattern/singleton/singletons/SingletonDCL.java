package com.sunhp.designpattern.singleton.singletons;

public class SingletonDCL {
    //
    private volatile static SingletonDCL singletonDCL;
    //构造方法私有化
    private SingletonDCL(){}

    public static SingletonDCL getSingletonDCL(){
        if(singletonDCL == null){
            synchronized (SingletonDCL.class){
                if(singletonDCL == null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }

    public void testSingleton(){
        System.out.println("双检锁");
    }
}

/**
 * DK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
