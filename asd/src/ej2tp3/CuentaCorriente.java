package ej2tp3;

public class CuentaCorriente extends CuentaBancaria {
    double limite;    
    
    public CuentaCorriente(String nombre,double tope){
        super(nombre);  
        this.limite=tope;
    }
    
    @Override
    public void extraer(double monto){
        if(this.saldo-monto >= this.limite)
            super.extraer(monto);
        else
            System.out.println("no se puede extraer");       
    }
    
}
