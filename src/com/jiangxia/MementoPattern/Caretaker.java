package com.jiangxia.MementoPattern;

/**
 * @Author: 江夏
 * @Date: 2021/11/24/20:18
 * @Description:管理类（Caretaker）：对备忘录进行管理，保存和提供备忘录。
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
