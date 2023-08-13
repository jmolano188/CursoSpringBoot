package com.FlyBoot.Core.singleton;

import java.util.Objects;

public class singletonOneHilo {

    public static singletonOneHilo instance;
    private  String value;

    private singletonOneHilo(String value){
        this.value = value;
    }

    public static singletonOneHilo getInstance(String value){
        if(instance == null){
             instance = new singletonOneHilo(value);
            return instance;
        }
        else {
            return instance;
        }
    }

    @Override
    public String toString() {
        return "singletonOneHilo{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof singletonOneHilo)) return false;
        singletonOneHilo that = (singletonOneHilo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
