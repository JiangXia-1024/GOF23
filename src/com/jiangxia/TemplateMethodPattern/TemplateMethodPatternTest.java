package com.jiangxia.TemplateMethodPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/22/19:47
 * @Description:
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.qianyan();
        concreteClass.zhengwen();
        concreteClass.jiewei();
    }
}
