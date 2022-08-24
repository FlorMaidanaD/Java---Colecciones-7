
package entidad;

import java.util.ArrayList;


public class Alumno {
    private String nombre;
    private ArrayList<Integer> arrayNotas = new ArrayList();

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;        
        this.arrayNotas.add(nota1);
        this.arrayNotas.add(nota2);
        this.arrayNotas.add(nota3);
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getArrayNotas() {
        return arrayNotas;
    }
    
   

 
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", arrayNotas=" + arrayNotas + '}';
    }

    public Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
