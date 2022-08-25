
package entidad;

import java.util.Comparator;



public class Comparadores {
    public static Comparator <Pelicula> compararDuracion = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2){
            return t2.getDuracion().compareTo(t1.getDuracion());                
        }
    };   
    
      public static Comparator <Pelicula> compararDuracionD = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t2, Pelicula t1){
            return t2.getDuracion().compareTo(t1.getDuracion());                
        }
    }; 
       
      public static Comparator <Pelicula> compararTitulo = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t2, Pelicula t1){
            return t2.getTitulo().compareTo(t1.getTitulo());                
        }
    }; 
    
      public static Comparator <Pelicula> compararDirector = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula t2, Pelicula t1){
            return t2.getDirector().compareTo(t1.getDirector());                
        }
    }; 
    
}
