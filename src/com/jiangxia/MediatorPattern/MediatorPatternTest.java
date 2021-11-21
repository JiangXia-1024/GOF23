package com.jiangxia.MediatorPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:19
 * @Description:
 */
public class MediatorPatternTest {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.look(c1);
        md.look(c2);
        c1.send();
        c2.send();
    }
}
