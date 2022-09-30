/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */

package guia_06_ejercicio_extra_23;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_23 {


    public static void main(String[] args) {
        
        String[][]matriz = new String[20][20];
        
        cargarMatrizAsterisco(matriz);
        
        mostrarMatriz(matriz);
        
        leerPalabras(matriz);
        
        cambiarAsteriscosPorNumerosAleatorios(matriz);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
       
    }
    
    public static void cambiarAsteriscosPorNumerosAleatorios(String [][] matriz){
        
        int aleatorio;
        
        for(int i = 0; i < 20; i++){
            
            for(int j = 0; j < 20; j++){
                
                if (matriz[i][j].equals("*")){
                    
                    aleatorio = (int)(Math.random() * 10);
                    matriz[i][j] = Integer.toString(aleatorio);
                    
                }
            }
        }
        
        mostrarMatriz(matriz);
    }
    
    public static void cargarPalabra(String [][] matriz, String palabra, int aleatorioFila, int aleatorioColumna, int largo){
        
        int aleatorioColumnaLargo;

        System.out.println("QUE PASO?");
        System.out.println("Aleatorio Fila: "+aleatorioFila);
        System.out.println("Aleatorio Columna: "+aleatorioColumna);
        
        int a = 0;
        
        aleatorioColumnaLargo = (aleatorioColumna - 1) + largo;
                
        System.out.println("aleatorioColumna+largo: "+aleatorioColumnaLargo);
        
        for (int j = aleatorioColumna; j <= aleatorioColumnaLargo; j++){
            
            System.out.println("J: "+j);
            System.out.println("LargoPalabra: "+largo);
            
            matriz[aleatorioFila][j] = palabra.substring(a, a + 1);
            System.out.println("Aleatorio Fila: "+aleatorioFila);
            
            a++;
        }

        mostrarMatriz(matriz);
    }
    
    public static void seleccionAleatorio(String [][]matriz, String palabra, int largo){
        
        int aleatorioFila, aleatorioColumna;
        boolean agregar = false;
        
        do{
            switch(largo){
            
                case 3:
                    aleatorioFila = (int)(Math.random() * 20);
                    aleatorioColumna = (int)(Math.random() * 16);
                    
                    System.out.println("Aleatorio Fila: "+(aleatorioFila));
                    System.out.println("Aleatorio Columna: "+(aleatorioColumna));
                
                    if (matriz[aleatorioFila][aleatorioColumna].equals("*")){
                    
                        System.out.println("Tres");
                        cargarPalabra(matriz, palabra, aleatorioFila, aleatorioColumna, largo);
                        agregar = true;
                    }
                    
                    break;
                
                case 4:
                    aleatorioFila = (int)(Math.random() * 20);
                    aleatorioColumna = (int)(Math.random() * 15);
                    
                    System.out.println("Aleatorio Fila: "+(aleatorioFila));
                    System.out.println("Aleatorio Columna: "+(aleatorioColumna));
                    
                    if (matriz[aleatorioFila][aleatorioColumna].equals("*")){
                        
                        System.out.println("Cuatro");
                    
                        cargarPalabra(matriz, palabra, aleatorioFila, aleatorioColumna, largo);
                        agregar = true;
                    }
                    
                    break;
                
                case 5:
                    aleatorioFila = (int)(Math.random() * 20);
                    aleatorioColumna = (int)(Math.random() * 14);
                    
                    System.out.println("Aleatorio Fila: "+(aleatorioFila));
                    System.out.println("Aleatorio Columna: "+(aleatorioColumna));
                    
                    if (matriz[aleatorioFila][aleatorioColumna].equals("*")){
                        
                        System.out.println("Cinco");
                    
                        cargarPalabra(matriz, palabra, aleatorioFila, aleatorioColumna, largo);
                        agregar = true;
                    }
                    
                    break;
            }

        } while (agregar == false);
    }
    
    public static void leerPalabras(String [][]matriz){
    
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        int largo, contador;
        contador = 1;
        
        do{
            
            System.out.println("Ingrese una palabra, la misma no puede ser menor a tres caracteres y no puede ser mayor a 5 caracteres.");
            System.out.print("Ingrese la palabra "+contador+": ");
            palabra = leer.next();
            largo = palabra.length();
            System.out.println("Largo: "+largo);
            
            if(largo >= 3 && largo <= 5){
                
                seleccionAleatorio(matriz, palabra, largo);
                contador++;
 
            }else{
                
                System.out.println("La palabra no es del tamaño pedido");
            }
            System.out.println("Contador While: "+contador);
            
        }while (contador <= 5 );
    }
    
    public static void mostrarMatriz(String [][] matriz){
        
        int i, j;
        
        System.out.println("MOSTRAR MATRIZ.");
        System.out.println("");
        
        for (i = 0; i < 20; i++){
            
            for (j = 0; j < 20; j++){
                
                System.out.print(matriz[i][j]);
            }
            
            System.out.println("");
        }
            
        System.out.println("");
    }

    public static void cargarMatrizAsterisco(String [][] matriz){
        
        for (int i = 0; i < 20; i++){
            
            for (int j = 0; j < 20; j++){
                
                matriz[i][j] = "*";
            }
        }
            
        System.out.println("");
    }
}