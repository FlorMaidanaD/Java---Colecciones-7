
package principal;

import servicio.ServicioPelicula;


public class main {

  
    public static void main(String[] args) {
        ServicioPelicula sp=new ServicioPelicula ();
        sp.CrearPelicula();
        sp.MostrarPelicula();
        sp.MostrarPeliculaUnaHora();
        sp.Ordenar();
    }
    
}
