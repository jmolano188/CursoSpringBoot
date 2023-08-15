package com.FlyBoot.Core.factoryMethod.shapes.products;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;

public class CircleShape implements Shape {
    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public String getNameShape() {
        return "Circle";
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
