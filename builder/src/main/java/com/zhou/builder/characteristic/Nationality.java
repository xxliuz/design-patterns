package com.zhou.builder.characteristic;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 14:27
 * @Description: 国籍
 */
public enum Nationality {

    CHINA("中国"),
    RUSSIA("俄罗斯"),
    USA("美国"),
    JAPAN("日本"),
    UK("英国");

    private String name;

    Nationality(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
