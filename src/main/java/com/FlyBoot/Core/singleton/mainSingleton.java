package com.FlyBoot.Core.singleton;

/**
 * @a
 */
public class mainSingleton {
    public static void main(String[] args) {

        //implementacion de un hilo
/*
        System.out.println(singletonOneHilo.getInstance("broo"));
        System.out.println(singletonOneHilo.getInstance("hola"));
*/
        // multihilo
        /*
        Thread h1 = new Thread( new hilo1());
        Thread h2 = new Thread( new hilo2());
        h1.start();
        h2.start();

         */

        // multihilo protegido
        Thread h1p = new Thread( new hilo1p());
        Thread h2p = new Thread( new hilo2p());
        h1p.start();
        h2p.start();

    }

    static class hilo1 implements Runnable{

        @Override
        public void run() {
           singletonOneHilo s1 = singletonOneHilo.getInstance("broo");
            System.out.println(s1.toString());
        }
    }

    static class hilo2 implements Runnable{

        @Override
        public void run() {
            singletonOneHilo s2 = singletonOneHilo.getInstance("Hola");
            System.out.println(s2.toString());
        }
    }
    static class hilo1p implements Runnable{

        @Override
        public void run() {
            SingletonProtegido s1 = SingletonProtegido.getInstance("broo");
            System.out.println(s1.toString());
        }
    }

    static class hilo2p implements Runnable{

        @Override
        public void run() {
            SingletonProtegido s2 = SingletonProtegido.getInstance("Hola");
            System.out.println(s2.toString());
        }
    }
}
