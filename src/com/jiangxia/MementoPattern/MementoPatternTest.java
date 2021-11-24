package com.jiangxia.MementoPattern;

import java.util.Date;

/**
 * @Author: 江夏
 * @Date: 2021/11/24/20:19
 * @Description:
 */
public class MementoPatternTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("这是"+System.currentTimeMillis()+"的状态");
        System.out.println("初始状态:"+originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.create());
        originator.setState("这是"+System.currentTimeMillis()+"的状态");
        System.out.println("过了一段时间后状态:"+originator.getState());
        originator.restore(caretaker.getMemento());
        System.out.println("恢复后状态:"+originator.getState());
    }
}
