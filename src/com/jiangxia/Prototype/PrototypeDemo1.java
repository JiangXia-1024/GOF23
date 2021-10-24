package com.jiangxia.Prototype;

/**
 * @Author: 江夏
 * @Date: 2021/10/24/9:17
 * @Description: 原型模式实体类
 */
public class PrototypeDemo1 implements Cloneable{
    //性别
    private String gender;
    //年龄
    private int age;
    //姓名
    private String name;
    //体重
    private int weight;
    //身高
    private int height;
    public PrototypeDemo1(String gender){
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public PrototypeDemo1 clone(){
        PrototypeDemo1 prototypeDemo1 = null;
        try{
            //Object类的clone方法来完成内存中复制数据
            prototypeDemo1 = (PrototypeDemo1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeDemo1;
    }
}
