/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */

package Humano;

import Persona.Persona;
import PersonaServicio.PersonaServicio;
import java.util.Scanner;

public class Humano {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Se instancia el servicio
        PersonaServicio ps = new PersonaServicio();
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        
        String opcion;
        boolean opc = false;
        
        System.out.println("EN ESTE PROGRAMA SE VAN A INGRESAR DOS PERSONAS PARA SABER QUIEN ES EL MENOR DE LOS DOS."
                    + "LUEGO DE ESTE PROCESO SE LE VA A PREGUNTAR SI QUIERE VERIFICAR OTRAS DOS PERSONAS O SALIR DEL SISTEMA.");
        do{
 
            System.out.println("");
            
            // Se crea la persona 1 con la llamada al metodo del servicio
            per1 = ps.crearPersona();
            //Persona p2 = s.crearPersona();
            ps.mostrarPersona(per1);
     
            // llamada al metodo para calcular la edad
            System.out.println("\n" + per1.getNombre() + " tiene " + ps.calcularEdad(per1) + " años.");
            
            System.out.println("");
            
            // Se crea la persona 2 con la llamada al metodo del servicio
            per2 = ps.crearPersona();
            
            ps.mostrarPersona(per2);
     
            // llamada al metodo para calcular la edad
            System.out.println("\n" + per2.getNombre() + " tiene " + ps.calcularEdad(per2) + " años.");
            
            System.out.println("");     
            
            /*
            Llamada al metodo menorQue y validamos dentro de un if ya que
            regresa true o false en este caso comparamos la edad de las dos
            personas y sabremos cual de los dos es menor que el otro/a.
            */
            
            if ( ps . menorQue ( per1 , ps . calcularEdad ( per2 )) == true ) {
            
                System.out.println(per1 . getNombre () + " es menor que " + per2 . getNombre ());
			
            } else {
		
                System.out.println( per2 . getNombre () + " es menor que " + per1 . getNombre ());
	    }
            System.out.println("");    

            System.out.println("Para salir del programa presione S (Si).");
            System.out.print("Para continuar, presione cualquier otra tecla: ");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
            
            if (opcion.equals("S")){
                
                opc = true;
            }
               
        }while (opc == false);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
}