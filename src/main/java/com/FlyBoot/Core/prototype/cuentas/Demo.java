package com.FlyBoot.Core.prototype.cuentas;

public class Demo {
    public static void main(String[] args) {
        CuentaAhorroImpl cuentaAhorro = new CuentaAhorroImpl();
        cuentaAhorro.setSaldo(200);
        CuentaAhorroImpl cuentaAhorroClonada = (CuentaAhorroImpl) cuentaAhorro.clonar();

        if(cuentaAhorroClonada != null) System.out.println(cuentaAhorroClonada);

        System.out.println(cuentaAhorro == cuentaAhorroClonada);

        CuentaAhorroImpl cuentaAhorro1 = cuentaAhorro;
        cuentaAhorro1.setSaldo(100);
        System.out.println(cuentaAhorro.getSaldo());
        System.out.println(cuentaAhorro1.getSaldo());

        Integer a = 3;
        Integer b = a;
        b = 6;
        System.out.println(a);
        System.out.println(b);

    }
}
