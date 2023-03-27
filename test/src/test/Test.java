
package test;

import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
       System.out.println("Ingrese su nombre:");
       nombre = leer.next();
       System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java");
        String palabra = "Hola";
        System.out.println(palabra);
        System.out.println(" " +palabra.substring(0,1));
        System.out.println(" " +palabra.substring(1,2));        
        System.out.println(" " +palabra.substring(2,3));
        System.out.println(" " +palabra.substring(3,4));
        System.out.println("" + palabra.substring(palabra.length()-1,palabra.length()));
        System.out.println("" + palabra.substring(palabra.length()-1,palabra.length()).equalsIgnoreCase("a") );
        
}
}