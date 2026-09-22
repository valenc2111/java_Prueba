package ej4tp3p;

public class Experto extends EmpleadoPermanente {
    public Experto(String n, int l, String d,int a,int sb){
        super(n,l,d,a,sb);    
    }
    
    @Override
    public double calcularBruto(){
        return sueldoBase + (sueldoBase * 0.50) + (sueldoBase * 0.015 *antiguedad);    
    }
}
