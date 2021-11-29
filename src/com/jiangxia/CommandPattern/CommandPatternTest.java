package com.jiangxia.CommandPattern;

/**
 * @author jiangxia
 * @date 2021年11月29日 22:14
 */
public class CommandPatternTest {
    public static void main(String[] args){
        Command command = new ConcreteCommand();
        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker(command);
        System.out.println("客户端请求调用者");
        invoker.dosomething();
    }
}
