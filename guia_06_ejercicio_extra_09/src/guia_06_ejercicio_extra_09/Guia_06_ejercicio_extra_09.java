/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

package guia_06_ejercicio_extra_09;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numeroA, numeroB;
        boolean positivo;
        
        do{
            
            System.out.println("Ingrese dos numeros enteros positivos: ");
            System.out.print("Numero A: ");
            numeroA = leer.nextInt();
            System.out.print("Numero B: ");
            numeroB = leer.nextInt();
            
            if (numeroA > 0 && numeroB > 0){
                
                positivo = true;
                
            }else{
                positivo = false;
            }
            
            System.out.println("Positivo: "+positivo);
        
        } while (positivo == false);
        
        System.out.println("Hola");

        if (numeroA > numeroB) {
            
            division(numeroA, numeroB);
            
        }else{
            
            division(numeroB, numeroA);
        }
    }
    
    public static void division(int num1, int num2){
        
        int residuo = num1;
        int cociente = 0;
        
        System.out.println("Chau");
        while(num2 < residuo){
        
            residuo = residuo - num2;
            cociente++;
            /*
            System.out.println("Residuo: "+residuo);
            System.out.println("Num2: "+num2);
            System.out.println("Num1: "+num1);
            System.out.println("Cociente: "+cociente);
            System.out.println("");
            */
        }

        System.out.println("El COCIENTE y RESIDUO entre la division de los numeros "+num1+"/"+num2+" es:");
        System.out.println("COCIENTE: "+cociente);
        System.out.println("RESIDUO: "+residuo);
    }
}
