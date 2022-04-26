package com.zhou.builder.characteristic;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 14:29
 * @Description: 肤色
 */
public enum SkinColor {

    YELLOW("黄色"),
    BLACK("黑色"),
    WHITE("白色");

    private String color;

    SkinColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
