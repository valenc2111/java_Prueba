package ej4tp3p;

public class EmpleadoTemporario extends Empleado{
    
  protected  double horasTrabajadas;
   protected double sueldoxHora;
    
    public EmpleadoTemporario(String n,int l, String d,double ht,double s) {
        super(n,l,d);
        this.sueldoxHora=s;
        this.horasTrabajadas=ht;
    }

    @Override
    public double calcularNeto()
    {
        return this.horasTrabajadas*this.sueldoxHora;   
    }


    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSueldoxHora() {
        return sueldoxHora;
    }

}
