package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/18 18:54
 * @Description:
 */
public enum  EnumIvoryTower {
    INSTANCE;

    public String toString(){
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
