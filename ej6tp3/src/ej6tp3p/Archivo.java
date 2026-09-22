package ej6tp3p;

public class Archivo extends Elemento {
    
    private String fechaModificacion;
    private double tamañoBase;
    
    public Archivo(String n,String fc,String fm,double tb) {
        super(n,fc);
        this.fechaModificacion=fm;
        this.tamañoBase=tb;
    }
    
    @Override
        public double getTamaño(){
            return this.tamañoBase;
        }
    
    @Override
        public void listar(String indent) {
            System.out.println(indent + "- " + nombre + " (" + getTamaño() + " kb)");
        }
}
