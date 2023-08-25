package com.FlyBoot.Core.prototype.shapes;

import java.util.Objects;

public abstract class Shapes {
    public int x;
    public int y;
    public String color;

    public Shapes() {
    }

    public Shapes(Shapes target) {
        if (target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shapes clonar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapes = (Shapes) o;
        return x == shapes.x && y == shapes.y && Objects.equals(color, shapes.color);
    }

}
