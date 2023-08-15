package com.FlyBoot.Core.factoryMethod.shapes.factory;

import com.FlyBoot.Core.factoryMethod.shapes.interfaces.Shape;

public abstract class ShapeFactory {
    public void imprimir(){
        Shape shape = createShape();
        System.out.println(shape.getNameShape());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimetro: " + shape.calculatePerimeter());
    }
    public abstract Shape createShape();
}
