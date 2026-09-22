package ej4tp3p;
import java.util.ArrayList;
import java.util.List;

public class Departamentos {
    private String nombre;
    List <Empleado>lempleados;
    public Departamentos(String n) {
        this.nombre=n;
        this.lempleados=new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){
            lempleados.add(e);
        
    }
    public void quitarEmpleado(Empleado e){
        lempleados.remove(e);    
    }
    public void imprimirPlantilla(){
        System.out.println("PLANTILLA DE SUELDOS DEL DEPARTEMAENTO - " +this.nombre);
        for(Empleado e:lempleados){
            System.out.printf("Empleado: %-16s | Sueldo Neto: $%.2f%n", e.getNombre(), e.calcularNeto());    
        }
    
    }
}
    
