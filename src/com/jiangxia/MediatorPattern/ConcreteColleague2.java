package com.jiangxia.MediatorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:18
 * @Description:
 */
public class ConcreteColleague2 extends  Colleague{

    @Override
    public void get() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.look(this);
    }
}
