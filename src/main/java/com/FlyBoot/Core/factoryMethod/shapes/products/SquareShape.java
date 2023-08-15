package com.FlyBoot.Core.factoryMethod.shapes.products;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;

public class SquareShape implements Shape {
    private double width;
    private double height;

    public SquareShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getNameShape() {
        return "Square";
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (width + height);
    }
}
