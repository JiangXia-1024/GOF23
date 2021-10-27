package com.jiangxia.Factory.FactoryMethod;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/20:42
 * @Description:电脑工厂 生产电脑
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        System.out.println("电脑工厂正在生产电脑");
        return new ConcreteProduct2();
    }
}
