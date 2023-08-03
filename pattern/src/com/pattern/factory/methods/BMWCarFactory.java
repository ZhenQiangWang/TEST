package com.pattern.factory.methods;

class BMWCarFactory extends CarFactory{
    public ICar createCar(){
        return new BMWCar();
    }
}