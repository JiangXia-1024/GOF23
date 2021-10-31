package com.jiangxia.ProxyPattern.Dongtai;

import com.jiangxia.ProxyPattern.jingtaiProxy.FangDong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxyHandler  implements InvocationHandler {

         private FangDong userImpl;
         public proxyHandler(FangDong userImpl){
             this.userImpl= userImpl;
         }
         @Override
         public Object invoke(Object proxy, Method method, Object[] args)
                                        throws Throwable {
                   Object object = null;
       //方法开始前做一些事情
       if (method.getName().equals("sign")) {
           //激活调用的方法
           object = method.invoke(userImpl, args);
       }
       //方法结束后做一些事情
       return object;
    }
}