package com.jiangxia.InterpreterPattern;

/**
 * @author jiangxia
 * @date 2021年11月28日 19:37
 * 环境类
 */
public class Context {
    private String[] persons = {"小明","小红","小白"};
    private String behaverior = "吃";
    private String[] things = {"鸡翅","汉堡","牛排"};
    private AbstractExpression exp;
    public Context() {
        //数据初始化
        AbstractExpression personexp = new TerminalExpression(persons);
        AbstractExpression thingexp = new TerminalExpression(things);
        exp = new NonterminalExpression(personexp,thingexp);
    }
    public void operation(String string) {
        //调用相关表达式类的解释方法
        boolean flag = exp.interpreter(string);
        if(!flag){
            System.out.println(string+"吃汉堡");
        }else{
            System.out.println(string+"不吃汉堡");
        }
    }
}
