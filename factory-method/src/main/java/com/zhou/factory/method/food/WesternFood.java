package com.zhou.factory.method.food;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:36
 * @Description: 西餐
 */
public class WesternFood implements Food{

    FoodType foodType;

    public WesternFood(FoodType foodType){
        this.foodType = foodType;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "WesternFood{" +
                "foodType=" + foodType.getFoodTypeName() +
                '}';
    }
}
