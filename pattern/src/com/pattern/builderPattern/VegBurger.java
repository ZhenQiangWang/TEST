package com.pattern.builderPattern;

public class VegBurger extends Burger {


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

    public void test() {
        System.out.println("123");
    }
}
