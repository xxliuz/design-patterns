package com.zhou.memento;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 15:13
 * @Description:
 */
public class Memento {
    private String state;
    private Date storeDate;

    public Memento(String state){
        this.state = state;
        this.storeDate = new Date(System.currentTimeMillis());
    }

    public String getState(){
        return state;
    }
    public String getstoreDate(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        return formatter.format(storeDate);
    }
}