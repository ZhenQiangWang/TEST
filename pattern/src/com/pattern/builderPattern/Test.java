package com.pattern.builderPattern;

/**
 * 建造者模式
 * 复杂类分多个实例创建
 */
public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
    }
}
