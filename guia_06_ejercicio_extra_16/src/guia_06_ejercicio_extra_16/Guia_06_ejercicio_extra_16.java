/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia_06_ejercicio_extra_16;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int tamano;
                
        System.out.print("Ingrese la cantidad de personas que va a sensar: ");
        tamano = leer.nextInt();
        
        String vectorNombre[] = new String[tamano];
        int vectorEdad[] = new int[tamano];
        
        ingresarDatos(vectorNombre, vectorEdad, tamano);
        
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
        System.out.println("");
    }
    
    public static void mostrarDatos(String []vectorNombre, int []vectorEdad, int tamano ){
        
        Scanner leer = new Scanner(System.in);
        String opcion;
        
        for (int i = 0; i < tamano; i++){
             
             System.out.println("La persona "+vectorNombre[i]+" tiene "+vectorEdad[i]+" años.");
             
             System.out.println("Quiere seguir mostrasdo mas personas.");
             System.out.println("S - Si / N - No");
             System.out.print("Ingrese opcion: ");
             opcion = leer.next();
             
             opcion = opcion.toUpperCase();
             
             if (opcion.equals("N")){
                 break;
             }
             
            
        }
    }
    
    public static void ingresarDatos(String []vectorNombre, int []vectorEdad, int tamano ){
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tamano; i++){
                
            System.out.print("Ingrese el nombre de la persona: ");
            vectorNombre[i] = leer.next();
                
            System.out.print("Ingrese la edad de "+vectorNombre[i]+": ");
            vectorEdad[i] = leer.nextInt();
        
            System.out.println("");
            
            if (vectorEdad[i] > 18){
                
                System.out.println(vectorNombre[i]+" es mayor de edad, ya que la misma tiene "+vectorEdad[i]+" años.");
            }else{
                System.out.println(vectorNombre[i]+" es menor de edad, ya que la misma tiene "+vectorEdad[i]+" años.");
            }
            System.out.println("");
        }
        
        mostrarDatos(vectorNombre, vectorEdad, tamano);
    }    
    

}
