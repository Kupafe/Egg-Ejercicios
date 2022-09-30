/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

    * * * *
    *     *
    *     *
    *     *
    *     *
    * * * *
 */
package guia_06_ejercicio_13;

import java.util.Scanner;

public class Guia_06_ejercicio_13 {

    public static void main(String[] args) {
        
        int tamano;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño que va a tener el cuadrado: ");
        tamano = leer.nextInt();
         
        System.out.println("");
        
        for (int i = 1; i <= tamano; i++){
            
            for (int j = 1; j <= tamano; j++){
                
                if ((i > 1) && (i < tamano) && (j > 1) && (j < tamano)) {
                
                    System.out.print(" ");
                    
                }else{
                    
                    System.out.print("*");
                    
                }
            }
              
           System.out.println("");   
        }   
    }
}
