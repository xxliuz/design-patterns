package com.zhou.factory.method.cook;

import com.zhou.factory.method.food.Food;
import com.zhou.factory.method.food.FoodType;
import com.zhou.factory.method.food.WesternFood;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:40
 * @Description: 西餐厨师
 */
public class WesternCook implements Cook{
    @Override
    public Food cookFood(FoodType foodType) {
        return new WesternFood(foodType);
    }
}
