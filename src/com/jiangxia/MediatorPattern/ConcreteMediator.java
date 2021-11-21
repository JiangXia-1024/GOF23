package com.jiangxia.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 江夏
 * @Date: 2021/11/21/20:13
 * @Description:
 */
public class ConcreteMediator extends Mediator {
    //list同事管理对象
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    public void look(Colleague cl) {
        if (!colleagues.contains(cl)) {
            colleagues.add(cl);
            cl.setMedium(this);
        }
    }

    @Override
    public void regist(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).get();
            }
        }
    }
}
