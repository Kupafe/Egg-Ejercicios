/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
24 Horas es igual a 1440 minutos
 */
package guia_06_ejercicio_extra_01;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese cantidad en minutos: ");
        int minutos = leer.nextInt();
        
        int dia = minutos / 1440;
        int minutosRestantes = minutos - (1440 * dia);
        int horas = minutosRestantes / 60;

        System.out.println("Los "+minutos+" minutos equivalen a "+dia+" dia/s y "+horas+" hora/s.");
    }
    
}
