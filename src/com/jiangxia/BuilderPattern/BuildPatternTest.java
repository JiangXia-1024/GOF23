package com.jiangxia.BuilderPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/28/22:07
 * @Description:
 */
public class BuildPatternTest {
    public static void main(String[] args) {
        AbstractCarBuild abstractCarBuild = new ConcreteCarBuild1();
        CarDirector carDirector = new CarDirector(abstractCarBuild);
        CarProduct carProduct = carDirector.build();
        System.out.println("汽车信息：");
        System.out.println(carProduct.getHood());
        System.out.println(carProduct.getSteeringWheel());
        System.out.println(carProduct.getWheel());
        System.out.println(carProduct.getWindshield());
        System.out.println("========================");
        carDirector.setAbstractCarBuild(new ConcreteCarBuild2());
        CarProduct truckProduct = carDirector.build();
        System.out.println("货车信息：");
        System.out.println(truckProduct.getHood());
        System.out.println(truckProduct.getSteeringWheel());
        System.out.println(truckProduct.getWheel());
        System.out.println(truckProduct.getWindshield());

    }
}
