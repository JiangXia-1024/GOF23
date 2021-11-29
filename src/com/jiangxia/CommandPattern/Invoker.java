package com.jiangxia.CommandPattern;

/**
 * @author jiangxia
 * @date 2021年11月29日 22:14
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void dosomething() {
        System.out.println("这里是调用者，执行命令");
        command.execute();
    }
}
