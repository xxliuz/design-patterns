package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Sailor;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:38
 * @Description: 年轻的水手
 */
public class YoungSailor implements Sailor {
    private static final String DESCRIPTION = "我是一名年轻的水手";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
