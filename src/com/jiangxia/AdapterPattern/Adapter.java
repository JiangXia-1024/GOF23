package com.jiangxia.AdapterPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/30/18:34
 * @Description: 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void connectMethod() {
        super.adapteeConnectMethod();
    }
}
