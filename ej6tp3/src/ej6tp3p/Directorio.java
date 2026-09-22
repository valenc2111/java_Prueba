package ej6tp3p;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento {
   protected List <Elemento> contenido;
    
    public Directorio(String n, String fc) {
        super(n,fc);
        this.contenido=new ArrayList<>();
    }
    
    public void agregar(Elemento e){
        this.contenido.add(e);
    }
    
    @Override
        public double getTamaño(){
            double total=0;
            for(Elemento e : contenido)
                total+=e.getTamaño();
            return total;
        }
    @Override
        public void listar(String ident){
            System.out.println(ident + "+ " + nombre + " (" + getTamaño() + " kb)");
                    for (Elemento e : contenido) 
                        e.listar(ident + "  ");
                    
        }
}
