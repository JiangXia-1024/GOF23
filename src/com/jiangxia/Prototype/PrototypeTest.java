package com.jiangxia.Prototype;

import java.util.ArrayList;

/**
 * @Author: 江夏
 * @Date: 2021/10/24/9:27
 * @Description: 原型模式测试类
 */
public class PrototypeTest {
    public static void main(String[] args) {
        //对象性别肯定是女，这个是一致的不变的数据
        String gender = "女";
        PrototypeDemo1 prototypeDemo1 = new PrototypeDemo1(gender);
        //clone prototypeDemo1 并且设置clone部分的值，这块数据是可变的，每个地方不一样
        PrototypeDemo1 cloneprototypeDemo1 = prototypeDemo1.clone();
        cloneprototypeDemo1.setAge(20);
        cloneprototypeDemo1.setHeight(160);
        cloneprototypeDemo1.setWeight(50);
        cloneprototypeDemo1.setName("韩梅梅");
        PrototypeDemo1 cloneprototypeDemo2 = prototypeDemo1.clone();
        cloneprototypeDemo2.setAge(19);
        cloneprototypeDemo2.setHeight(168);
        cloneprototypeDemo2.setWeight(45);
        cloneprototypeDemo2.setWeight(45);
        cloneprototypeDemo2.setName("李华");
        System.out.println("第一个女朋友的数据是：她叫："+cloneprototypeDemo1.getName()+"；年龄："+cloneprototypeDemo1.getAge()+"；身高："+cloneprototypeDemo1.getHeight()+";体重："+cloneprototypeDemo1.getWeight()+";性别是："+cloneprototypeDemo1.getGender());
        System.out.println("新女朋友的数据是：她叫："+cloneprototypeDemo2.getName()+"；年龄："+cloneprototypeDemo2.getAge()+"；身高："+cloneprototypeDemo2.getHeight()+";体重："+cloneprototypeDemo2.getWeight()+";性别肯定还是："+cloneprototypeDemo2.getGender());
    }
}
