package com.jiangxia.Prototype;

/**
 * @Author: 江夏
 * @Date: 2021/10/24/10:36
 * @Description: 深拷贝测试代码
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClonePrototypeDemo22 deep = new DeepClonePrototypeDemo22();
        deep.gender = "女";
        deep.deepClonePrototypeDemo2 = new DeepClonePrototypeDemo2(21, "韩梅梅",50,168);

        //重写clone方法 完成深拷贝
        DeepClonePrototypeDemo22 deep2 = (DeepClonePrototypeDemo22) deep.clone();

        System.out.println("性别：" + deep.gender + ";姓名：" +deep.deepClonePrototypeDemo2.getName()+ ";年龄：" +deep.deepClonePrototypeDemo2.getAge()+ ";身高：" +deep.deepClonePrototypeDemo2.getHeight()+ ";体重：" +deep.deepClonePrototypeDemo2.getWeight()+"||||"+deep.deepClonePrototypeDemo2.hashCode());
        System.out.println("第一种深拷贝后性别：" + deep.gender + ";姓名：" +deep2.deepClonePrototypeDemo2.getName()+ ";年龄：" +deep2.deepClonePrototypeDemo2.getAge()+ ";身高：" +deep2.deepClonePrototypeDemo2.getHeight()+ ";体重：" +deep2.deepClonePrototypeDemo2.getWeight()+"||||"+deep2.deepClonePrototypeDemo2.hashCode());
        System.out.println("===========我是分隔符====================");
        //序列化实现深拷贝
        DeepClonePrototypeDemo22 deep3 = (DeepClonePrototypeDemo22) deep.deepClone();

        System.out.println("性别：" + deep.gender + ";姓名：" +deep.deepClonePrototypeDemo2.getName()+ ";年龄：" +deep.deepClonePrototypeDemo2.getAge()+ ";身高：" +deep.deepClonePrototypeDemo2.getHeight()+ ";体重：" +deep.deepClonePrototypeDemo2.getWeight()+"||||"+deep.deepClonePrototypeDemo2.hashCode());
        System.out.println("第二种深拷贝后性别：" + deep3.gender + ";姓名：" +deep3.deepClonePrototypeDemo2.getName()+ ";年龄：" +deep3.deepClonePrototypeDemo2.getAge()+ ";身高：" +deep3.deepClonePrototypeDemo2.getHeight()+ ";体重：" +deep3.deepClonePrototypeDemo2.getWeight()+"||||"+deep3.deepClonePrototypeDemo2.hashCode());
    }
}
