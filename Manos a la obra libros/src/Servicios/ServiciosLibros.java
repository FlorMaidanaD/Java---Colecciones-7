// armar una lista de libros y mostrar el titulo
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

    public void NuevoLibro(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
