package ej4tp3p;

public class Principiante extends EmpleadoPermanente{
    public Principiante(String n,int l,String d,int a,int sb) {
        super(n,l,d,a,sb);
    }
    @Override
    public double calcularBruto(){
        double porcentajePlus = 0;
                if (antiguedad >= 2 && antiguedad < 5) porcentajePlus = 0.05;
                else if (antiguedad >= 5 && antiguedad < 10) porcentajePlus = 0.07;
                else if (antiguedad >= 10 && antiguedad < 15) porcentajePlus = 0.10;
                else if (antiguedad >= 15 && antiguedad <= 20) porcentajePlus = 0.15;
                else if (antiguedad > 20) porcentajePlus = 0.20;
                
                return sueldoBase + (sueldoBase * porcentajePlus);    
    }
}
