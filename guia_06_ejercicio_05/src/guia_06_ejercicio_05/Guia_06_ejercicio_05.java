/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia_06_ejercicio_05;

import java.util.Scanner;

public class Guia_06_ejercicio_05 {

    public static void main(String[] args) {
       
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println("Doble: "+(num * 2)+" Triple: "+(num * 3)+" Raiz cuadrada: "+Math.sqrt(num));
    }
    
}


