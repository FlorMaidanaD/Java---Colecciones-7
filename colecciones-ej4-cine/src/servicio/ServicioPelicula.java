/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package servicio;

import entidad.Comparadores;
import entidad.Pelicula;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> arrayPeliculas = new ArrayList();

    public void CrearPelicula() {
        System.out.println("CARGAR PELICULAS");
           String op = "";
        do {
            System.out.println("");
            System.out.print("Titulo: ");
            String titulo = leer.next();
            System.out.print("Director: ");
            String director = leer.next();
            System.out.print("Duracion: ");
            double duracion = leer.nextDouble();
            arrayPeliculas.add(new Pelicula(titulo, director, duracion));
            System.out.println("");
            System.out.println("Otro? (s/n)");
            op = leer.next();
            if (!op.equals("s") && !op.equals("n")) {
                do {
                    System.out.println("Ingrese s o n");
                    op = leer.next();
                } while (!op.equals("n") && !op.equals("s"));
            }
        } while (!op.equals("n"));
    }

    /*     
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
    public void MostrarPelicula() {
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Peliculas ingresadas: ");
         System.out.println("");
        for (Pelicula arrayPelicula : arrayPeliculas) {
            System.out.println(arrayPelicula);
            

        }
    }

    public void MostrarPeliculaUnaHora() {
            System.out.println("");
             System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Peliculas de mas de 1 hora: ");
        for (Pelicula arrayPelicula : arrayPeliculas) {
            if (arrayPelicula.getDuracion() > 1) {
                System.out.println(arrayPelicula);
               
            }
        }
    }

    public void OrdenarPeliculaDuracionMay() {
        Collections.sort(arrayPeliculas, Comparadores.compararDuracion);
        MostrarPelicula();
    }

    public void OrdenarPeliculaDuracionMen() {
        Collections.sort(arrayPeliculas, Comparadores.compararDuracionD);
        MostrarPelicula();
    }

    public void OrdenarTitulo() {
        Collections.sort(arrayPeliculas, Comparadores.compararTitulo);
        MostrarPelicula();
    }

    public void OrdenarDirector() {
        Collections.sort(arrayPeliculas, Comparadores.compararDirector);
        MostrarPelicula();
    }

    public void Ordenar() {
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Ordenar por menor duracion");
        OrdenarPeliculaDuracionMen();
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Ordenar por mayor duracion");
        OrdenarPeliculaDuracionMay();
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Ordenar por titulo");
        OrdenarTitulo();
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Ordenar por director");
        OrdenarDirector();
    }

}
