package com.jiangxia.ProxyPattern.Dongtai;

import com.jiangxia.ProxyPattern.jingtaiProxy.FangDong;
import com.jiangxia.ProxyPattern.jingtaiProxy.FangKe;

import java.lang.reflect.Proxy;

public class Test {
   public static void main(String[] args) {
         FangDong fangek =new FangKe();
         proxyHandler handler = new proxyHandler(fangek);
         FangDong zhongjie = (FangDong)Proxy.newProxyInstance
                      (ClassLoader.getSystemClassLoader(), new Class[]{FangDong.class}, handler);
         zhongjie.sign();

   }
}