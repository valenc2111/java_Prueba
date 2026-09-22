package ej5tp3p;

public class Automatico extends Automovil {
    public Automatico(String p) {
        super(p);
    }
    public void reversa(){
        if(this.velocidad==0)
            setMarcha(-1);
        else
            System.out.println("no tenes velocidad 0");
    }
    @Override
    public void acelerar(double vel){
        if (vel>0){
            double nuevaVelocidad = this.velocidad + vel;
            if(nuevaVelocidad<=this.velocidadMaxima){
                this.velocidad=nuevaVelocidad;
                if(getMarcha()!=-1){
                    if (this.velocidad > 0 && this.velocidad <= 10) {
                            setMarcha(1);
                        } else if (this.velocidad > 10 && this.velocidad <= 35) {
                            setMarcha(2);
                        } else if (this.velocidad > 35 && this.velocidad <= 50) {
                            setMarcha(3);
                        } else if (this.velocidad > 50 && this.velocidad <= 90) {
                            setMarcha(4);
                        } else if (this.velocidad > 90) {
                            setMarcha(5);
                        }
                }
            }
            
        }   
    }
    
    @Override
    public void frenar(double vel){
        if (vel>0)
            if(this.velocidad-vel>=0){
                this.velocidad-=vel;
                if (this.velocidad > 0 && this.velocidad <= 10) {
                        setMarcha(1);
                    } else if (this.velocidad > 10 && this.velocidad <= 35) {
                        setMarcha(2);
                    } else if (this.velocidad > 35 && this.velocidad <= 50) {
                        setMarcha(3);
                    } else if (this.velocidad > 50 && this.velocidad <= 90) {
                        setMarcha(4);
                    } else if (this.velocidad > 90) {
                        setMarcha(5);
                    }
            }
    }
}