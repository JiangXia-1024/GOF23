package com.jiangxia.AdapterPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/30/18:42
 * @Description:对象适配器模式
 */
public class Adapter1 implements Target{
    private Adaptee adaptee;

    public Adapter1 (Adaptee adaptee) {
        this.adaptee= adaptee;
    }
    @Override
    public void connectMethod() {
        this.adaptee.adapteeConnectMethod();
    }
}
