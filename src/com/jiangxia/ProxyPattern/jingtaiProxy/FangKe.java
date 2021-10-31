package com.jiangxia.ProxyPattern.jingtaiProxy;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/10:13
 * @Description:房客
 */
public class FangKe implements FangDong{
    @Override
    public void sign() {
        System.out.println("你签合同了！");
    }

    @Override
    public void lookHouse() {
        System.out.println("你去看房了！");
    }
}
