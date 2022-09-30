/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia_06_ejercicio_17;

import java.util.Scanner;



public class Guia_06_ejercicio_17 {

    public static void main(String[] args) {

        int tamano, num, unidad, decena, centesima;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño que le va a dar al vector: ");
        tamano = leer.nextInt();
        
        int [] vector = new int [tamano];
        
        for(int i = 0; i < tamano; i++){
            
            // Para generar un numero entero entre 0 y 999, tengo que escribir la siguiente sentencia:
            vector[i] = (int) (Math.random() * 1000);
            
            System.out.println("Vector: "+vector[i]+" ");
            
        }
        
        unidad = 0;
        decena = 0;
        centesima = 0;
        
        for(int i = 0; i < tamano; i++){
            
            num = vector[i];
            
            if (num >= 0 && num < 10){
                
                unidad = unidad + 1;
            }else{
                if (num >= 10 && num < 100){
                    decena = decena + 1;
                }else{
                    centesima = centesima + 1;
                }
            }
        }
        System.out.println("");
          
        System.out.println("El total de numeros de una cifra son: "+unidad+" numeros.");
        System.out.println("El total de numeros de dos cifras son: "+decena+" numeros.");
        System.out.println("El total de numeros de tres cifras son: "+centesima+" numeros.");
        
        System.out.println("");
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
         
        System.out.println("");
          
    }  
}