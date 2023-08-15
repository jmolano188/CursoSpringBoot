package com.FlyBoot.Core.factoryMethod.shapes.factory;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;
import com.FlyBoot.Core.factoryMethod.shapes.products.TriangleRecShape;

public class TriangleRecFactory extends ShapeFactory{
    private double width;
    private double height;

    public TriangleRecFactory(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public Shape createShape() {
        return new TriangleRecShape(width, height);
    }
}
