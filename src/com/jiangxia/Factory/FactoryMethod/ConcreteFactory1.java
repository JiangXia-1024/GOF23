package com.jiangxia.Factory.FactoryMethod;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/20:41
 * @Description:具体工厂  生产汽车
 */
public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        System.out.println("汽车工厂正在生产汽车");
        return new ConcreteProduct1();
    }
}
