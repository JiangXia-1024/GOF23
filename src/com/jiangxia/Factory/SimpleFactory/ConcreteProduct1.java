package com.jiangxia.Factory.SimpleFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/26/21:40
 * @Description: 具体产品1-- 汽车
 */
public class ConcreteProduct1 extends Product1 {
    @Override
    public String method() {
        return "这里生产了汽车";
    }
}
