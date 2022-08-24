
package main;

import servicio.ServicioAlumno;

public class main {

    
    public static void main(String[] args) {
        ServicioAlumno sa= new ServicioAlumno();
        sa.CrearAlumno();
        double aux=sa.notaFinal();
        if(aux==0){
           System.out.println("El alumno no fue encontrado");
                        
        }else{
            System.out.println("La nota promedio es: " + aux); 
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Los alumnos son: ");
        sa.mostrarAlumnos();
        
       
    }
    
}
