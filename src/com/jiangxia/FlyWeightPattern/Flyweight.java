package com.jiangxia.FlyWeightPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/19/22:17
 * @Description:/抽象享元角色
 */
public interface Flyweight {
    //这里的status是非享元的外部状态
    public void operation(String state);
}
