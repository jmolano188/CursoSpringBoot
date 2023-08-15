package com.FlyBoot.Core.factoryMethod.shapes.products;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;

public class TriangleRecShape implements Shape {

    private double width;
    private double height;
    private Double hypotenuse;

    public TriangleRecShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Double getHypotenuse() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String getNameShape() {
        return "Right triangle";
    }

    @Override
    public Double calculateArea() {
        return width * height /2;
    }

    @Override
    public Double calculatePerimeter() {
        return width + height + getHypotenuse();
    }
}
