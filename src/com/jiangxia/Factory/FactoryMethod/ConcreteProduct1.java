package com.jiangxia.Factory.FactoryMethod;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/20:40
 * @Description: 具体产品1  汽车
 */
public class ConcreteProduct1 implements AbstractProduct{
    @Override
    public void over() {
        System.out.println("汽车生产完成了");
    }
}
