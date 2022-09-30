/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia_06_ejercicio_extra_08;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int i, numero, cantidadNumeros, cantidadPar, cantidadImpar;
               
        cantidadNumeros = 0;
        cantidadPar = 0;
        cantidadImpar = 0;
        
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        
        while (numero % 5 != 0){
            
            
            
            cantidadNumeros++;
            
            if (numero % 2 == 0){
                
                cantidadPar++;
                
            }else{
                
                cantidadImpar++;
          
            }
            
            if (numero % 5 == 0){
                
                break;
                
            }else{
                System.out.print("Ingrese un numero: ");
                numero = leer.nextInt();
            }
       }
        
        System.out.println("La cantidad de numeros ingresados son: "+cantidadNumeros);
        System.out.println("La cantidad de numeros PARES ingresados son: "+cantidadPar);
        System.out.println("La cantidad de numeros IMPARES ingresados son: "+cantidadImpar);
    }

}
