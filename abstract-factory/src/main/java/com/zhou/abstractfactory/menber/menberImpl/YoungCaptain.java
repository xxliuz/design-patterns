package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Captain;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:34
 * @Description: 年轻的船长
 */
public class YoungCaptain implements Captain {
    private static final String DESCRIPTION = "我是一名年轻的船长";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
