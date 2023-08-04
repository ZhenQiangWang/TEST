package com.pattern.factoryPattern.methods;

class BenzCarFactory extends CarFactory{
    public ICar createCar(){
        return new BenzCar();
    }
}
