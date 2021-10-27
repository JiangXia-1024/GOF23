package com.jiangxia.Factory.AbstractFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/22:00
 * @Description:
 */
public class ComputerFactory extends AbstractFactory {
    @Override
    public Computer createComputer(String computerCompanyName) {
        if(computerCompanyName == null){
            return null;
        }
        if(computerCompanyName.equalsIgnoreCase("XiaoMi")){
            return new XiaoMi();
        } else if(computerCompanyName.equalsIgnoreCase("HuaWei")){
            return new HuaWei();
        }
        return null;
    }

    @Override
    public Car createCar(String carCompanyName) {
        return null;
    }
}
