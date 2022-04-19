package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 10:18
 * @Description: 线程安全的单例类。实例被延迟初始化，因此需要同步机制
 */
public final class ThreadSafeLazyLoadedIvoryTower {

    private static volatile ThreadSafeLazyLoadedIvoryTower INSTANCE;

    private ThreadSafeLazyLoadedIvoryTower(){
        if(INSTANCE != null){
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * 在第一次调用该方法之前不会创建实例
     * @return ThreadSafeLazyLoadedIvoryTower 单例
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if(INSTANCE == null){
           synchronized (ThreadSafeLazyLoadedIvoryTower.class){
               if(INSTANCE ==null){
                   INSTANCE = new ThreadSafeLazyLoadedIvoryTower();
               }
           }
       }
        return INSTANCE;
    }
}
