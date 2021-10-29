package com.jiangxia.BuilderPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/28/22:06
 * @Description:车产品
 */
public class CarProduct {
    //车的轮子
    private String Wheel;
    //车的方向盘
    private String steeringWheel;
    //车的车盖
    private String Hood;
    //车的玻璃
    private String Windshield;

    public String getWheel() {
        return Wheel;
    }

    public void setWheel(String wheel) {
        Wheel = wheel;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getHood() {
        return Hood;
    }

    public void setHood(String hood) {
        Hood = hood;
    }

    public String getWindshield() {
        return Windshield;
    }

    public void setWindshield(String windshield) {
        Windshield = windshield;
    }
}
