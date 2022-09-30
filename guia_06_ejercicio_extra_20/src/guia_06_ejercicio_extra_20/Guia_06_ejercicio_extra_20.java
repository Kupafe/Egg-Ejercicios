/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */

package guia_06_ejercicio_extra_20;

public class Guia_06_ejercicio_extra_20 {


    public static void main(String[] args) {
    
        int tamano = 9;
        int[]vectorA = new int[tamano];
        int []vectorB = new int[tamano];
       
        System.out.println("");
        
        relleno(vectorA, tamano);
        
        muestra(vectorA, tamano);
        
        System.out.println("");
        
        System.out.println("---------");
        
        relleno(vectorB, tamano);
        muestra(vectorB, tamano);
        System.out.println("");
        System.out.println("");
        
    }//cierra main
    
    public static void relleno(int[]vector, int tamano){
        
        for (int i = 0; i < tamano; i++) {
        
            vector[i]=(int)(Math.random()*10);
        }
        
    }//cierra relleno
    
    public static void muestra(int[]vector, int tamano){
        
        for (int i = 0; i < tamano; i++) {
        
            System.out.print(vector[i]);
        }
    }//cierra muestra
    
}//cierra class
