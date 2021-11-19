package com.jiangxia.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 江夏
 * @Date: 2021/11/19/22:25
 * @Description:享元工厂
 */
public class FlyweightFactory {
    private Map<String,Flyweight> files = new HashMap<String,Flyweight>();

    public Flyweight factory(String state){
        //先从缓存中查找对象
        Flyweight flyObject = files.get(state);
        if(flyObject == null){
            //如果对象不存在则创建一个新的Flyweight对象
            flyObject = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, flyObject);
        }
        return flyObject;
    }
}
