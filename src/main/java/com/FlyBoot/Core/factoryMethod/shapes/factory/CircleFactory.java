package com.FlyBoot.Core.factoryMethod.shapes.factory;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;
import com.FlyBoot.Core.factoryMethod.shapes.products.CircleShape;

public class CircleFactory extends ShapeFactory{

    private double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new CircleShape(radius);
    }
}
