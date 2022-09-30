/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package guia_06_ejercicio_16;

import java.util.Scanner;

public class Guia_06_ejercicio_16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int i,m;
        boolean seencuentra;
        seencuentra=true;
   
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        for(i=0; i<n;i++){
            
            vector [i] =(int)(Math.random()*50+1);
            System.out.print("Vector: "+vector[i]+" ");
            
        }
        
        System.out.println("Ingrese un numero a buscar");
        
        m = leer.nextInt();
        
        for(i=0; i<n;i++){
            
            if(m==vector[i]){
                
                System.out.println("Se encuentra el numero en la posicion i: "+i);
            
            }else{
            
                seencuentra=false;
                
            }
        }
        
        if(seencuentra==false){
        
            System.out.println("El numero no se encuentra");
        
        }
    }
}