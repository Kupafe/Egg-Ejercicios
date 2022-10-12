/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicio;

import Libro.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro altaLibro(){
        
        Libro l1 = new Libro();
        
        System.out.print("Ingrese el ISBN del Libro: ");
        l1.setIsbn(leer.nextInt());
        
        System.out.print("Ingrese el Titulo del Libro: ");
        l1.setTitulo(leer.next());
        
        System.out.print("Ingrese el Autor del Libro: ");
        l1.setAutor(leer.next());
        
        System.out.print("Ingrese el Cantidad de Paginas del Libro: ");
        l1.setCantidadDePaginas(leer.nextInt());
        
        return l1;
    }   
}
