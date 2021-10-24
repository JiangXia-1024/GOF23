package com.jiangxia.singleton;

/**
 * @Author: 江夏
 * @Date: 2021/10/10/20:12
 * @Description: 枚举单例模式
 */

public class  SingletonDemo05{
    public static void main(String[] args) {
        EnumSingletonDemo5 sd = EnumSingletonDemo5.INSTANCE;
        EnumSingletonDemo5 sd2 = EnumSingletonDemo5.INSTANCE;
        System.out.println(sd==sd2);
        //直接通过EnumSingletonDemo5.INSTANCE.doSomething()的方式调用即可。方便、简洁又安全。
        EnumSingletonDemo5.INSTANCE.singletonOperation();
        }
}

enum EnumSingletonDemo5 {
    /**
     *  定义一个枚举的元素，它就代表了Singleton 的一个实例。
     */
    INSTANCE;
    /**
     *  单例可以有自己的操作
     */
    public void singletonOperation(){
        // TODO
    }
}
