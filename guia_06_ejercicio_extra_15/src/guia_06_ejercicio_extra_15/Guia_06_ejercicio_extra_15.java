/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia_06_ejercicio_extra_15;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_15 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        float numeroA, numeroB, resultado;
        String opcion;
        
        do{
            System.out.println("Para finalizar el programa ingrese el numero 0 en cada uno de los numeros.");
            System.out.print("Ingrese un Numero: ");
            numeroA = leer.nextFloat();
            
            System.out.print("Ingrese otro Numero: ");
            numeroB = leer.nextFloat();
            
            if (numeroA != 0 && numeroB != 0){

                System.out.println("¿Que cuenta matematica desea hacer con estos dos numeros.?");
                System.out.println("");
                System.out.println("      S - Suma.");
                System.out.println("      R - Resta.");
                System.out.println("      M - Multiplicacion.");
                System.out.println("      D - Division.");
            
                System.out.println("");
            
                System.out.print("Elija Opcion: ");
                opcion = leer.next();
            
                opcion = opcion.toUpperCase();
                System.out.println("");

                switch(opcion){
                
                    case "S":
                    
                        resultado = suma(numeroA, numeroB);
                        System.out.println("El resultado de la suma entre "+numeroA+" + "+numeroB+" es: "+resultado+".");
                
                        break;
            
                    case "R":
                    
                        resultado = resta(numeroA, numeroB);
                        System.out.println("El resultado de la resta entre "+numeroA+" - "+numeroB+" es: "+resultado+".");
                        
                        break;
                
                    case "M":
                
                        resultado = multiplicacion(numeroA, numeroB);
                        System.out.println("El resultado de la multiplicacion entre "+numeroA+" * "+numeroB+" es: "+resultado+".");
                    
                        break;
                
                    case "D":
                
                        resultado = division(numeroA, numeroB);
                        System.out.println("El resultado de la division entre "+numeroA+" / "+numeroB+" es: "+resultado+".");
                    
                        break;
                }
            }
            
        }while(numeroA != 0 && numeroB != 0);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
        
    public static float suma(float numeroA, float numeroB){
        
        return (numeroA + numeroB);
    }
    
    public static float resta(float numeroA, float numeroB){
        
        return (numeroA - numeroB);
    }
    
    public static float multiplicacion(float numeroA, float numeroB){
        
        return (numeroA * numeroB);
    }
    
    public static float division(float numeroA, float numeroB){
        
        return (numeroA / numeroB);
    }
}
