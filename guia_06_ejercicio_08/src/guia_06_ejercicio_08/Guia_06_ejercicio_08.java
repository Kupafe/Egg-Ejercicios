/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java
 */
package guia_06_ejercicio_08;

import java.util.Scanner;

public class Guia_06_ejercicio_08 {

    public static void main(String[] args) {

        String palabra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra, esta tiene que ser de 8 caracteres");        
        palabra = leer.next();
        
        if (palabra.length() == 8) {
            
            System.out.println("El tamaño de la palabra "+palabra+" es de "+ palabra.length()+" caracteres, lo cual es correcto.");
        
        }else{
            
            System.out.println("El tamaño de la palabra "+palabra+" es de "+ palabra.length()+" caracteres, lo cual es incorrecto.");
        }
    }
}

/*
Ejemplo

IK de clase pública{

    public static void main(String[] args)

    {

        // a es una matriz de enteros de tamaño 10-

        int[] a= nuevo int[10];

        System.out.println("El tamaño de una matriz a es "+ a.longitud);

 

        // Variable Str es un objeto String.

        String Str= "EntrevistaKickstart";

        System.out.println("El tamaño de la cadena es "+ Str.length());

    }

}
*/
