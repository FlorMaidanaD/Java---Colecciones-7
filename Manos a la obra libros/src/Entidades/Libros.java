/*
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Entidades;


public class Libros {

    private String titulo;

    public Libros() {
    }

    public Libros(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return  "titulo= " + titulo;
    }
    
}
