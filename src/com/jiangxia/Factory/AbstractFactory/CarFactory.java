package com.jiangxia.Factory.AbstractFactory;


import javafx.scene.shape.Circle;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/21:56
 * @Description:
 */
public class CarFactory extends AbstractFactory {

    @Override
    public Computer createComputer(String computerCompanyName) {
        return null;
    }

    @Override
    public Car createCar(String carCompanyName) {
        if(carCompanyName == null){
            return null;
        }
        if(carCompanyName.equalsIgnoreCase("Audi")){
            return new Audi();
        } else if(carCompanyName.equalsIgnoreCase("BYD")){
            return new BYD();
        }
        return null;
    }
}
