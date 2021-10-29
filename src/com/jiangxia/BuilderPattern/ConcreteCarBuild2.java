package com.jiangxia.BuilderPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/29/22:51
 * @Description:具体货车建造者
 */
public class ConcreteCarBuild2 implements AbstractCarBuild{
    private CarProduct truckCar = new CarProduct();
    @Override
    public void createWheel() {
        truckCar.setWheel("货车轮胎");
    }

    @Override
    public void createsteeringWheel() {
        truckCar.setSteeringWheel("货车方向盘");
    }

    @Override
    public void createHood() {
        truckCar.setHood("货车车盖");
    }

    @Override
    public void createWindshield() {
        truckCar.setWindshield("货车挡风玻璃");
    }

    @Override
    public CarProduct create() {
        return truckCar;
    }
}
