package com.pattern.factory.simple;

public class ShapeDemo {
    public static void main(String[] args) {
        try {
            SimpleFactory.createShape("Circle");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
