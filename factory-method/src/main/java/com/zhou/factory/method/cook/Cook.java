package com.zhou.factory.method.cook;

import com.zhou.factory.method.food.Food;
import com.zhou.factory.method.food.FoodType;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/20 16:26
 * @Description: 厨师
 */
public interface Cook {

    Food cookFood(FoodType foodType);
}
