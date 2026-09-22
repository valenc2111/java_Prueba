package ej2tp3;

public abstract class CuentaBancaria {
    protected String nombre;
    protected double saldo;
    
    
    public CuentaBancaria(String  n){
        this.nombre=n;
        saldo=0;  
    }
    
    public void extraer(double monto){
        this.saldo-=monto;
    }


    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double monto){
        this.saldo+=monto;       
    }

}


