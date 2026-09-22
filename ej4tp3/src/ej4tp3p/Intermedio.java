package ej4tp3p;

public class Intermedio extends EmpleadoPermanente {
    public Intermedio(String n, int l,String d, int a, int sb)
    {
        super(n,l,d,a,sb);
    
    }
    @Override
    public double calcularBruto(){
        return sueldoBase + (sueldoBase * 0.25) + (sueldoBase * 0.01 * antiguedad);    
    }
}