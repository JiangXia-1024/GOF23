package com.jiangxia.DecoratorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/16:18
 * @Description: 新手机
 */
public class NewPhone implements  Phone{

    public OldPhone oldPhone;

    public NewPhone(OldPhone oldPhone) {
        this.oldPhone = oldPhone;
    }

    @Override
    public void photo() {
        System.out.println("手机的拍照功能");
    }

}
