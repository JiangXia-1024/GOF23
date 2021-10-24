package com.jiangxia.Prototype;

import java.io.*;

/**
 * @Author: 江夏
 * @Date: 2021/10/24/10:24
 * @Description:
 */
public class DeepClonePrototypeDemo22 implements Cloneable,Serializable {
    //性别字段
    String gender;
    //其他数据引用类型
    DeepClonePrototypeDemo2 deepClonePrototypeDemo2;

    public DeepClonePrototypeDemo22(){
        super();
    }

    //深拷贝第一种方式：重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deepclone = null;
        //这里完成了对基本数据类型(属性)和 String 的克隆，也就是值的复制
        deepclone = super.clone();
        //这里进行对引用类型的属性的复制进行处理
        DeepClonePrototypeDemo22 deepClonePrototypeDemo22 = (DeepClonePrototypeDemo22) deepclone;
        deepClonePrototypeDemo22.deepClonePrototypeDemo2 = (DeepClonePrototypeDemo2) deepClonePrototypeDemo2.clone();
        return deepClonePrototypeDemo22;
    }

    //深拷贝第一种方式：使用序列化和反序列化实现深复制
    public Object deepClone() {
        //创建流对象，需要继承Serializable接口
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClonePrototypeDemo22 copyObj = (DeepClonePrototypeDemo22) ois.readObject();

            return copyObj;
        }

        catch (Exception e) {
            return null;
        }
        finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }
            catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }


}
