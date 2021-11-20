package com.jiangxia.VisitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: 江夏
 * @Date: 2021/11/20/22:33
 * @Description:一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map这类的聚合类实现，但是在项目中一般很少抽象出这个角色。
 */
public class ObjectStruture {
    public static List<Element> getList(){
        List<Element> list = new ArrayList<Element>();
        Random ran = new Random();
        for(int i=0; i<10; i++){
            int a = ran.nextInt(100);
            if(a>50){
                list.add(new ConcreteElement1());
            }else{
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}
