package com.pattern.factoryPattern.methods;

/**
 * 工厂方法模式
 * 多工厂单产品，从多工厂生产同一种产品
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        CarFactory factory = new BenzCarFactory();
        ICar car = factory.createCar();
        car.run();
        factory = new BMWCarFactory();
        car = factory.createCar();
        car.run();
    }
}
