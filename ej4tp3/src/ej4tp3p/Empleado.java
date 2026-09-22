package ej4tp3p;

public abstract class Empleado {
     protected String nombre;
    protected int legajo;
    protected String domicilio;
    
    public Empleado(String n,int l, String d)
    {
        this.nombre=n;
        this.legajo=l;
        this.domicilio=d;
    
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public abstract double calcularNeto();
}


