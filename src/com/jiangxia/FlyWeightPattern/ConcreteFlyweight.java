package com.jiangxia.FlyWeightPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/19/22:20
 * @Description:具体享元角色类
 */
public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState = null;
    /**
     * 构造函数，内部状态作为参数传入
     * @param state
     * */
    public ConcreteFlyweight(String state){
        this.intrinsicState = state;
    }
    /**
     * 外部状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内部状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("内部状态：" + this.intrinsicState);
        System.out.println("外部状态：" + state);
    }
}
