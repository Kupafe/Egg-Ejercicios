/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia_06_ejercicio_extra_02;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_02 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    int A, B, C, D;
    
    System.out.print("Ingrese un Valor A: ");
    A = leer.nextInt();
    System.out.println("");
    System.out.print("Ingrese un Valor B: ");
    B = leer.nextInt();
    System.out.println("");
    System.out.print("Ingrese un Valor C: ");
    C = leer.nextInt();
    System.out.println("");
    System.out.print("Ingrese un Valor D: ");
    D = leer.nextInt();
    System.out.println("");
    
    int auxA, auxB, auxC, auxD;
    
    System.out.println("El valor de B es: "+B+" y ahora va a tomar el valor C: "+C+" - Nuevo Valor: "+(auxB = C));
    System.out.println("");
    System.out.println("El valor de C es: "+C+" y ahora va a tomar el valor A: "+A+" - Nuevo Valor: "+(auxC = A));
    System.out.println("");
    System.out.println("El valor de A es: "+A+" y ahora va a tomar el valor D: "+D+" - Nuevo Valor: "+(auxA = D));
    System.out.println("");
    System.out.println("El valor de D es: "+D+" y ahora va a tomar el valor B: "+B+" - Nuevo Valor: "+(auxD = B));
    }
}
