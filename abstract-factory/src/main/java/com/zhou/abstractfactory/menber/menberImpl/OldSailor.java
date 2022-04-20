package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Sailor;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:36
 * @Description: 老水手
 */
public class OldSailor implements Sailor {
    private static final String DESCRIPTION = "我是一名老水手";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
