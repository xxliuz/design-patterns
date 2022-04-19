package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 10:07
 * @Description: Initialize-on-demand-holder 习惯用法是在 Java 中创建惰性初始化单例对象的安全方法。懒加载，线程安全，代码简单
 */
public final class InitializingOnDemandHolderIdiom {

    private InitializingOnDemandHolderIdiom(){
    }

    /**
     * 因为java机制规定，内部类HelperHolder只有在getInstance()方法第一次调用的时候才会被加载（实现了lazy），
     * 而且其加载过程是线程安全的（实现线程安全）。内部类加载的时候实例化一次instance。
     */
    private static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE = new InitializingOnDemandHolderIdiom();
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }
}
