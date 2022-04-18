package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/18 18:54
 * @Description: 枚举象牙塔
 */
public enum  EnumIvoryTower {
    INSTANCE;

    public String toString(){
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
