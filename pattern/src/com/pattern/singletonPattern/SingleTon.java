package com.pattern.singletonPattern;

public class SingleTon {
    public static void main(String[] args) {
        BhdlSingleton.getInstance();
        EhdlSingleton.getInstannce();
        LazySingleton.getInstance();
        EnumSingleTon.getInstance();
    }
}
