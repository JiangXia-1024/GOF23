package com.jiangxia.Prototype;

import java.io.Serializable;

/**
 * @Author: 江夏
 * @Date: 2021/10/24/10:21
 * @Description: 深拷贝重写clone方法来实现深拷贝
 */
public class DeepClonePrototypeDemo2 implements  Cloneable,Serializable {
    //年龄
    private int age;
    //姓名
    private String name;
    //体重
    private int weight;
    //身高
    private int height;

    //构造器
    public DeepClonePrototypeDemo2(int age, String name, int weight, int height) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
