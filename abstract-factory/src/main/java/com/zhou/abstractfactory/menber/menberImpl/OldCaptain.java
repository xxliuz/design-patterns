package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Captain;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:32
 * @Description: 老船长
 */
public class OldCaptain implements Captain {

    private static final String DESCRIPTION = "我是一名老船长";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
