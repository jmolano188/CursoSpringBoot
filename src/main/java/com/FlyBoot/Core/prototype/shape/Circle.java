package com.FlyBoot.Core.prototype.shape;

public class Circle extends Shape {

    protected int radio;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radio = target.radio;
        }
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radio == circle.radio;
    }
}
