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
      Si no es correcto se deberá mostrar un mensaje.
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

package PersonaServicio;

import Persona.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    Persona per = new Persona();
        
    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje.
    */
    
    public Persona ingresarDatos(Persona per){
        
        int edadPersona;
        String sexoPersona;
        double pesoPersona, alturaPersona;
        boolean person = false;
        
        // Nombre.
        System.out.print("Ingrese el Nombre de la persona: ");
        per.setNombre(leer.next());
        
        // Edad.
        do{
       
            System.out.println("Ingrese la Edad de "+per.getNombre()+".");
            System.out.println("Este debe de ser un Numero Positivo.");
            System.out.print("Ingrese la Edad de "+per.getNombre()+": ");
            edadPersona = leer.nextInt();
            
            if (edadPersona > 0 && edadPersona <= 120){
                
                person = true;
            }
            
        }while (person == false);
            
        per.setEdad(edadPersona);
        
        person = false;
        
        // Sexo ('H' hombre, 'M' mujer, 'O' otro)
        
         do{
       
            System.out.println("Ingrese el Tipo de Sexo de "+per.getNombre()+".");
            System.out.println("H - Hombre.");
            System.out.println("M - Mujer."); 
            System.out.println("O - Otro");
            System.out.println("Este debe de ser un Numero Positivo.");
            System.out.print("Ingrese el Sexo de "+per.getNombre()+": ");
            sexoPersona = leer.next();
            sexoPersona = sexoPersona.toUpperCase();
            
            if(sexoPersona.equals("H") || sexoPersona.equals("M") || sexoPersona.equals("O")){
                
                person = true;
                
            }else{
                
                System.out.println("El dato fue mal ingresado.");
            }

        }while (person == false);
            
        per.setEdad(edadPersona);

        person = false;
        
        // Peso
        
        do{
       
            System.out.println("Ingrese el Peso en Kilogramos de "+per.getNombre()+".");
            
            System.out.println("Este debe de ser un Peso Positivo.");
            System.out.print("Ingrese el Peso de "+per.getNombre()+": ");
            pesoPersona = leer.nextDouble();

            if (pesoPersona > 0 && pesoPersona <= 500){
                
                person = true;
                
            }else{
                
                System.out.println("El dato fue mal ingresado.");
            }

        }while (person == false);
            
        per.setPeso(pesoPersona);
        
        person = false;
        
         // Altura
         
        do{
       
            System.out.println("Ingrese la Altura en Metros de "+per.getNombre()+".");
            
            System.out.println("Este debe de ser una Altura Positiva.");
            System.out.print("Ingrese la Altura de "+per.getNombre()+": ");
            alturaPersona = leer.nextDouble();

            if (alturaPersona > 0 && alturaPersona <= 2.25){
                
                person = true;
                
            }else{
                
                System.out.println("El dato fue mal ingresado.");
            }

        }while (person == false);
            
        per.setPeso(pesoPersona);
        
        return per;
    }
    
    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
    
    IMC = peso / (Altura * Altura)
    */
    public int calcularIMC(Persona per){
        
        double pesoIdeal;
        
        pesoIdeal = per.getPeso() / (per.getAltura() * per.getAltura());
        
        if (pesoIdeal < 20){
            
            System.out.println("Esta debajo desupeso ideal.");
            return -1;
            }else if (pesoIdeal >= 20 && pesoIdeal <=25){
                return 0;
            }else{
                return 1;
            }
    }
    
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.
    */
    public boolean esMayorDeEdad(Persona per){
        
        if (per.getEdad() >= 18){
            
            return true;
            
        }else{
            
            return false;
        }
    }   
}