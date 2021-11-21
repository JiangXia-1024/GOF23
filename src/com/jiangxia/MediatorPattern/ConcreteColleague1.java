package com.jiangxia.MediatorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:16
 * @Description:具体同事类1
 */
public class ConcreteColleague1 extends Colleague{
    @Override
    public void get() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.look(this);
    }
}
