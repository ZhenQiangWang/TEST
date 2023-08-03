package com.pattern.facadePattern;

public class ShapeMaker {
    private Shape rectangle;

    public ShapeMaker() {
        rectangle = new Rectangle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
