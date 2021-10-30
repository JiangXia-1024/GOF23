package com.jiangxia.AdapterPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/30/18:35
 * @Description:类适配器测试代码
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        //使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.connectMethod();
    }
}
