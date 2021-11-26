package com.jiangxia.ChainOfResponsibilityPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/26/20:40
 * @Description:测试类
 */
public class ChainOfResponsibilityPatternTest {
    public static void main(String[] args) {
        //责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNextHandler(handler2);
        //请求
        handler1.handleRequest("渴了");
    }
}
