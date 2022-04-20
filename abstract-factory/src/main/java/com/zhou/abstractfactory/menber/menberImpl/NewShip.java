package com.zhou.abstractfactory.menber.menberImpl;

import com.zhou.abstractfactory.menber.Ship;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 15:28
 * @Description: 新船
 */
public class NewShip implements Ship {

    private static final String DESCRIPTION = "我是一艘崭新的船";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
