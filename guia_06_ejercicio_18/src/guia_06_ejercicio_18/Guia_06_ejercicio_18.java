/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).

            1  0  4                 1  0  6 
Matriz A =  0  5  0     Matriz B =  0  5  0
            6  0 -9                 4  0 -9
 */

package guia_06_ejercicio_18;

import java.util.Scanner;

public class Guia_06_ejercicio_18 {

    public static void main(String[] args) {

        int [][] matriz = new int [3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                matriz[i][j] = (int) (Math.random() * 10);
            
                System.out.print(" ( "+matriz[i][j]+" ) ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                System.out.print(" ( "+matriz[j][i]+" ) ");
            }

            System.out.println("");
        }

        System.out.println("");
    }
}