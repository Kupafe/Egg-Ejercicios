/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia_06_ejercicio_04;

import java.util.Scanner;

public class Guia_06_ejercicio_04 {

    public static void main(String[] args) {
        
        int centigrados, fahrenheit;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en C° para convertirla a Fº");
        centigrados = leer.nextInt();
        
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("La temperatura en F° seria: "+fahrenheit);
    }
    
}
