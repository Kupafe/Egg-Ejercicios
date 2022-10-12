/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */

package Oracion;

import Cadena.Cadena;
import CadenaServicio.CadenaServicio;
import java.util.Scanner;

public class Oracion {

    public static void main(String[] args) {

        /*
        En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
        que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
        través de los métodos set, se guardará la frase y la longitud de manera automática según
        la longitud de la frase ingresada. 
        */
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n"); // useDelimiter("\n") --> Me permite leer frases
         
         CadenaServicio cs = new CadenaServicio();
         Cadena cad = new Cadena();
         boolean salir = false;
         boolean contieneLetra;
         
         int longitud;
         String frase;
         
         do{
             
             System.out.println("");
             System.out.println("Ingrese una Frase que puede ser una palabra o varias palabras separadas por un espacio en blanco.");
             System.out.println("Para Finalizar escriba: &&&&.");
             System.out.print("Ingrese una frase: ");
             cad.setFrase(leer.next());
             cad.setLongitud(cad.getFrase().length()); // Saco la Longitud de la frase

             System.out.println("");
             System.out.println("Mostrar Frase: "+cad.getFrase());
             System.out.println("Mostrar Longitud: "+cad.getLongitud());
         
         
            if(!cad.getFrase().equals("&&&&")){
                
                System.out.println("");
                cs.mostrarVocales(cad);
                System.out.println("");
                cs.invertirFrase(cad);
                System.out.println("");
                cs.vecesRepetido(cad);
                System.out.println("");
                cs.compararLongitud(cad);
                System.out.println("");
                cs.unirFrase(cad);
                System.out.println("");
                cs.reemplazar(cad);
                System.out.println("");
                contieneLetra = cs.contiene(cad);
                
                if (contieneLetra == true){
                    
                    System.out.println("La frase SI contiene la letra.");
                
                }else{
                    System.out.println("La frase NO contiene la letra.");
                }
                
                System.out.println("");
                
            }else{
                
                 salir = true;
            }
         
         }while (salir == false);
         
         System.out.println("FINLIZO LA EJECUCION DEL PROGRAMA.");
    }
}
