package com.zhou.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 15:33
 * @Description:
 */
@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("The alchemist begins his work.");
        Coin coin1 = CoinFactory.getCoin(CoinType.COPPER);
        Coin coin2 = CoinFactory.getCoin(CoinType.GOLD);
        log.info(coin1.getDescription());
        log.info(coin2.getDescription());
    }
}
