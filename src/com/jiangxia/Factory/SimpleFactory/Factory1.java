package com.jiangxia.Factory.SimpleFactory;

/**
 * @Author: 江夏
 * @Date: 2021/10/26/21:42
 * @Description: 工厂类
 */
public class Factory1 {
    public static Product1 getProduct(String string){
        Product1 product1 = null;
        if(string.equals("汽车")){
            product1 = new ConcreteProduct1();
        }else{
            product1 = new ConcreteProduct2();
        }
        return product1;
    }
}
