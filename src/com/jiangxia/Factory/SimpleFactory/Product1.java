package com.jiangxia.Factory.SimpleFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/26/21:37
 * @Description: 简单工厂方法的Product--抽象产品
 */
public abstract class Product1 {
    public void method1(){
        System.out.println("这里是抽象产品的公共方法");
    }
    //这里声明抽象的业务方法
    public abstract String method();
}
