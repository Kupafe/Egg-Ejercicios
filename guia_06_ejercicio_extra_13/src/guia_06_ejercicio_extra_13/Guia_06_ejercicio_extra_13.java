/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package guia_06_ejercicio_extra_13;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, contador, i, j;
        
        System.out.println("");
        
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        contador = 1;
        
        System.out.println("");
        for(i = 1; i <= numero; i++){
            for(j = 1; j <= contador; j++){
                System.out.print(j+" ");
              
            }
            contador++;
            System.out.println("");
        }
        
        System.out.println("");
        
        /*
	Para i = 0 Hasta num Con Paso 1 Hacer
		Para j = 1 hasta contadorInverso Con Paso 1 Hacer
			Mostrar Sin Saltar "* "
		FinPara
		contadorInverso = contadorInverso - 1
		Mostrar ""
	FinPara
        */
        
    }

}

/*
/// Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
/// invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
/// deberá mostrar:
///		*****
///		****
/// 	***
/// 	**

Algoritmo ejercicio_extra_14
	
	Definir num, i, j, contadorInverso Como Entero
	
	Mostrar ""
	
	Hacer
		
		Escribir Sin Saltar "Ingrese un Numero Natural "
		Leer num
		
	Mientras Que num <= 0
	
	contadorInverso = num
	
	Mostrar ""
	
	Para i = 0 Hasta num Con Paso 1 Hacer
		Para j = 1 hasta contadorInverso Con Paso 1 Hacer
			Mostrar Sin Saltar "* "
		FinPara
		contadorInverso = contadorInverso - 1
		Mostrar ""
	FinPara
	

	
FinAlgoritmo
*/