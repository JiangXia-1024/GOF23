package com.jiangxia.MediatorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:05
 * @Description:抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void get();
    public abstract void send();
}
