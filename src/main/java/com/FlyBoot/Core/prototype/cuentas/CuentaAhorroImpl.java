package com.FlyBoot.Core.prototype.cuentas;

public class CuentaAhorroImpl implements CuentaInterface{

    private String tipo;
    private double saldo;

    public CuentaAhorroImpl() {
        this.tipo = "AHORRO";
    }

    @Override
    public CuentaInterface clonar() {
        CuentaAhorroImpl cuentaAhorro = null;
        try{
            cuentaAhorro = (CuentaAhorroImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuentaAhorro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaAhorroImpl{" +
                "tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
