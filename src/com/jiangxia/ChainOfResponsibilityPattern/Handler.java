package com.jiangxia.ChainOfResponsibilityPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/26/20:35
 * @Description:抽象处理类
 */
public abstract  class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
