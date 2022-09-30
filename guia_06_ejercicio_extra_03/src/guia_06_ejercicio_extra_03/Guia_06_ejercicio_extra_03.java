/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia_06_ejercicio_extra_03;

import java.util.Scanner;


public class Guia_06_ejercicio_extra_03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String letra;
        int largo;
        
        do{
            System.out.print("Ingrese una letra: ");
            letra = leer.next();
            //letra = letra.toUpperCase();
            largo = letra.length();
            
        } while (largo != 1);
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") || letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra "+letra+" que usted ingreso es una VOCAL.");
        }else{
            System.out.println("La letra "+letra+" que usted ingreso es una CONSONANTE.");
        }

    }
    
}
