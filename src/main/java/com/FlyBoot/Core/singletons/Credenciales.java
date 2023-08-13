package com.FlyBoot.Core.singletons;

import java.util.Objects;

/**
 * Singleton
 * @author IMENDOZA
 */
public class Credenciales {
    // The field must be declared volatile so that double check lock would work
    // correctly. Esto se usa para solucion al multihilo
    private static volatile Credenciales instance;
    private final String user;
    private final String pwd;

    private Credenciales(String user, String pwd) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.user = user;
        this.pwd = pwd;
    }

    /* //Metodo que se implemento para el hilo unico
    public static Credenciales getInstance(String user, String pwd){
        if(instance == null){
            instance = new Credenciales(user, pwd);
        }
        return instance;
    }
     */

    // The approach taken here is called double-checked locking (DCL). It
    // exists to prevent race condition between multiple threads that may
    // attempt to get singleton instance at the same time, creating separate
    // instances as a result.
    //
    // It may seem that having the `result` variable here is completely
    // pointless. There is, however, a very important caveat when
    // implementing double-checked locking in Java, which is solved by
    // introducing this local variable.
    //
    // You can read more info DCL issues in Java here:
    // https://refactoring.guru/java-dcl-issue

    /**
     * Metodo que da solucion al asincronismo en los multihilos
     */
    public static Credenciales getInstance(String user, String pwd){
        Credenciales result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Credenciales.class){
            if(instance == null){
                instance = new Credenciales(user, pwd);
            }
            return instance;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credenciales that = (Credenciales) o;
        return Objects.equals(user, that.user) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, pwd);
    }

    @Override
    public String toString() {
        return "Credenciales{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
