package com.sjms.factory.methods;

class BMWCarFactory extends CarFactory{
    public ICar createCar(){
        return new BMWCar();
    }
}