package com.jiangxia.CommandPattern;

/**
 * @author jiangxia
 * @date 2021年11月29日 22:13
 * 具体子类
 */
public class ConcreteCommand extends Command{
    private Receiver receiver;
    public ConcreteCommand(){
        this.receiver = new Receiver();
    }
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
