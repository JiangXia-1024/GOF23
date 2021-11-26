package com.jiangxia.ChainOfResponsibilityPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/26/20:39
 * @Description:具体处理类2
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equals("渴了")) {
            System.out.println("嘴巴渴了具体处理者2开始烧水！");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
