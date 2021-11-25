package com.jiangxia.StatePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/25/20:31
 * @Description:抽象状态类
 */
public abstract class State {
    //状态行为抽象方法,由具体的状态子类去实现不同的行为逻辑
    public abstract void Do();
}
