/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:

              Matriz de 10 x 10                     Matriz de 3 x 3
    
     1  26  36  47   5   6  72  81  95  10              36   5  67
    
    11  12  13  21  41  22  67  20  10  61              89  90  75

    56  78  87  90  09  90  17  12  87  67              14  22  26
    
    41  87  24  56  97  74  87  42  64  35
                    ----------
    32  76  79   1 |36   5  67| 96  12  11
                   |          |
    99  13  54  88 |89  90  75| 12  41  76
                   |          |
    67  78  87  45 |14  22  26| 42  56  78
                    ----------
    98  45  34  23  32  56  74  16  19  18
    
    24  67  97  46  87  13  67  89  93  24

    21  68  78  98  90  67  12  41  65  12
 
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
*/
package guia_06_ejercicio_21;

import java.util.Scanner;

public class Guia_06_ejercicio_21 {

    public static void main(String[] args) {

        int [][] matriz10 = new int [10][10];
        int [][] matriz3 = new int [3][3];
        
        System.out.println("");
         
        llenarMatrizEjercicio10x10(matriz10);
        
        System.out.println("MATRIZ 10 X 10.");
        
        System.out.println("");
        
        mostrarMatriz(matriz10, 10);
        
        System.out.println("");
        
        llenarMatrizEjercicio3x3(matriz3);
        
        System.out.println("MATRIZ 3 X 3.");
        
        System.out.println("");
        mostrarMatriz(matriz3, 3);
        
        System.out.println("BUSCAR NUMERO.");
        buscarNumero(matriz10, matriz3);
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
    
    public static boolean contiene(int [][]matriz10, int [][]matriz3, int posicionI, int posicionJ){
        
        boolean cicloIgual;
        int contadorFalso = -1;
        int contadorI3 = 0;
        int contadorJ3 = 0;
        
        System.out.println("Matriz 10 contenida");
        System.out.println("");
        
        for (int i = posicionI; i < (posicionI + 3); i++){
            
            for (int j = posicionJ; j < (posicionJ + 3); j++){
                System.out.println(" Matriz 10: ( "+matriz10[i][j]+" ) ");
                System.out.println(" Matriz 3: ( "+matriz3[contadorI3][contadorJ3]+" ) ");
                
                if (matriz10[i][j] != matriz3[contadorI3][contadorJ3]){
                    contadorFalso++;
                }
                contadorJ3++;
                System.out.println("");
            }
            //System.out.println("");
            contadorI3++;
            contadorJ3 = 0;
        }
        
        if (contadorFalso > 0){
            return cicloIgual = false;
        }else{
            return cicloIgual = true;
        }  
    }
    
    public static void buscarNumero(int [][]matriz10, int [][]matriz3){
        
        boolean ciclo;
        int i,j;
        
        for (i = 0; i < 10; i++){
            for (j = 0; j < 10; j++){
                if (matriz10[i][j] == matriz3[0][0]){
                                        
                    ciclo = contiene(matriz10, matriz3, i, j);
                    
                    if (ciclo == true){
                        
                        System.out.println("La Matriz de 10 x 10 contiene el ciclo de la Matriz de 3 x 3, el mismo comienza en la FILA: "+(i + 1)+" y en la COLUMNA: "+(j + 1)+" de la Matriz de 10 x 10");
                    }
                }
            }
        }
    }
    
    // Mostrar los valores que hay en la matriz    
    public static void mostrarMatriz(int [][]matriz, int tamano){

        for(int i = 0; i < tamano; i++){
            
            for(int j = 0; j < tamano; j++){
                
                System.out.print(" ( "+matriz[i][j]+" ) ");
            }
            
            System.out.println("");
        }
    }
    
    // LLeno de vlores la Matriz de 3 x 3
    public static void llenarMatrizEjercicio3x3(int [][]matriz){
    
        matriz[0][0] = 36; matriz[0][1] =  5; matriz[0][2] = 67;
        matriz[1][0] = 89; matriz[1][1] = 90; matriz[1][2] = 75;
        matriz[2][0] = 14; matriz[2][1] = 22; matriz[2][2] = 26;   
    }
        
    
    // LLeno de vlores la Matriz de 10 x 10
    public static void llenarMatrizEjercicio10x10(int [][]matriz){
    
        matriz[0][0] =  1; matriz[0][1] = 26; matriz[0][2] = 36; matriz[0][3] = 47; matriz[0][4] =  5; matriz[0][5] =  6; matriz[0][6] = 72; matriz[0][7] = 81; matriz[0][8] = 95; matriz[0][9] = 10;
        matriz[1][0] = 11; matriz[1][1] = 12; matriz[1][2] = 13; matriz[1][3] = 21; matriz[1][4] = 41; matriz[1][5] = 22; matriz[1][6] = 67; matriz[1][7] = 20; matriz[1][8] = 10; matriz[1][9] = 61;
        matriz[2][0] = 56; matriz[2][1] = 78; matriz[2][2] = 87; matriz[2][3] = 90; matriz[2][4] =  9; matriz[2][5] = 90; matriz[2][6] = 17; matriz[2][7] = 12; matriz[2][8] = 87; matriz[2][9] = 67;
        matriz[3][0] = 41; matriz[3][1] = 87; matriz[3][2] = 24; matriz[3][3] = 56; matriz[3][4] = 97; matriz[3][5] = 74; matriz[3][6] = 87; matriz[3][7] = 42; matriz[3][8] = 64; matriz[3][9] = 35;
        matriz[4][0] = 32; matriz[4][1] = 76; matriz[4][2] = 79; matriz[4][3] =  1; matriz[4][4] = 36; matriz[4][5] =  5; matriz[4][6] = 67; matriz[4][7] = 96; matriz[4][8] = 12; matriz[4][9] = 11;
        matriz[5][0] = 99; matriz[5][1] = 13; matriz[5][2] = 54; matriz[5][3] = 88; matriz[5][4] = 89; matriz[5][5] = 90; matriz[5][6] = 75; matriz[5][7] = 12; matriz[5][8] = 41; matriz[5][9] = 76;
        matriz[6][0] = 67; matriz[6][1] = 78; matriz[6][2] = 87; matriz[6][3] = 45; matriz[6][4] = 14; matriz[6][5] = 22; matriz[6][6] = 26; matriz[6][7] = 42; matriz[6][8] = 56; matriz[6][9] = 78;
        matriz[7][0] = 98; matriz[7][1] = 45; matriz[7][2] = 34; matriz[7][3] = 23; matriz[7][4] = 32; matriz[7][5] = 56; matriz[7][6] = 74; matriz[7][7] = 16; matriz[7][8] = 19; matriz[7][9] = 18;
        matriz[8][0] = 24; matriz[8][1] = 67; matriz[8][2] = 97; matriz[8][3] = 46; matriz[8][4] = 87; matriz[8][5] = 13; matriz[8][6] = 67; matriz[8][7] = 89; matriz[8][8] = 93; matriz[8][9] = 24;
        matriz[9][0] = 21; matriz[9][1] = 68; matriz[9][2] = 78; matriz[9][3] = 98; matriz[9][4] = 90; matriz[9][5] = 67; matriz[9][6] = 12; matriz[9][7] = 41; matriz[9][8] = 65; matriz[9][9] = 12;
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
                
            }
        }
    }  
}