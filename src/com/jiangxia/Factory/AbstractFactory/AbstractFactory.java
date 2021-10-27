package com.jiangxia.Factory.AbstractFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/21:48
 * @Description:工厂抽象类
 */
public abstract class AbstractFactory {

    public abstract Computer createComputer(String computerCompanyName);
    public abstract Car createCar(String carCompanyName) ;
}
