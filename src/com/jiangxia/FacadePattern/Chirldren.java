package com.jiangxia.FacadePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/20:45
 * @Description:
 */
public class Chirldren implements Person {
    @Override
    public void say() {
        System.out.println("小孩说话咿呀咿呀");
    }
}
