package com.jiangxia.StatePattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/25/20:56
 * @Description:
 */
/**
 * 具体的状态子类A
 * @author  lvzb.software@qq.com */
public class ConcreteState3 extends State {
    private Context context;

    public ConcreteState3(Context context){
        context= context;
    }

    @Override
    public void Do() {
        System.out.println("吃跑了，来外面散散步");
        checkState();

    }

    /**
     * 检查状态 是否需要进行状态的转换<br/>
     * 状态的切换由具体状态子类中实现     */
    private void checkState(){
        if (context.getisHungry()) {
           // context.setState(new ConcreteState1(context.getState()));
        }
    }
}
