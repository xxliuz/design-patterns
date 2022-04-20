package com.zhou.factory.method;

import com.zhou.factory.method.cook.ChineseCook;
import com.zhou.factory.method.cook.Cook;
import com.zhou.factory.method.cook.WesternCook;
import com.zhou.factory.method.food.Food;
import com.zhou.factory.method.food.FoodType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    private final Cook cook;

    public Application(Cook cook) {
        this.cook = cook;
    }

    private void makeFood(){
        Food food;
        food = cook.cookFood(FoodType.COLD);
        log.info(food.toString());
        food = cook.cookFood(FoodType.HOT);
        log.info(food.toString());
    }

    public static void main(String[] args) {
        Application application = new Application(new ChineseCook());
        application.makeFood();
        application = new Application(new WesternCook());
        application.makeFood();
    }

}
