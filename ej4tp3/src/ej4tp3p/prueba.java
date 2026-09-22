package ej4tp3p;

public class prueba {
    public static void main(String[] args){
      /*  Intermedio i1= new Intermedio("gaston fasito",123,"guanahani 8367",5,500);
        Departamentos d1=new Departamentos("Mantenimen");
        d1.agregarEmpleado(i1);
        d1.imprimirPlantilla();*/
        
      Intermedio juan = new Intermedio("Juan Perez", 1234, "Matheu 2343", 7, 12000);
      EmpleadoTemporario julio = new EmpleadoTemporario("Julio García", 3209, "Colon 5561", 80, 160);
      EmpleadoTemporario martin = new EmpleadoTemporario("Martin Rodriguez", 3210, "Mitre 3451", 70, 100);

      // 2. Creación del departamento y asignación
      Departamentos mantenimiento = new Departamentos("Mantenimiento");
      mantenimiento.agregarEmpleado(juan);
      mantenimiento.agregarEmpleado(julio);
      mantenimiento.agregarEmpleado(martin);

      // (Opcional) Mostrar la planilla
      mantenimiento.imprimirPlantilla();
        
    }
}
