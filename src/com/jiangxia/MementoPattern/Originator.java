package com.jiangxia.MementoPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/24/20:10
 * @Description:发起人类（Originator）：这里主要记录当前时刻的内部状态，并且负责定义哪些是属于备份范围的状态，负责创建和恢复备忘录数据。
 */
public class Originator {
    //状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录数据方法
    public Memento create(){
        return new Memento(this.state);
    }
    //恢复备忘录数据方法
    public void restore(Memento memento) {
        this.setState(memento.getState());
    }
}
