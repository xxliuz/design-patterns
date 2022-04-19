package com.zhou.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 14:37
 * @Description: 硬币类型
 */
@RequiredArgsConstructor
@Getter
public enum CoinType {
    COPPER(CopperCoin::new),
    GOLD(GoldCoin::new);

    //创建Supplier容器，声明为Coin类型，此时并不会调用对象的构造方法，即不会创建对象,调用get方法时，才会调用构造方法
    private final Supplier<Coin> constructor;

}
