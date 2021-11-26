package com.jiangxia.ChainOfResponsibilityPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/26/20:37
 * @Description:具体处理类1
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equals("做饭")) {
            System.out.println("肚子饿了具体处理者1开始做饭");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
