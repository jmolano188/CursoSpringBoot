package com.FlyBoot.Core.singleton;

import java.util.Objects;

public class SingletonProtegido {
    public static volatile SingletonProtegido instance;
    private  String value;

    private SingletonProtegido(String value){
        this.value = value;
    }

    public static SingletonProtegido getInstance(String value){
        SingletonProtegido result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonProtegido.class) {
            if (instance == null) {
                instance = new SingletonProtegido(value);
            }
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
    public int hashCode() {
        return Objects.hash(value);
    }
}
