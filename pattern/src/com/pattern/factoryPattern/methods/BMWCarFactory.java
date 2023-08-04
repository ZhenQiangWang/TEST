package com.pattern.factoryPattern.methods;

class BMWCarFactory extends CarFactory{
    public ICar createCar(){
        return new BMWCar();
    }
}