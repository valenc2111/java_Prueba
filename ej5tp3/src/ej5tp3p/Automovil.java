package ej5tp3p;

public abstract class Automovil {
    protected  String patente;
    protected double velocidad;
     protected double velocidadMaxima;
    protected int marcha;
    public Automovil(String p, double velmax) {
        this.patente=p;
        this.velocidadMaxima=velmax;
    }
    public abstract void acelerar(double vel);
    
    public abstract void frenar(double vel);
    
    public Automovil(String patente){
        this(patente,160);    
    }

    public String getPatente() {
        return patente;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    protected void setMarcha(int marcha) {
        this.marcha = marcha;
    }

}
