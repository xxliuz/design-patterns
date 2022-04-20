package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Ship;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:30
 * @Description: 旧船
 */
public class OldShip implements Ship {

    private static final String DESCRIPTION = "我是一艘破旧的船";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
