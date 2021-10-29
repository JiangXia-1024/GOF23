package com.jiangxia.BuilderPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/28/22:03
 * @Description: 具体汽车的建造者
 */
public class ConcreteCarBuild1 implements  AbstractCarBuild  {

    private CarProduct automobileCar = new CarProduct();
    @Override
    public void createWheel() {
        automobileCar.setWheel("汽车轮子");
    }

    @Override
    public void createsteeringWheel() {
        automobileCar.setSteeringWheel("汽车方向盘");
    }

    @Override
    public void createHood() {
        automobileCar.setHood("汽车车盖");
    }

    @Override
    public void createWindshield() {
        automobileCar.setWindshield("汽车挡风玻璃");
    }

    @Override
    public CarProduct create() {
        return automobileCar;
    }
}
