package com.FlyBoot.Core.factoryMethod.shapes.factory;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;
import com.FlyBoot.Core.factoryMethod.shapes.products.SquareShape;

public class SquareFactory extends ShapeFactory{

    private double width;
    private double height;

    public SquareFactory(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        return new SquareShape(width, height);
    }
}
