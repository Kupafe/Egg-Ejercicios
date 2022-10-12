/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */

package Arreglo;

import java.util.Arrays;

public class Arreglo {

    public static void main(String[] args) {

        double [] arregloA = new double[50];
        double [] arregloB = new double[20];
        
        // Ingresar datos aleatorios en el arregloA.
        for (int i = 0; i < 50; i++){
            
            arregloA[i] = (int)(Math.random() * 50);
        }
        
        //Mostrar los valores del ArregloA.
        
        System.out.println("VALORES DEL ARREGLO A.");
        System.out.println("");
        
        System.out.println(Arrays.toString(arregloA));

        // Ordena la matriz del valor menor a mayor
        Arrays.sort(arregloA);
        
        //Copia los primeros 10 numeros del arregloA al arregloB
        for (int i = 0; i < 10; i++) {
            
            arregloB[i] = arregloA[i];
        }
        
        // Se rellena los 10 últimos elementos con el valor 0.5.
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        
        /*
        Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y
        el combinado de 20.
        */
        
        System.out.println("VALORES ORDENADOS DEL ARREGLO A.");
        System.out.println("");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("VALORES DEL ARREGLO B.");
        System.out.println("");
        System.out.println(Arrays.toString(arregloB));
        System.out.println("");
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
}