package ej6tp3p;

public abstract class Elemento {
    protected String nombre;
    protected String fechaCreacion;
    
    public Elemento (String n, String fc){
        this.nombre=n;
        this.fechaCreacion=fc;
    }
    
    public abstract double getTamaño();
    public abstract void listar(String ident);
}
