
package manos.a.la.obra.libros;

import Entidades.Libros;
import Servicios.ServiciosLibros;
import java.util.ArrayList;
import java.util.Scanner;

public class ManosALaObraLibros {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosLibros sl= new ServiciosLibros ();
        ArrayList<Libros> arrayLibros = new ArrayList();
        Libros l=new Libros ();
        String op="";     
        do{            
            l= sl.NuevoLibro();
            arrayLibros.add(l);
            System.out.println("quiere ingresar otro libro mas? (s/n)");          
            op=leer.next();
        }while (!op.equals("n"));
        // mostramos
        System.out.println(arrayLibros);
        for (Libros arrayLibro : arrayLibros) {
            System.out.println(arrayLibro);
        }
   
        
        
    }
    
}
