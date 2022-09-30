/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guia_06_ejercicio_06;

import java.util.Scanner;

public class Guia_06_ejercicio_06 {

    public static void main(String[] args) {
       
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para saber si el mismo es Par o Impar");
        num = leer.nextInt();
        
        if (num % 2 == 0)

            System.out.println("El numero "+num+" es PAR.");

        else

            System.out.println("El numero "+num+" es IMPAR.");
    }
}
