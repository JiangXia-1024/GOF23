package com.jiangxia.AdapterPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/30/18:44
 * @Description:对象适配器模式测试代码
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target adapter = new Adapter1(new Adaptee());
        adapter.connectMethod();
    }
}
