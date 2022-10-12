/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá ́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */

package CancionServicio;

import Cancion.Cancion;
import java.util.Scanner;

public class CancionServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    Cancion can = new Cancion();
    
    public Cancion crearCancion(){
        
        // Pido el titulo de la cancion
	System.out.print("\nIngrese el nombre de la cancion: ");
	can.setTitulo(leer.next());
        
        // Pido el Autor de la cancion
	System.out.print("\nIngrese el autor de la cancion "+can.getTitulo()+": ");
	can.setAutor(leer.next());
        
        return can;
    }

    public void mostrarCancion(Cancion can){
        
        System.out.println("\nEl autor de la cancion "+can.getTitulo()+" es "+can.getAutor()+".\n");
    }
}



/*
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
*/
