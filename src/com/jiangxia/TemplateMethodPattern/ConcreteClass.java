package com.jiangxia.TemplateMethodPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/22/19:44
 * @Description:具体子类
 */
public class ConcreteClass extends AbstractClass{
    @Override
    protected void zhengwen() {
        System.out.println("这里是正文方法，每个人都不一样！！！");
    }
}
