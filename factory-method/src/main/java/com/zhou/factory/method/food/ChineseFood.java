package com.zhou.factory.method.food;


/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:32
 * @Description: 中餐
 */
public class ChineseFood implements Food {

    FoodType foodType;
    public ChineseFood(FoodType foodType){
        this.foodType = foodType;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "ChineseFood{" +
                "foodType=" + foodType.getFoodTypeName() +
                '}';
    }
}
