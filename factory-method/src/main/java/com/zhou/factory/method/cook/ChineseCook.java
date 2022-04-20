package com.zhou.factory.method.cook;

import com.zhou.factory.method.food.ChineseFood;
import com.zhou.factory.method.food.Food;
import com.zhou.factory.method.food.FoodType;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:39
 * @Description: 中餐厨师
 */
public class ChineseCook implements Cook{
    @Override
    public Food cookFood(FoodType foodType) {
        return new ChineseFood(foodType);
    }

}
