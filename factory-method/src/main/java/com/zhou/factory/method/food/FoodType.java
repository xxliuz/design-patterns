package com.zhou.factory.method.food;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:27
 * @Description: 食物类型
 */
public enum  FoodType {
    HOT("热的"),COLD("凉的");

    private String foodType;

    FoodType(String foodType){
        this.foodType = foodType;
    }

    public String getFoodTypeName() {
        return foodType;
    }
}
