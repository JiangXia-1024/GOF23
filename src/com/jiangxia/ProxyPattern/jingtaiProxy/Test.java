package com.jiangxia.ProxyPattern.jingtaiProxy;

/**
 * @Author: 江夏
 * @Date: 2021/10/31/10:15
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        FangDong fangke = new FangKe();
        FangDong zhongjie = new ZhongJie(new FangKe());
        zhongjie.lookHouse();
        zhongjie.sign();
    }
}
