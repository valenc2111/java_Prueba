package ej6tp3p;

public class  Link extends Elemento {
    private Elemento destino;
    
    public Link(String n,String fc, Elemento d) {
        super(n,fc);
        this.destino=d;
    }
    
    @Override
        public double getTamaño(){
            return 1.0;
        }
    @Override
        public void listar(String ident){
            System.out.println(ident + "~ " + nombre + " -> apunta a " + destino.nombre + " (1.0 kb)");
        }
}
