package com.jiangxia.DecoratorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/16:17
 * @Description:旧款手机实现手机的接口
 */
public class OldPhone implements Phone{
    @Override
    public void photo() {
        System.out.println("手机的拍照功能");
    }

}
