/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> arrayPerros = new ArrayList();
    String op="";     
    do{            
         System.out.print("Ingrese la raza: ");
         arrayPerros.add(leer.next());
         System.out.println("Otro? (s/n)");
         op=leer.next();
                     
        }while (!op.equals("n"));
        // mostramos
        System.out.println("Las razas ingresadas son:");
        for (String razaDelArrayAux : arrayPerros) {
        System.out.println(razaDelArrayAux);
        }    
        System.out.println("");
        System.out.println("................");
        System.out.println("Buscamos un perro");
        System.out.println("Ingrese la raza a buscar: ");
        String rbuscar=leer.next();
        Iterator it = arrayPerros.iterator();
        boolean x=false;
        while (it.hasNext()){
            if (it.next().equals(rbuscar)){
                it.remove();
                x=true;
            }
        }              
        if (x)
            System.out.println("La raza fue eliminada");
        else System.out.println("La raza no estaba");
        Collections.sort (arrayPerros);
        System.out.println("Muestro las razas orenadas");
        for (String razaDelArrayAux : arrayPerros) {
        System.out.println(razaDelArrayAux);
        }    
        
    }
    
}
