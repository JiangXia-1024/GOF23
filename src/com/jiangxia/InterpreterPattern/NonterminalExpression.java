package com.jiangxia.InterpreterPattern;

/**
 * @author jiangxia
 * @date 2021年11月28日 19:38
 * 非终结符表达式类
 */
public class NonterminalExpression extends AbstractExpression  {
    private AbstractExpression person = null;
    private AbstractExpression thing = null;

    public NonterminalExpression(AbstractExpression person, AbstractExpression thing) {
        this.person = person;
        this.thing = thing;
    }

    @Override
    public boolean interpreter(String string) {
        return person.interpreter(string)&&thing.interpreter(string);
    }
}
