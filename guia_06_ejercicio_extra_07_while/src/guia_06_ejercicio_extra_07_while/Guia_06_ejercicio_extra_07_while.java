/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package guia_06_ejercicio_extra_07_while;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_07_while {

    public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);
       
       int cantidadNumeros, i;
       double promedio, valorMaximo, valorMinimo, numeros, sumaPromedio;
       
       valorMaximo = -999999999;
       valorMinimo = 999999999;
       sumaPromedio = 0;
       
       System.out.print("Ingrese la cantidad de numeros que va a ingresar: ");
       cantidadNumeros = leer.nextInt();
       
       while (cantidadNumeros < 0){
       
           System.out.print("Ingrese la cantidad de numeros que va a ingresar: ");
           cantidadNumeros = leer.nextInt();
        
       }
       
       for (i = 0; i < cantidadNumeros; i++){
           
           System.out.print("Ingrese el numero "+(i + 1)+" de "+cantidadNumeros+": ");
           numeros = leer.nextDouble();
           
           while (numeros < 0){
               System.out.print("Ingrese el numero "+(i + 1)+" de "+cantidadNumeros+": ");
               numeros = leer.nextDouble();
           }
           
           sumaPromedio = sumaPromedio + numeros;
           
           if (numeros < valorMinimo){
               valorMinimo = numeros;
           }
           
           if (numeros > valorMaximo){
               valorMaximo = numeros;
           }
       }
       
       promedio = sumaPromedio / cantidadNumeros;
       
       System.out.println("El numero MINIMO que se ha ingresado es: "+valorMinimo+".");
       System.out.println("El numero MAXIMO que se ha ingresado es: "+valorMaximo+".");
       System.out.println("El PROMEDIO es: "+promedio+".");
    }
}