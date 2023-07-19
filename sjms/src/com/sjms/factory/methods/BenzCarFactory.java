package com.sjms.factory.methods;

class BenzCarFactory extends CarFactory{
    public ICar createCar(){
        return new BenzCar();
    }
}
