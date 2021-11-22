package com.jiangxia.TemplateMethodPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/22/19:38
 * @Description:抽象类
 */
public abstract class AbstractClass {

    //模板方法
    public void TemplateMethod() {
        qianyan();
        zhengwen();
        jiewei();
    }

    //抽象方法
    protected abstract void zhengwen();
    //具体方法
    protected void qianyan(){
        System.out.println("这里是文章的开头，大家用的都是一样的！！！");
    }
    protected  void jiewei(){
        System.out.println("这里是文章的结尾，大家用的都是一样的！！！");
    }

}
