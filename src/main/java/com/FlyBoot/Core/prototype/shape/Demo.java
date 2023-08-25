package com.FlyBoot.Core.prototype.shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.radio = 10;
        circle.x = 14;
        circle.y = 20;
        circle.color = "red";
        shapes.add(circle);
        Circle copia = (Circle) circle.clone();
        shapes.add(copia);
        Rectangule rectangule = new Rectangule();
        rectangule.h = 30;
        rectangule.b = 12;
        rectangule.color = "blue";
        rectangule.y = 10;
        rectangule.x = 15;
        shapes.add(rectangule);
        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }

    }
}
