package com.jiangxia.MementoPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/24/20:11
 * @Description:备忘录负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 */
public class Memento {
    //状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
