package com.zhou.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 15:15
 * @Description:
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}