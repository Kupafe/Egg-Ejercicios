/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.

 */
package Libro;

public class Libro {
    
    // Atributos
    
    private int isbn;
    private String titulo;
    private String autor;
    private int cantidadDePaginas;

    // Constructor con todos los parametros
    public Libro(int isbn, String titulo, String autor, int cantidadDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDePaginas = cantidadDePaginas;
    }
    
    // Constructor vacio
    public Libro() {
    }
    
    // Getter y Setter

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }
    
    public void mostrarLibro() {
        
        System.out.println("El ISBN es: "+ isbn);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: "+ autor);
        System.out.println("La cantidad de paginas son: "+ cantidadDePaginas);
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", cantidadDePaginas=" + cantidadDePaginas + '}';
    }
    
}
