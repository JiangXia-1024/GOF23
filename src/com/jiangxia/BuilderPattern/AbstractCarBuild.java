package com.jiangxia.BuilderPattern;


/**
 * @Author: 江夏
 * @Date: 2021/10/28/21:56
 * @Description: 假设车子由以下几个部分组成 用建造者模式模拟汽车的生产
 * 抽象车建造者
 */
public interface AbstractCarBuild {
    //创建车的轮子
    void createWheel();
    //创建车的方向盘
    void createsteeringWheel();
    //创建车的车盖
    void createHood();
    //创建车的玻璃
    void createWindshield();

    //车子创建完成
    CarProduct create();
}
