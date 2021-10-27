package com.jiangxia.Factory.FactoryMethod;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/20:40
 * @Description:具体产品2  电脑
 */
public class ConcreteProduct2 implements AbstractProduct{
    @Override
    public void over() {
        System.out.println("电脑生产完成了");
    }
}
