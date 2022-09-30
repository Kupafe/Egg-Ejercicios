/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */

package guia_06_ejercicio_extra_19;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int tamano;
        
        System.out.println("");
        
        System.out.println("Ingrese un numero para crear dos vectores de tamaño iguales: ");
        tamano = leer.nextInt();
        
        int []vectorA = new int[tamano];
        int []vectorB = new int[tamano];
        
        cargarVectorAleatorio(vectorA, vectorB, tamano);
        
        compararVector(vectorA, vectorB, tamano);
    }
    
    public static void mostrarVector(int []vector, int tamano){
        
        for (int i = 0; i < tamano; i++){
        
            System.out.print(" ( "+vector[i]+" ) ");
        }
    }
    
    public static void compararVector(int []vectorA, int []vectorB, int tamano){
    
        boolean iguales = true;
        
        for (int i = 0; i < tamano; i++){
            
            if (vectorA[i] != vectorB[i]){
                iguales = false;
            }
        }
        
        if (iguales == true){
            
            System.out.println("Los vectores SI son iguales.");
            
        }else{
            
            System.out.println("Los vectores NO son iguales.");
        }
        
        System.out.println("");
        
        System.out.println("MOSTRAR VECTOR A.");
        System.out.println("");
        
        mostrarVector(vectorA, tamano);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("MOSTRAR VECTOR B.");
        System.out.println("");
        
        mostrarVector(vectorB, tamano);
        
        System.out.println("");
                    
    }
        
    public static void cargarVectorAleatorio(int []vectorA, int []vectorB, int tamano){
        
        //int aleatorio;
        
        for (int i = 0; i < tamano; i++){
            
            /*
            aleatorio = (int)(Math.random() * 51);
            
            vectorA[i] = aleatorio;
            vectorB[i] = aleatorio;
            */
            
            vectorA[i] = (int)(Math.random() * 51);
            vectorB[i] = (int)(Math.random() * 51);
        }
    }
}