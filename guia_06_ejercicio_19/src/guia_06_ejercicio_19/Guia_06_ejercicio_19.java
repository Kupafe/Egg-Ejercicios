/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

        Matriz      Matriz Transpuesta
    
        0 -2  4          0  2 -4
        2  0  2         -2  0 -2
       -4 -2  0          4  2  0
 */
package guia_06_ejercicio_19;

import java.util.Scanner;

public class Guia_06_ejercicio_19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] matrizTraspuesta = new int [3][3];
        int posicion = 1;
        boolean sonIguales = true;
        int numA, numB;
        
        // Cargar la Matriz Original
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Ingrese un numero en la posicion "+posicion+": ");
                matriz[i][j] = leer.nextInt(); //(int) (Math.random() * 10);
                posicion = posicion + 1;
                //System.out.print(" ( "+matriz[i][j]+" ) ");
            }
 
            //System.out.println("");
        }
        
        System.out.println("");
        
        // Mostrar la Matriz Original
        
        System.out.println("MATRIZ ORIGINAL.");
        System.out.println("");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                System.out.print(" ( "+matriz[i][j]+" ) ");
                
            }
 
            System.out.println("");
        }
        
        // Mostrar la Matriz transpuesta
        
        System.out.println("");
        System.out.println("MATRIZ TRANSPUESTA.");
        System.out.println("");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                matrizTraspuesta[i][j] = matriz[j][i];
                System.out.print(" ( "+matrizTraspuesta[i][j]+" ) ");
    
            }
            
            System.out.println("");
        
        }
        
         System.out.println("");
        
        // Reviso si las matrices son antisimetricas
         
         
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                //numA = (matriz[i][j] * -1);
                //numB = matrizTraspuesta[j][i];
                System.out.println("Matriz: "+matriz[i][j]);
                System.out.println("Matriz Traspuesta: "+matrizTraspuesta[i][j]);
                System.out.println("Matriz * (-1): "+(matriz[i][j] * (-1)));
                
                if ((matriz[i][j] * (-1) != matrizTraspuesta[i][j])){
                    sonIguales = false;
                }   
//System.out.println("NumA: "+numA);
                //System.out.println("NumB: "+numB);
                
                /*if (numA ==  matrizTraspuesta[j][i]){
                    sonIguales = false;
                    
                    //System.out.println("Matriz Transpuesta: "+matrizTraspuesta[j][i]);
                }  */
                
            }
        }
        if (sonIguales == false){
            System.out.println("Las matrices NO son antisimetricas.");
        }else{
            System.out.println("Las matrices SI son antisimetricas.");
        }
           
    }
}