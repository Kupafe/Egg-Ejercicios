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

package CadenaServicio;

import Cadena.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cadena cad = new Cadena();
    
    char letra;
    int vocal = 0;
    String fraseAComparar;
    
    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
       tiene la frase ingresada.
    */
    
    public void mostrarVocales(Cadena cad){
        
        System.out.println("CANTIDAD DE VOCALES QUE HAY EN LA FRASE.");
        System.out.println("");
        
        for (int i = 0; i < cad.getLongitud(); i++){
            
            letra = cad.getFrase().charAt(i);
            
            if ((letra == 'A') || (letra == 'a') || (letra == 'E') || (letra == 'e') || (letra == 'I') || (letra == 'i') || (letra == 'O') || (letra == 'o') || (letra == 'U') || (letra == 'u')){
                
                vocal++;  
            }
        }
        
        System.out.println("La cantidad de vocales que tiene la frase son: "+vocal+" vocales.");
    }
    
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
       ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena cad){
        
        System.out.println("FRASE INVERTIDA.");
        System.out.println("");
        
        for (int i = cad.getLongitud() - 1 ; i >= 0; i--){
             
             letra = cad.getFrase().charAt(i);
             
             System.out.print(letra);
        }
        
        System.out.println("");
    }
    
    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
       contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    public void vecesRepetido(Cadena cad){
        
        int vecesRepetida = 0;
        
        System.out.println("CANTIDAD DE VECES QUE HAY UNA LETRA.");
        System.out.println("");
        
        System.out.print("Ingrese la letra que va a buscar dentro de la frase: ");
        char letraABuscar = leer.next().charAt(0);
       
        for (int i = 0; i < cad.getLongitud(); i++){
            
            letra = cad.getFrase().charAt(i);
            
            if ((letraABuscar == letra)){
                
                vecesRepetida++;  
            }
        }
        
        System.out.println("La cantidad de veces que se repite la letra "+letraABuscar+" dentro de la frase es: "+vecesRepetida+" veces.");
    }
    
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
       compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(Cadena cad){

        int largoFrase = 0;

        System.out.println("COMPARAR LONGITUD.");
        System.out.println("");
        System.out.print("Ingrese frase para comparar el largo de la frase con la ingresada anteriormente: ");
        fraseAComparar = leer.next();
        
        largoFrase = fraseAComparar.length();
        
        System.out.println("La frase: "+cad.getFrase()+" tiene "+cad.getLongitud()+" y la frase "+fraseAComparar+" tiene "+largoFrase+" caracteres.");
    }
    
    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
       una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrase(Cadena cad){
        
        String fraseAAgregar;
        
        System.out.println("UNIR FRASE.");
        System.out.println("");
        System.out.print("Ingrese frase para unirla a la frase con la ingresada anteriormente: ");
        fraseAAgregar = leer.next();
        
        cad.setFrase(cad.getFrase() +" "+fraseAAgregar);
        
        System.out.println("La frase nueva es: "+cad.getFrase());
    }
    
    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
       encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
       frase resultante.
    */
    public void reemplazar(Cadena cad){
        
        System.out.println("REEMPLAZAR LETRA.");
        System.out.println("");
        
        System.out.print("Ingrese la letra que va a buscar dentro de la frase: ");
        char letraABuscar = leer.next().charAt(0);
        
        System.out.print("Ingrese el caracter con el que va a reemplazar la letra "+letraABuscar+" dentro de la frase: ");
        char caracterNuevo = leer.next().charAt(0);
       
        for (int i = 0; i < cad.getLongitud(); i++){
            
            letra = cad.getFrase().charAt(i);
            
            if ((letraABuscar == letra)){
                
                System.out.print(caracterNuevo);
            
            }else{
            
                System.out.print(letra);
            }
        }
    }
    
    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public boolean contiene(Cadena cad){
        
        int contadorLetraABuscar = 0;
        System.out.println("VERIFICAR SI CONTIENE UNA LETRA ESPECIFICA.");
        System.out.println("");
        
        System.out.print("Ingrese la letra que va a buscar dentro de la frase: ");
        char letraABuscar = leer.next().charAt(0);
        
        for (int i = 0; i < cad.getLongitud(); i++){
            
            letra = cad.getFrase().charAt(i);
            
            if ((letraABuscar == letra)){
                
                contadorLetraABuscar++;
            }
        }
        
        if (contadorLetraABuscar > 0){
            
            return true;
            
        }else{
           
            return false;
        }
    }
}
/*
public void vecesRepetido(Cadena cad){
        
        int vecesRepetida = 0;
        
        System.out.println("CANTIDAD DE VECES QUE HAY UNA LETRA.");
        System.out.println("");
        
        System.out.print("Ingrese la letra que va a buscar dentro de la frase: ");
        char letraABuscar = leer.next().charAt(0);
       
        for (int i = 0; i < cad.getLongitud(); i++){
            
            letra = cad.getFrase().charAt(i);
            
            if ((letraABuscar == letra)){
                
                vecesRepetida++;  
            }
        }
        
        System.out.println("La cantidad de veces que se repite la letra "+letraABuscar+" dentro de la frase es: "+vecesRepetida+" veces.");
    }
*/