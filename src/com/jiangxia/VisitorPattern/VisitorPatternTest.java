package com.jiangxia.VisitorPattern;

import java.util.List;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:33
 * @Description:访问者模式测试类
 */
public class VisitorPatternTest {
    public static void main(String[] args) {
        List<Element> list = ObjectStruture.getList();
        for(Element e: list){
            e.accept(new ConcreteVisitor());
        }
    }
}
