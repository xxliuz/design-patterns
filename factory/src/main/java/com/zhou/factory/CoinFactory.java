package com.zhou.factory;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 15:25
 * @Description: CoinFactory 工厂类
 */
public class CoinFactory {

    /**
     * 工厂方法将硬币类型作为参数并调用相应的类。
     */
    public static Coin getCoin(CoinType coinType){
        return coinType.getConstructor().get();
    }
}
