package com.jiangxia.DecoratorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/16:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Phone p = new OldPhone();
        p.photo();
        Phone phone = new ConcreteDecorator(new OldPhone());
        phone.photo();
    }
}
