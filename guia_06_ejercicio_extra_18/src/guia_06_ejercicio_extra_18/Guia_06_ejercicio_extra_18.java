/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package guia_06_ejercicio_extra_18;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int tamano;
        
        System.out.print("Ingrese el tamaño que va a tener el Vector: ");
        tamano = leer.nextInt();
        System.out.println("");
        
        int []vector = new int [tamano];
        
        cargarVector(vector, tamano);
        
        mostrarVector(vector, tamano);
        
        sumarVector(vector, tamano);
        
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
  

    }
    
    public static void sumarVector(int []vector, int tamano){
        
        int suma = 0;
        
        System.out.println("SUMAR VECTOR.");
        System.out.println("");
        
        for (int i = 0; i < tamano; i++){
            
            suma = suma + vector[i];
            
        }
        System.out.print("El resultado de la suma de todos los valores del Vector de como resultado: "+suma+".");
        System.out.println("");
    }
    
    public static void mostrarVector(int []vector, int tamano){
        
        System.out.println("MOSTRAR VECTOR.");
        System.out.println("");
        
        for (int i = 0; i < tamano; i++){
            
            System.out.print(" ( "+vector[i]+" ) ");
        }
        
        System.out.println("");
        System.out.println("");
    }
    
    public static void cargarVector(int []vector, int tamano){
        
        Scanner leer = new Scanner(System.in);
                
        for (int i = 0; i < tamano; i++){
            
            System.out.print("Ingrese un numero en la posicion "+(i + 1)+" de "+tamano+": ");
            vector[i] = leer.nextInt();
        }
        System.out.println("");
    }
    
    
}
