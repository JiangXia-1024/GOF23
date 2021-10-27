package com.jiangxia.Factory.SimpleFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/26/21:48
 * @Description: 简单工厂的测试
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product1 product1 = Factory1.getProduct("汽车");
        product1.method1();
        System.out.println(product1.method());
        Product1 product2 = Factory1.getProduct("电脑");
        product2.method1();
        System.out.println(product2.method());
    }
}
