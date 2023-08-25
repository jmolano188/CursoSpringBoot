package com.FlyBoot.Core.prototype.cuentahorros;

public class Main {
    public static void main(String[] args) {

        IcuentaImpl cuentaahorro = new IcuentaImpl();
        cuentaahorro.setMonto(3000);
        IcuentaImpl cuentaclonada =cuentaahorro;
        cuentaahorro.setMonto(100);
       int a =3;
       int c =a;
       a=4;
        if(cuentaclonada != null)
        System.out.println(cuentaclonada );
        System.out.println(cuentaahorro );
        System.out.println(cuentaclonada == cuentaahorro);
        System.out.println(a);
        System.out.println(c);
    }
}
