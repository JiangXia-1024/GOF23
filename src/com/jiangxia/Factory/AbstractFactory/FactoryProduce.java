package com.jiangxia.Factory.AbstractFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/22:05
 * @Description:
 */
public class FactoryProduce {
    public static AbstractFactory createFactory(String choice){
        if(choice.equalsIgnoreCase("computer")){
            return new ComputerFactory();
        } else if(choice.equalsIgnoreCase("car")){
            return new CarFactory();
        }
        return null;
    }
}
