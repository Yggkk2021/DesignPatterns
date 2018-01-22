package com.builder.pattern.admin;

import com.builder.pattern.model.Beer;
import com.builder.pattern.model.BigBurger;
import com.builder.pattern.model.ChickenBurger;
import com.builder.pattern.model.Coke;

/**
 * Create by yangshunfan
 * 2018/1/22 13:23
 */
public class MealBuilder {

    /**
     * 准备快餐
     * @return
     */
    public Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem(new BigBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Beer());
        return meal;
    }
}
