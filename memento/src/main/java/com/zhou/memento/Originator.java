package com.zhou.memento;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 15:14
 * @Description:
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void setStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
