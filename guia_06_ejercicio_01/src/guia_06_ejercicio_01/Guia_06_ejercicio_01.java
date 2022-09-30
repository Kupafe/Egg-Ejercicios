/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/
package guia_06_ejercicio_01;

import java.util.Scanner;

public class Guia_06_ejercicio_01 {

    public static void main(String[] args) {

        int num1, num2, resultado;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para ser sumados: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de "+num1+" + "+num2+" = "+resultado);
    }
}
