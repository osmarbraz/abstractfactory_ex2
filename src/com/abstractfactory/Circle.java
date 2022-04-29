package com.abstractfactory;

public abstract class Circle extends Shape {

    private float radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
