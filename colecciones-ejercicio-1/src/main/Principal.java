package main;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
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
        System.out.println(arrayPerros);
        System.out.println("muestro con forEach");
        for (String razaDelArrayAux : arrayPerros) {
            System.out.println(razaDelArrayAux);
        }
    }
    
}
