/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia_06_ejercicio_extra_10;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numeroAleatorioA, numeroAleatorioB, resultado, contador, numero;
        
        contador = 0;
        
        numeroAleatorioA = (int) (Math.random() * 11);
        numeroAleatorioB = (int) (Math.random() * 11);
        resultado = numeroAleatorioA * numeroAleatorioB;
        System.out.println("Resultado: "+resultado);
        
        do{
            System.out.println("Ingrese un numero para adivinar el numero misterioso.");
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            
            contador++;
            
            if(numero == resultado){
                System.out.println("");
                System.out.println("USTED ADIVINO EL NUMERO MISTERIOSO.");
            }else{
                System.out.println("Siga participando, no acerto el numero misterioso.");
                System.out.println("Cantidad de intentos: "+contador);
            }
            System.out.println("");
            
        }while (resultado != numero); 
        
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
                
           
        //(int) (Math.random() * 9 + 1);
    }
    
}
