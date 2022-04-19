package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/18 18:54
 * @Description: 枚举象牙塔
 */
public enum  EnumIvoryTower {
    /**
     * <p>基于枚举的单例实现。有效的 Java 第 2 版 (Joshua Bloch) p。 18</p>
     * <p>此实现是线程安全的，但是添加任何其他方法及其线程安全 * 是开发人员的责任。</p>
     **/
    INSTANCE;

    public String toString(){
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
