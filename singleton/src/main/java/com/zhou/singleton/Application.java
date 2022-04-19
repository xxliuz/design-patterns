package com.zhou.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 10:03
 * @Description:
 */
@Slf4j
public class Application {
    public static void main(String[] args) {

        //迫切地初始化单例
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        log.info("ivoryTower1={}", ivoryTower1);
        log.info("ivoryTower2={}", ivoryTower2);

        // 懒惰初始化的单例
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        log.info("threadSafeIvoryTower1={}", threadSafeIvoryTower1);
        log.info("threadSafeIvoryTower2={}", threadSafeIvoryTower2);

        // 枚举单例
        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        log.info("enumIvoryTower1={}", enumIvoryTower1);
        log.info("enumIvoryTower2={}", enumIvoryTower2);

        // 双重检查锁
        ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
        log.info(dcl1.toString());
        ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
        log.info(dcl2.toString());

        // initialize on demand holder idiom
        InitializingOnDemandHolderIdiom demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
        log.info(demandHolderIdiom.toString());
        InitializingOnDemandHolderIdiom demandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        log.info(demandHolderIdiom2.toString());
    }
}
