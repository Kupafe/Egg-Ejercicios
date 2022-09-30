/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
      todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
      los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
      tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
      real que represente el costo del tratamiento (previo al descuento) y determine el
      importe en efectivo a pagar por dicho socio.
 */

package guia_06_ejercicio_extra_05;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String letra;
        
        int costoTratamiento = 7500;
        boolean salir = false;

        do {

            System.out.println("MENU OBRA SOCIAL.");
            System.out.println("");
            System.out.println("Ingrese la CLASE DE SOCIO.");
            System.out.println("A - Mayor.");
            System.out.println("B - Medio.");
            System.out.println("C - Bajo.");
            System.out.println("---------");
            System.out.println("S - Salir");
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            letra = leer.next();
            letra = letra.toUpperCase();
            
            if ((letra.equals("A") || letra.equals("B") || letra.equals("C"))){  //|| letra.equals("S") || letra.equals("s"){
                
                switch(letra){
                    
                    /*
                    Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
                    todos los tipos de tratamientos.*/
                    
                    case "A":

                        System.out.println("El costo de tratamiento del asociado es de: "+(costoTratamiento - ((50 * costoTratamiento) /100))+" Pesos. por ser de Tipo A.");
                    break;
                    
                    /*
                    Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
                    los mismos tratamientos que los socios del tipo A.
                    */
                        
                    case "B":
                         System.out.println("El costo de tratamiento del asociado es de: "+(costoTratamiento - ((35 * costoTratamiento) /100))+" Pesos. por ser de Tipo B.");
                        break;
                        
                        /*
                        Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
                        tratamientos.
                        */
                        
                    case "C":
                         System.out.println("El costo de tratamiento del asociado es de: "+costoTratamiento+" Pesos. por ser de Tipo C.");
                        break;
                        
                        // Salir
                    case "S":
                        salir = true;
                        break;
                }
            }
            
        } while (salir != false);
    }
}