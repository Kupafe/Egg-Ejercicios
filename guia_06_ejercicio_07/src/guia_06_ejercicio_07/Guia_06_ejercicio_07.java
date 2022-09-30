/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guia_06_ejercicio_07;

import java.util.Scanner;

public class Guia_06_ejercicio_07 {

    public static void main(String[] args) {
       
        String palabra1, palabra2;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");        
        palabra1 = leer.next();
        
        System.out.println("Ingrese una palabra para ver si es igual que la primer palabra ingresada");        
        palabra2 = leer.next();
        
        if (palabra1.equals(palabra2) == true){
        
            System.out.println("La palabra "+palabra1+" y la palabra "+palabra2+" son iguales.");
        
        }else{
            
            System.out.println("La palabra "+palabra1+" y la palabra "+palabra2+" son distintas.");
        }
    }
}

/*
Ejemplo

package com.arquitecturajava;

public class Principal4 {

public static void main(String[] args) {

Persona p= new Persona("cecilio");
Persona p1= new Persona("cecilio");

System.out.println(p.equals(p1));

}

}

*/
