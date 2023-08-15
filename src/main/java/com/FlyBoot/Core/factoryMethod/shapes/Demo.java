package com.FlyBoot.Core.factoryMethod.shapes;

import com.FlyBoot.Core.factoryMethod.shapes.factory.ShapeFactory;
import com.FlyBoot.Core.factoryMethod.shapes.factory.SquareFactory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory cicleFactory = new SquareFactory(5, 5);
        cicleFactory.imprimir();
    }
}
