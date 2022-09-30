/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

              2  7  6
    MATRIZ =  9  5  1
              4  3  8
 */

package guia_06_ejercicio_20;

import java.util.Scanner;

public class Guia_06_ejercicio_20 {
    
    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        //int [] vectorFila = new int [3];
        
        boolean filasIguales, columnasIguales, filaDiagonalesIguales;
        int resultadoDiagonalPrincipal, resultadoDiagonalSecundaria;
        
         System.out.println("");
         
        //llenarMatrizAleatoria(matriz);
        
        llenarMatrizManual(matriz);
        
        System.out.println("");
        
        mostrarMatriz(matriz);
        
        System.out.println("");
        
        filasIguales = compararFilas(matriz);
        
        System.out.println("");
        
        System.out.println("Filas Iguales: "+filasIguales);
        
        columnasIguales = compararColumnas(matriz);
        
        System.out.println("");
        
        System.out.println("Columnas Iguales: "+columnasIguales);
        
        resultadoDiagonalPrincipal = diagonalPrincipal(matriz);
        
        System.out.println("Resultado Diagonal Principal: "+resultadoDiagonalPrincipal);
        
        resultadoDiagonalSecundaria = diagonalSecundaria(matriz);
        
        System.out.println("Resultado Diagonal Secundaria: "+resultadoDiagonalSecundaria);
        
        filaDiagonalesIguales = compararFilaDiagonales(matriz, resultadoDiagonalPrincipal, resultadoDiagonalSecundaria);
            
        System.out.println("Resultado Fila Diagonales: "+filaDiagonalesIguales);
        
        if (filasIguales == true && columnasIguales == true && filaDiagonalesIguales == true){
            
            System.out.println("La matriz SI ES MAGICA. :-)");
        
        }else{
            
            System.out.println("La matriz NO ES MAGICA. :-(");
                


        }
        
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
    
    //Comparo los resultados con las dos diagonales con la primer fila de la matriz
    public static boolean compararFilaDiagonales(int [][]matriz, int resultadoDiagonalPrincipal, int resultadoDiagonalSecundaria){
    
        int suma = 0;
        
        for(int j = 0; j < 3; j++){
          
            suma = matriz[0][j] + suma;
        }
        
        if (suma == resultadoDiagonalPrincipal && resultadoDiagonalPrincipal == resultadoDiagonalSecundaria){
            
            return true;
            
        }else{
            
            return false;
        }
    }           
        
        
    
    // Verifico el resultado de la Diagonal Secundaria y devuelvo el mismo
    public static int diagonalSecundaria(int [][]matriz){
     
        int suma = 0;
        int j = 2;
        
        for (int i = 0; i < 3; i++){
        
            suma = matriz[i][j] + suma;
            j = j - 1;
        }
        return suma;
    }
   
    // Verifico el resultado de la Diagonal Principal y devuelvo el mismo
    public static int diagonalPrincipal(int [][]matriz){
        
        int suma = 0;
        
        for (int i = 0; i < 3; i++){
            
            for (int j = 0; j < 3; j++){
                
                if (i == j){
                    
                    suma = matriz[i][j] + suma;
                    
                }
            }    
        }
        return suma;
    }

    // Comparo si las columnas de la matriz tienen el mismo resultado
    
    public static boolean compararColumnas(int [][]matriz){
        
        int suma, sumaAux; //, contador;
        int [] vector = new int [3];
        boolean iguales;
        
        //contador = 0;
        suma = 0;
        sumaAux = 0;
        
        for (int j = 0; j < 3; j++){
            
            for (int i = 0; i < 3; i++){
                
                suma = matriz[i][j];
		sumaAux = matriz[i][j] + sumaAux;
                
            }
            
            vector[j] = sumaAux;
		
            suma = 0 ; 
            sumaAux = 0 ; 
            //contador = contador + 1;
        }
        
        System.out.println("MOSTRAR EL VECTOR COLUMNA.");
        System.out.println("");
        mostrarVector(vector);
        
        if (vector[0] == vector[1] && vector[1] == vector[2]){
            
            return  iguales = true;
        
        } else{
            
            return  iguales = false;
        }
        
    }
    
    // Comparo si las filas de la matriz tienen el mismo resultado
    
    public static boolean compararFilas(int [][]matriz){
        
        int contador, suma, sumaAux;
        int [] vector = new int [3];
        boolean iguales;
        
        contador = 0;
        suma = 0;
        sumaAux = 0;
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                suma = matriz[contador][j];
		sumaAux = matriz[contador][j] + sumaAux;
            }
            
            vector[i] = sumaAux;
		
            suma = 0 ; 
            sumaAux = 0 ; 
            contador = contador + 1;
        }
        
        System.out.println("MOSTRAR EL VECTOR FILA.");
        System.out.println("");
        mostrarVector(vector);
        
        if (vector[0] == vector[1] && vector[1] == vector[2]){
            
            return  iguales = true;
        
        } else{
            
            return  iguales = false;
        }
        
    }
    
    // Mostrar los valores que hay en el vector
    public static void mostrarVector(int []vector){

        
        for(int i = 0; i < 3; i++){
            
            System.out.print(" ( "+vector[i]+" ) ");

        }
    }
    
    // Mostrar los valores que hay en la matriz    
    public static void mostrarMatriz(int [][]matriz){

        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                
                System.out.print(" ( "+matriz[i][j]+" ) ");
            }
            System.out.println("");
        }
    }
    
    public static void llenarMatrizManual(int [][]matriz){
    
        Scanner leer = new Scanner(System.in);
        
        int posicion = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Ingrese un numero en la posicion "+posicion+": ");
                matriz[i][j] = leer.nextInt(); //(int) (Math.random() * 10);
            }
        }
    }    
    // LLeno la matriz con valores aleatorios del 1 al 9
    
    public static void llenarMatrizAleatoria(int [][]matriz){

        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                
                matriz[i][j] = (int) (Math.random() * 9 + 1);
                
               // System.out.print(" ( "+matriz[i][j]+" ) ");
            }
        }
    }
}