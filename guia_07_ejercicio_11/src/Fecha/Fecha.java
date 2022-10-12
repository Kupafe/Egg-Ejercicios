/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */

package Fecha;

import java.util.Date;
import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha actual es: "+fechaActual);
        
        int dia, mes, anio;
        String opcion;
        boolean opc = false;
        boolean opcFecha = false;
        
        do{
            
            System.out.println("");
            System.out.println("Programa que va a mostrar cuantos años hay entre la fecha ingresada y la fecha actual");
            System.out.println("");
            
            do{
                System.out.print("Ingrese el numero de dia: ");
                dia = leer.nextInt();
                
                if (dia >= 1 && dia <= 30){
                    
                    opcFecha = true;
                }
            }while(opcFecha == false);
            
            opcFecha = false;
            
            System.out.println("");
            
            do{
                System.out.print("Ingrese el numero de mes: ");
                mes = leer.nextInt();
                
                
                if (mes >= 1 && mes <= 12){
                    
                    opcFecha = true;
                }
            }while(opcFecha == false);
            
            opcFecha = false;
            
            System.out.println("");
            
            System.out.print("Ingrese el numero de año: ");
            anio = leer.nextInt();
            System.out.println("");

            Date fechaIngresada = new Date(anio-1900,mes-1,dia); // Se le resta 1900 para que la fecha quede bien
            System.out.println("La fecha que usted ingreso es: "+fechaIngresada);
            
            System.out.println("");
            
            System.out.println("La diferencia de fecha es : " + (fechaActual.getYear()-fechaIngresada.getYear())+" años.");
        
            System.out.println("");
            
            System.out.println("Quiere salir del programa. S (Si).");
            System.out.println("Presionando cualquier otro boton, se sigue con la ejecucion del programa.");
            opcion = leer.next();
            opcion= opcion.toUpperCase();
            
            if (opcion.equals("S")){

                opc = true;
                
            }
                
        }while (opc == false);
    
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
}