package com.jiangxia.DecoratorPattern;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/16:33
 * @Description:具体构件角色
 */
public class ConcreteDecorator extends NewPhone {
    public ConcreteDecorator(OldPhone oldPhone) {
        super(oldPhone);
    }

    public void photo() {
        super.photo();
        video();
    }
    public void video() {
        System.out.println("为手机增加额外的拍视频的功能");
    }
}
