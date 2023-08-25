package com.FlyBoot.Core.prototype.cuentas;

public class CuentaCorrienteImpl implements CuentaInterface{
    private String tipo;
    private double saldo;

    private int bolsillos;

    public CuentaCorrienteImpl() {
        this.tipo = "Corriente";
    }

    @Override
    public CuentaInterface clonar() {
        CuentaCorrienteImpl cuentaCorriente = null;
        try{
            cuentaCorriente = (CuentaCorrienteImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuentaCorriente;
    }
}
