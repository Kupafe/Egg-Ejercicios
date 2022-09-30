/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia_06_ejercicio_02;

import java.util.Scanner;

public class Guia_06_ejercicio_02 {

    public static void main(String[] args) {
        
        String nombre;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        
        System.out.println("Bienvenido "+nombre);
    }
    
}
