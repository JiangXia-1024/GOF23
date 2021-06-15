package com.jiangxia.singleton;

/**
 * 懒汉式单例模式
 * author:jiangxia
 * date:2021-05-18
 */
public class SingletonDemo2 {
    //类初始化时不初始化这个对象，延时加载，只有真正使用的时候再创建
    private static SingletonDemo2 instance;

    //私有化构造器
    private SingletonDemo2(){

    }

    //方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
