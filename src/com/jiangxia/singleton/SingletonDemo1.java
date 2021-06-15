package com.jiangxia.singleton;

/**
 * 饿汉式单例模式
 * author:jiangxia
 * date:2021-05-18
 */
public class SingletonDemo1 {
    //类初始化时立即加载这个对象！体现饿的特点没有延时加载的优势
    //由于加载类时天然时线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();


    private SingletonDemo1(){

    }

    //方法没有同步，调用效率高
    public static SingletonDemo1 getInstance(){
       return instance;
    }
}
