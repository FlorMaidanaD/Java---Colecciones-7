package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> arrayAlumnos = new ArrayList();
    
    public void CrearAlumno() {
        System.out.println("Creando Alumno");
        String op = "";
        do {
            System.out.print("Ingrese el nombre: ");
            String nom = leer.next();
            System.out.println("Ingrese las 3 notas");
            System.out.print("nota 1: ");
            int nota1 = leer.nextInt();
            System.out.print("nota 2: ");
            int nota2 = leer.nextInt();
            System.out.print("nota 3: ");
            int nota3 = leer.nextInt();
            arrayAlumnos.add(new Alumno(nom, nota1, nota2, nota3));
            System.out.println("*****************************");
            System.out.println("Otro? (s/n)");
            op = leer.next();            
            if (!op.equals("s") && !op.equals("n")) {
                do {
                    System.out.println("Ingrese s o n");
                    op = leer.next();
                }while (!op.equals("n") && !op.equals("s"));
            }
        }while(!op.equals("n"));
    }
/*
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.    
*/
    public double notaFinal(){
        System.out.println("Ingrese el nombre del alumno a calcular: ");
        String nomaux =leer.next();
        int sum=0;
        double prom= 0;
        for (Alumno arrayAlumnoAux : arrayAlumnos) {
            if (arrayAlumnoAux.getNombre().equals(nomaux)){
                
                
                ArrayList <Integer> arrayaux2 = new ArrayList();
                arrayaux2=arrayAlumnoAux.getArrayNotas();
                //sum = arrayAlumnoAux.stream().mapToInt(Integer::intValue).sum();
                for (Integer arrayint : arrayaux2) {
                    sum= sum + arrayint;
                          
                }
                prom=sum/3;                                 
            }
        }
     
        /*
       Iterator it = arrayAlumnos.iterator();
        boolean x=false;
        while (it.hasNext()){
            if (it.next().equals(nomaux)){
                               
                x=true;
                
            }
        }   */
        
        return prom;
    }
    public void mostrarAlumnos() {
        for (Alumno arrayAlumno : arrayAlumnos) {
            System.out.println(arrayAlumno);
        }
    }
}
