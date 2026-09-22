package ej5tp3p;

public class pruebaej5tp3 {
    public static void main (String [] args){
       /* Manual m1 = new Manual("a");
        m1.acelerar(150);
        System.out.println(m1.getMarcha());*/
        
        Automatico a1 = new Automatico("aaaa");
        a1.acelerar(150);
        System.out.println(a1.getMarcha());
        a1.reversa();
    }
}
