/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author maida
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();
        //int x = 1;
        for (int i = 0; i < 5; i++) {
            numerosA.add(i);
        }
        System.out.println("lista muestra 1: " + numerosA.toString());
        for (Integer integer : numerosA) {
            System.out.println("lista muestra con forEach: " + integer);
        }
        //Eliminar por objeto:
        numerosA.remove(2);
        System.out.println("Queda por objeto: " + numerosA.toString());
        //Eliminar por indice:
        numerosA.remove(2);
        System.out.println("Queda por indice: " + numerosA.toString());

        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        for (int i = 1; i < 6; i++) {
            numerosB.add(i);
        }
        numerosB.add(0);
        numerosB.add(13);
        System.out.println("Conjuntos: " + numerosB.toString());
        for (Integer integer : numerosB) {
            System.out.println("Conjuntos con forEach: " + integer);
        }

        //Eliminar por objetos:
        numerosB.remove(3);
        System.out.println("Queda: " + numerosB);

        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni;
        String nombre = "";
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el dni: ");
            dni = leer.nextInt();
            System.out.println("Ingrese el nombre: ");
            nombre = leer.next().toLowerCase();
            alumnos.put(dni, nombre);
        }

        System.out.println(alumnos.toString());

        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("DNI: " + key);
            System.out.println("Nombre: " + value);

        }

        System.out.println("Ingrese el dni a eliminar: ");
        int dnie = leer.nextInt();

        alumnos.remove(dnie);
        System.out.println("Queda: " + alumnos);
        /*
        TreeSet<String> nombres = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        HashMap <Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put (2, n2);*/
        
        
        /*
        detencion de Errores: 
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) it.remove();
           
        }*/

    }
}
