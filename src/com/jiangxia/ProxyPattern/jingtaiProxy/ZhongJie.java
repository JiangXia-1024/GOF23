package com.jiangxia.ProxyPattern.jingtaiProxy;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/10:10
 * @Description: 中介
 */
public class ZhongJie implements FangDong{
    public FangDong fangDong;

    public ZhongJie(FangDong fangDong) {
        this.fangDong = fangDong;
    }

    @Override
    public void sign() {
        System.out.println("中介替房东答应与你签约");
    }

    @Override
    public void lookHouse() {
        System.out.println("中介替房东带你去看房");
    }
}
