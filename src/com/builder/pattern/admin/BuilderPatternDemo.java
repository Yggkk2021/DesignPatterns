package com.builder.pattern.admin;

/**
 * Create by yangshunfan
 * 2018/1/22 13:29
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal ppMeal = mealBuilder.prepareMeal();
        System.out.println("PP Meal");
        ppMeal.showItem();
        System.out.println("Total Cost:" + ppMeal.getCost());
    }
}
