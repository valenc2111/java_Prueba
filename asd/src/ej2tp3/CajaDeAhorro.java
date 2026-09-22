package ej2tp3;

public class CajaDeAhorro extends CuentaBancaria {

    public CajaDeAhorro(String n){
        super(n);    
    }
    @Override
    public void extraer(double monto)
    {
        if(saldo>=monto)
            super.extraer(monto);
        else
            System.out.println("saldo insuficiente");
    
    }



}
