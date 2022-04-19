package com.zhou.factory;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 14:39
 * @Description: GoldCoin
 */
public class GoldCoin implements Coin{
    static final String DESCRIPTION = "This is a gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
