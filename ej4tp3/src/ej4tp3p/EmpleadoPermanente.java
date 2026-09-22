package ej4tp3p;

public abstract class EmpleadoPermanente extends Empleado{
    
    protected int antiguedad;
    protected double sueldoBase;
    
    public EmpleadoPermanente(String n, int l,String d, int a, double sb) 
    {
        super(n,l,d);
        this.antiguedad=a;
        this.sueldoBase=sb;
    }


    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    @Override
    public double calcularNeto(){
        return calcularBruto()-calcularBruto()*0.17;    
    }
    
    public abstract double calcularBruto();
    
}
