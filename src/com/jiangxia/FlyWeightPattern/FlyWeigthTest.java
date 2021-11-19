package com.jiangxia.FlyWeightPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/19/22:28
 * @Description:
 */
public class FlyWeigthTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new String("状态A"));
        fly.operation("状态A");

        fly = factory.factory(new String("状态B"));
        fly.operation("状态B");

        fly = factory.factory(new String("状态A"));
        fly.operation("状态C");
    }
}
