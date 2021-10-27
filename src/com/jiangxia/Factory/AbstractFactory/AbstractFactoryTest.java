package com.jiangxia.Factory.AbstractFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/27/22:04
 * @Description:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //获取汽车工厂
        AbstractFactory cFactory = FactoryProduce.createFactory("computer");

        //获取公司为小米的电脑
        Computer computer1 = cFactory.createComputer("XiaoMi");

        //调用小米电脑的over方法
        computer1.over();

        //获取公司为华为的电脑
        Computer computer2 = cFactory.createComputer("HuaWei");

        //调用华为电脑的over方法
        computer2.over();


        //获取汽车工厂
        AbstractFactory carFactory = FactoryProduce.createFactory("car");

        //获取公司为audi的汽车
        Car car1 = carFactory.createCar("Audi");

        //调用奥迪的over方法
        car1.over();

        //获取公司为byd的汽车
        Car car2 = carFactory.createCar("BYD");

        //调用比亚迪的over方法
        car2.over();


    }
}
