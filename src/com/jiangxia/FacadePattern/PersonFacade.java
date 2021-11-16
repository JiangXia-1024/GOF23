package com.jiangxia.FacadePattern;

import com.jiangxia.DecoratorPattern.OldPhone;

/**
 * @Author: 江夏
 * @Date: 2021/11/16/20:47
 * @Description: 整合操作的对外的外观类
 */
public class PersonFacade {

    private Person chirldren;

    private Person youngman;

    private Person oldman;

    public PersonFacade() {
        this.chirldren = new Chirldren();
        this.youngman = new YoungMan();
        this.oldman = new OldMan();
    }

    public void sayFacade(){
        chirldren.say();
        youngman.say();
        oldman.say();
    }
}
