package ej6tp3p;

public class ArchivoComprimido extends Directorio {
    private double tasaCompresion;
    public ArchivoComprimido(String n,String fc,double tc) {
        super(n,fc);
        this.tasaCompresion=tc;
    }
    
    @Override
        public double getTamaño(){
            return super.getTamaño()*this.tasaCompresion;
        }
}
