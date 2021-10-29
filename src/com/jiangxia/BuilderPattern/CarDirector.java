package com.jiangxia.BuilderPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/28/22:05
 * @Description:指挥者负责产品的创建流程
 */
public class CarDirector {

    private AbstractCarBuild abstractCarBuild;

    public CarProduct build(){
        abstractCarBuild.createHood();
        abstractCarBuild.createsteeringWheel();
        abstractCarBuild.createWheel();
        abstractCarBuild.createWindshield();
        return abstractCarBuild.create();
    }

    public CarDirector(AbstractCarBuild abstractCarBuild) {
        this.abstractCarBuild = abstractCarBuild;
    }

    public AbstractCarBuild getAbstractCarBuild() {
        return abstractCarBuild;
    }

    public void setAbstractCarBuild(AbstractCarBuild abstractCarBuild) {
        this.abstractCarBuild = abstractCarBuild;
    }
}
