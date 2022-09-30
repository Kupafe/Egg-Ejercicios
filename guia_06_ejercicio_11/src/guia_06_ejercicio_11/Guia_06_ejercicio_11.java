/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

package guia_06_ejercicio_11;

import java.util.Scanner;

public class Guia_06_ejercicio_11 {

    public static void main(String[] args) {
     int opcion, num1, num2;
     String opc;
     boolean fin;
     
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un número");
     num1 = leer.nextInt();
     System.out.println("Ingrese otro número");
     num2 = leer.nextInt();
     fin = false;
     do {
        
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opcion = leer.nextInt();
        switch (opcion)  {
               case 1: System.out.println("= " + (num1 + num2));
               break;
               case 2: System.out.println("= " + (num1 - num2));
               break;
               case 3: System.out.println("= " + (num1 * num2));
               break;
               case 4: System.out.println("= " + (num1 / num2));
               break;
               case 5: System.out.println("Desea salir del sistema S/N ");
                       opc = leer.next();
                       fin = opc.equals(opcion);
                       
                       System.out.println("Fin: "+fin);
                       break;
          }
        
     }while(fin != true);
     
   } 
}