package com.FlyBoot.Core.prototype.cuentahorros;

public class IcuentaImpl implements Icuenta{
    private String cuenta;
    protected Integer monto;

    public IcuentaImpl(){
        this.cuenta = "ahorros";
    }
    @Override
    public Icuenta clonar() {
        IcuentaImpl cuenta = null;
        try {
            cuenta = (IcuentaImpl) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    return cuenta;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "IcuentaImpl{" + "cuenta='" + cuenta + '\'' + ", monto=" + monto + '}';
    }
}
