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

package PersonaServicio;

import Persona.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    /*
    Metodo CrearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    public Persona crearPersona() {
		
        // Pido el nombre del usuario
	System.out.print("\nIngrese nombre: ");
	String nombre = leer.nextLine();

	System.out.print("Ingrese apellido de "+nombre+": ");
	String apellido = leer.nextLine();

	System.out.println("\nIngrese la fecha de nacimiento de "+nombre+" "+apellido+": ");
	System.out.print("Dia: ");
	int dia = Integer.parseInt(leer.nextLine());
	
	System.out.print("Mes: ");
	int mes = Integer.parseInt(leer.nextLine());

        System.out.print("Año: ");
	int anio = Integer.parseInt(leer.nextLine());

	// Se crea la fecha para pasarla al Objeto Persona
	LocalDate fechaNaciemiento = LocalDate.of(anio, mes, dia);

	// Se crea el objeto directamente en el return
	// es igual a decir Persona p = new Persona(nombre, apellido, fechaNaciemiento);
	return new Persona(nombre, apellido, fechaNaciemiento);
    }
    
    /*
    Este método muestra la persona creada con la llamada al metodo toString del
    Obj Persona. Podriamos llamar los valores por un Get pero si el toString ya
    esta construido, esta es una forma mas rapida de obtener los valores
    */   
    public void mostrarPersona(Persona per) {
	
        System.out.println("\n========================");
	System.out.println(per.toString());
	System.out.println("========================");
    }
    
    /*
    A partir de la fecha de nacimiento ingresada calculara la edad de la persona.
    Tener en cuenta que para conocer la edad de la persona también se debe
    conocer la fecha actual.
    */	 
    public int calcularEdad(Persona persona) {
        
        // Se trae la fecha de nacimiento del objeto
	LocalDate fechaNacimiento = persona.getFechaNacimiento();

	// Se trae la fecha actual
	LocalDate fechaActual = LocalDate.now();

	// Se calcula la edad de la persona con el tiempo transcurido entre fechas
	int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
		
	return calcularEdad;
    }
    
    /*
    Recibe como parámetro otra edad y retorna true en caso
    de que el receptor tenga menor edad que la persona que se recibe como
    parámetro, o false en caso contrario.
    */
    public boolean menorQue(Persona per, int edad) {
        
        boolean esMenor = false; // Variable de retorno
		
	int edadPersona = calcularEdad(per); // Se trae la edad de la persona
		
	// Se valida si es menor que la que ingreso el usuario
	if (edadPersona < edad) {

            esMenor = true;
                    
        } else {
                    
            esMenor = false;
	}
		
	return esMenor;
    }
}