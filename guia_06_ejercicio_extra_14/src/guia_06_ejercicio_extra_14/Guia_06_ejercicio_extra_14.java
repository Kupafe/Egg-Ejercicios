/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar el promedio de hijos de todas las familias
 */

package guia_06_ejercicio_extra_14;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int familias, i, suma, promedio;
        
        suma = 0;
        
        System.out.print("Ingrese la cantidad de familias que van a ser sensadas: ");
        familias = leer.nextInt();
        
        int[]hijos = new int [familias];
        
        System.out.println("");
        
        for (i = 0; i < familias; i++){
            
            System.out.print("Ingrese la cantidad de hijos y/o hijas de la familia "+i+": ");
            
            hijos[i] = leer.nextInt();
            //System.out.println("Hijos: "+hijos[i]);
            
        }
        
        System.out.println("");
        
        for (i = 0; i < familias; i++){
            
            suma = hijos[i] + suma;
            //System.out.println("Suma: "+suma);
            
        }
        
        System.out.println("");
        
        promedio = suma / familias;
        
        System.out.println("El promedio de la cantidad de hijos da como resultado: "+promedio+" por familia.");
        
        System.out.println("");
    }
}
