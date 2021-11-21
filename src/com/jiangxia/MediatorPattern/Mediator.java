package com.jiangxia.MediatorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:02
 * @Description:抽象中介者（Mediator）：抽象中介者是中介者的抽象类，它提供了同事对象注册与转发同事对象信息的抽象方法，
 * 用于各个同事类之间的通信。一般包括一个或几个抽象的事件方法，并由子类去实现。
 */
public abstract class Mediator {
    //带看
    public abstract void look(Colleague cl);
    //签约
    public abstract void regist(Colleague cl);

}
