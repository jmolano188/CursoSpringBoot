package com.FlyBoot.Core.prototype.shape;

public class Rectangule extends Shape{

    protected int b;
    protected int h;

    public Rectangule(){}
    public Rectangule(Rectangule target){
        super(target);
        if(target != null){
            this.b = target.b;
            this.h = target.h;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangule(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangule)) return false;
        if (!super.equals(o)) return false;
        Rectangule that = (Rectangule) o;
        if (b != that.b) return false;
        return h == that.h;
    }
}
