package com.jiangxia.Factory.FactoryMethod;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/20:33
 * @Description:工厂方法测试
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractFactory af1 = new ConcreteFactory1();
        AbstractProduct cp1 = af1.createProduct();
        System.out.println(cp1);
        cp1.over();
        System.out.println("===============================");
        AbstractFactory af2 = new ConcreteFactory2();
        AbstractProduct cp2 = af2.createProduct();
        System.out.println(cp2);
        cp2.over();
    }
}
