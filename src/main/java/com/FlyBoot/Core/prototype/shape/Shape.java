package com.FlyBoot.Core.prototype.shape;

import java.util.Objects;

public  abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    public Shape(){}

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color =target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        if (x != shape.x) return false;
        if (y != shape.y) return false;
        return Objects.equals(color, shape.color);
    }

}
