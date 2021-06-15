package com.jiangxia.singleton;

/**
 * 双重检测锁实现单例模式
 * author:jiangxia
 * date:2021-05-18
 */
public class SingletonDemo3 {

    private static SingletonDemo3 instance = null;

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class){
                        if(sc==null){
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
    private  SingletonDemo3(){

    }
}
