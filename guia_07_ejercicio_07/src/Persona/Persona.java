/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 
    • Un constructor por defecto.
    • Un constructor con todos los atributos como parámetro.
    • Métodos getters y setters de cada atributo.
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
      usuario y después se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
      Si no es correcto se deberá mostrar un mensaje
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
      kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
      que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
      fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
      está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
      fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
      función devuelve un 1.
    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
      un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */

// Realizar una clase llamada Persona
package Persona;

public class Persona {

    /*
    Atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso 
    y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo.
    */
    
    private String Nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    // Un constructor por defecto.
    
    public Persona() {
    }

    // Un constructor con todos los atributos como parámetro.
    
    public Persona(String Nombre, int edad, char sexo, double peso, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Métodos getters y setters de cada atributo.

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
