/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia_06_ejercicio_03;

import java.util.Scanner;

public class Guia_06_ejercicio_03 {

    public static void main(String[] args) {
    
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        palabra = leer.next();
       
        palabra = palabra.toUpperCase(); // Palabra en Mayuscula
        System.out.println("En mayusculas: "+palabra);
        
        palabra = palabra.toLowerCase(); // Palabra en Minuscula
        System.out.println("En minusculas: "+palabra);
    }
}
