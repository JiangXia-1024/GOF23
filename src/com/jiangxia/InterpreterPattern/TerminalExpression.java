package com.jiangxia.InterpreterPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jiangxia
 * @date 2021年11月28日 19:37
 * 终结符表达式类
 */
public class TerminalExpression extends AbstractExpression {
    private Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            set.add(strings[i]);
        }
    }

    @Override
    public boolean interpreter(String string) {
        if(set.contains(string)){
            return true;
        }else{
            return false;
        }
    }
}
