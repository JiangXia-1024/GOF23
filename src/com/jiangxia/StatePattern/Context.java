package com.jiangxia.StatePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/25/20:35
 * @Description:*环境/上下文类
 * 拥有状态对象，且可以完成状态间的转换 [状态的改变/切换 在环境类中实现]
 */
public class Context {
    // 维护一个抽象状态对象的引用
    private State state;
//    // 设置初始状态
//    this.state = new ConcreteStateA(this);
    public State getState() {
        return state;
    }
    /**
     * 设置环境状态<br/>
     * 私有方法，目的是 让环境的状态由系统环境自身来控制/切换,外部使用者无需关心环境内部的状态
     *
     * */
    public void setState(State state) {
        this.state = state;
    }

    public boolean getisHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    private boolean isHungry;
    /**
     * 检查环境状态:状态的改变/切换 在环境类中实现
     * */
    private void checkStates(){
        if(isHungry){
            //如果饿了的状态需要做饭
            setState(new ConcreteState2());
        }else{
            //吃饱了，出去走走
            setState(new ConcreteState1());
        }
    }
    /**
     * 环境处理函数，调用状态实例行为 完成业务逻辑<br/>
     * 根据不同的状态实例引用  在不同状态下处理不同的行为
     * */
    public void process(){
        checkStates();
        state.Do();
    }
}
