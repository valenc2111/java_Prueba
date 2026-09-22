package ej5tp3p;

public class Manual extends Automovil {
    public Manual(String p) {
        super(p);
    }
    @Override
    public void acelerar(double vel){
        if(vel>0 && this.velocidad+vel<=this.velocidadMaxima)
            this.velocidad+=vel;
    }
    
    @Override
    public void frenar(double vel){
        if(vel>0 && this.velocidad-vel>=0 )
            this.velocidad-=vel;
    }
}
