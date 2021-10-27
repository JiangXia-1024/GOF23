package com.jiangxia.Factory.AbstractFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/21:54
 * @Description:Audi
 */
public class Audi implements Car {
    @Override
    public void over() {
        System.out.println("奥迪汽车");
    }
}
