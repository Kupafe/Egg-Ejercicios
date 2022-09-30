/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */

package guia_06_ejercicio_09;

import java.util.Scanner;

public class Guia_06_ejercicio_09 {

    public static void main(String[] args) {
        
        String palabra, letra, letraA;
        int indice;

        letraA = "A";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        
        if (palabra.substring(0,1).equals("A")){ 
                   
            System.out.println("CORRECTO");
        
        }else{
        
            System.out.println("INCORRECTO");  
        }
    }        
}
    
/*
Ejemplo

COMO COMPARAR STRING EN JAVA
Hoy voy a poner como se pueden comparar String en Java porque aunque ciertamente es sencillo siempre nos puede entrar la tentación de compararlos usando == como si fuese cualquier otro tipo de objeto y nuestra aplicación como es lógico no funcionará como queremos y como es una cosa sencilla quizás pienses que el error en otro lado y te pases un buen rato perdiendo el tiempo. A mi me paso alguna vez cuando estaba aprendiendo Java y aprovechando que me lo han preguntado pues lo comparto aquí.

PORQUE NO USAR ==
Cuando comparamos un String con == lo que se comprueba es si ambos Strings son el mismo objeto, pero no si su contenido es el mismo por lo que este método no nos vale, aunque hay casos en los que si funciona es mejor no usarlo nunca porque lo normal será que no funcione.


String cadena1 = "Hola Mundo!!!";
String cadena2 = "Hola Mundo!!!";
String cadena3 = new String( "Hola Mundo!!!" );

// Funciona bien
if (cadena1 == cadena2) {
    System.out.println("Cadena1 y cadena2 son iguales");
} else {
    System.out.println("Cadena1 y cadena2 son distintas");
}

// No funciona porque cadena1 y cadena3 son objetos distintos
if (cadena1 == cadena3) {
    System.out.println("Cadena1 y cadena3 son iguales");
} else {
    System.out.println("Cadena1 y cadena3 son distintas");
}
Pero porque cadena1 y cadena2 son el mismo objeto y cadena3 no? pues la explicación esta en que el compilador de Java cuando declaramos la cadena2 se da cuenta de que ya hay un objeto con ese mismo valor y lo usa por lo que cadena1 y cadena2 hacen referencia al mismo objeto en memoria pero con cadena3 como estamos usando el constructor crea una nueva instancia y es distinta de las 2 anteriores aunque el contenido del String sea el mismo.

COMPARAR CON EQUALS()
Con equals se compara el contenido del string por lo que el resultado será el que queríamos.


String cadena1 = "Hola Mundo!!!";
String cadena2 = "Hola Mundo!!!";
String cadena3 = new String( "Hola Mundo!!!" );

// Funciona bien
if (cadena1.equals(cadena2)) {
    System.out.println("Cadena1 y cadena2 son iguales");
} else {
    System.out.println("Cadena1 y cadena2 son distintas");
}

// Tambien funciona bien
if (cadena1.equals(cadena3)) {
    System.out.println("Cadena1 y cadena3 son iguales");
} else {
    System.out.println("Cadena1 y cadena3 son distintas");
}

// Tambien funciona bien
if (cadena1.equals("Hola Mundo!!!")) {
    System.out.println("Las cadenas son iguales");
} else {
    System.out.println("Las cadenas son distintas");
}

// Tambien funciona bien
if ("Hola Mundo!!!".equals(cadena2)) {
    System.out.println("Las cadenas son iguales");
} else {
    System.out.println("Las cadenas son distintas");
}
El método equals es el más sencillo para comparar Strings ya que funciona como el == pero como es un método hay que llamarlo sobre un string.

COMPARAR CON COMPARETO()
Otra alternativa para comparar cadenas es compareTo que nos sirve para saber si dos cadenas son iguales o cual de ellas es mayor, devuelve 0 si las cadenas son iguales, -1 si la primera es menor y 1 si es mayor.

La comprobación se hace comparando los códigos ASCII de cada letra de ambas cadenas hasta que se encuentre alguna diferencia o hasta que se acabe la cadena por lo que ordena los strings alfabéticamente en principio aunque si tienen letras con acentos o letras mayúsculas y minúsculas no lo hace correctamente porque compara los códigos ASCII.


if (cadena1.compareTo(cadena2) == 0) {
    System.out.println("Las cadenas son iguales");
} else {
    if (cadena1.compareTo(cadena2) < 0) {
        System.out.println("La primera cadena es menor");
    } else {
        System.out.println("La primera cadena es mayor");
    }
}
COMPARAR CON COLLATOR
El método compareTo tiene el problema de que una letra mayúscula es distinta de una minúscula o de la misma letra con acento por lo que para ordenar palabras no es demasiado efectivo.

La alternativa es Collator que nos permite definir los criterios para definir como queremos que se traten mayúsculas, minúsculas y letras acentuadas para hacer las comparaciones. Hay 4 posibilidades distintas:

Collator.PRIMARY: No se distingue si la letra es mayúscula, minúscula o si esta acentuada. (A = a = á)
Collator.SECONDARY: No se distingue entre mayúsculas y minúsculas pero si son distintas las letras acentuadas. (A = a != á)
Collator.TERTIARY: Se distingue entre mayúsculas, minúsculas y letras acentuadas. (A != a != á)
Collator.IDENTICAL: Dos letras son iguales únicamente si su código lo es, aunque se vean iguales. Hay letras que se pueden codificar de distintas maneras, por ejemplo las letras acentuadas.
La clase collator cuenta con un método equals() y con otro compare() que funcionan de forma similar a equals() y compareTo() por lo que podemos hacer comparaciones como en los ejemplos anteriores pero con la posibilidad de decidir si queremos que se distinga o no se distinga entre mayúsculas, minúsculas y letras con acentos.


String cadena1 = "hola mundo";
String cadena2 = "Hola amigo";
String cadena3 = "Hóla Mundo";

Collator comparador = Collator.getInstance();

// Ejemplo del metodo equals

// Para no distinguir entre mayusculas, minusculas y letras con acentos.
comparador.setStrength(Collator.PRIMARY);

// Se hace la comparación (Son iguales)
if (comparador.equals(cadena1, cadena3)) {
    System.out.println("Las cadenas son iguales");
} else {
    System.out.println("Las cadenas son distintas");
}

// Para no distinguir entre mayusculas y minusculas.
comparador.setStrength(Collator.SECONDARY);

// Se hace la comparación (Son distintas)
if (comparador.equals(cadena1, cadena3)) {
    System.out.println("Las cadenas son iguales");
} else {
    System.out.println("Las cadenas son distintas");
}

// Ejemplo del metodo compare

// Para no distinguir entre mayusculas, minusculas y letras con acentos.
comparador.setStrength(Collator.PRIMARY);
if (comparador.compare(cadena1, cadena2) == 0) {
    System.out.println("Las cadenas son iguales");
} else {
    if (comparador.compare(cadena1, cadena2) < 0) {
        System.out.println("La primera cadena va antes");
    } else {
        System.out.println("La primera cadena va despues");
    }
}
*/