
package Servicios;

import Entidades.Libros;
import java.util.Scanner;


public class ServiciosLibros {
    
    public Libros NuevoLibro(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         Libros l=new Libros ();
         System.out.println("Ingrese el titulo: ");
         l.setTitulo(leer.nextLine());
         return l;         
    }
}
