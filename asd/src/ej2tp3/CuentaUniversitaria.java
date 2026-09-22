package ej2tp3;

public class CuentaUniversitaria extends CuentaBancaria{

   private double acumRetiro;
    
    public CuentaUniversitaria(String n) 
    {
        super(n);
        this.acumRetiro=0;
        
    }
    @Override
    public void extraer(double monto)
    {
        if(acumRetiro<1000 && this.saldo >= monto && monto<=1000)
        {
            this.acumRetiro+=monto;
            super.extraer(monto);
        }
        else
            System.out.println("limite de extraccion alcanzado reintente con otro monto o espere 1 mes nigga");
        
        
    }
}
