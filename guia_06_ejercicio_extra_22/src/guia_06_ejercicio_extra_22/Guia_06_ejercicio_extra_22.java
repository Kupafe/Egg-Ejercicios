/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */

package guia_06_ejercicio_extra_22;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_22 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        
        System.out.print("Ingrese la cantidad de FILAS que va a tener la matriz: ");
        int N = leer.nextInt();
        
        System.out.println("");
        
        System.out.print("Ingrese la cantidad de COLUMNAS que va a tener la matriz: ");
        int M = leer.nextInt();
        
        int [][]matriz = new int[N][M];
        
        System.out.println("");
        
        llenarMatriz(matriz, N, M);
        
        mostrarMatriz(matriz, N, M);
        
        sumaMatriz(matriz, N, M);
        
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DE PROGRAMA.");
        System.out.println("");
    }
    
    public static void sumaMatriz(int [][]matriz, int N, int M){
        
        int suma = 0;
        
        System.out.println("");
        
        for (int i = 0; i < N; i++){
            
            for (int j = 0; j < M; j++){
                
                suma = suma + matriz[i][j];
            }
        }

        System.out.println("La suma de valores de toda la matriz da como resultado elsiguiente numero: "+suma+".");
    }
    
    public static void mostrarMatriz(int [][]matriz, int N, int M){
        
        System.out.println("MOSTRAR MATRIZ.");
        
        System.out.println("");
        
        for (int i = 0; i < N; i++){
            
            for (int j = 0; j < M; j++){
                
                if (matriz[i][j] < 10){
                    
                    System.out.print(" ( 0"+matriz[i][j]+" ) ");
                    
                }else{
                    
                    System.out.print(" ( "+matriz[i][j]+" ) ");
                }
            }

            System.out.println("");
        }
    }
    
    public static void llenarMatriz(int [][]matriz, int N, int M){
        
        for (int i = 0; i < N; i++){
            
            for (int j = 0; j < M; j++){
                
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
    }
}
