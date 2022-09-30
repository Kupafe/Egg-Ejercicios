/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia_06_ejercicio_10;

import java.util.Scanner;

public class Guia_06_ejercicio_10 {

    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un numero positivo: ");
        
        int limite = leer.nextInt();
        
        int suma;
        suma = 0;
        
        while (suma < limite){
            
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            
            suma = suma + num;
        }
        System.out.println("los numeros ingresados superaron el limite");
    }   
}
