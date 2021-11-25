package com.jiangxia.StatePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/25/20:42
 * @Description:
 */
public class StatePatternTest {
    public static void main(String[] args) {
        Context context = new Context();
        //设置状态为饿了
        context.setHungry(true);
        context.process();
        //设置状态为不饿
        context.setHungry(false);
        context.process();

    }
}
