package com.zhou.factory;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 14:39
 * @Description: CopperCoin
 */
public class CopperCoin implements Coin{

    static final String DESCRIPTION = "This is a copper coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
