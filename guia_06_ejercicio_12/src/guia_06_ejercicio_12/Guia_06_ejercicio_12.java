/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia_06_ejercicio_12;

import java.util.Scanner;

public class Guia_06_ejercicio_12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        boolean fin;
        int longitud;
          
       
        
        do{
            fin = false;
            System.out.println("Ingrese una palabra: ");
            palabra = leer.next();
            longitud = palabra.length();
            
            if((longitud <= 5) && (palabra.substring(0,1).equals("x")) && (palabra.substring(longitud - 1, longitud).equals("0"))){
                System.out.println("CORRECTO.");
            }else{
                System.out.println("INCORRECTO.");
            }
            
             fin = palabra.equals("&&&&&");
            
             System.out.println("Fin: "+fin);
             
        } while (fin != true); //.equals("&&&&&"));
       
    }
    
}
