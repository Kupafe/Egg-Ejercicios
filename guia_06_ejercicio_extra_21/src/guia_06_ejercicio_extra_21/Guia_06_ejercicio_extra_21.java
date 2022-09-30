/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */

package guia_06_ejercicio_extra_21;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_21 {

    public static void main(String[] args) {
   
        double [][]matriz = new double[10][5];
        
        System.out.println("");
        
        ingresarNotas(matriz);
        
        promedio(matriz);
        
        contarAprobadosdesaprobados(matriz);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
    
    public static void contarAprobadosdesaprobados(double [][]matriz){
        
        for (int i = 0; i < 10; i++){
            
            if (matriz[i][4] >= 7){
                
                System.out.println("El alumno "+(i + 1)+" tiene un promedio de "+matriz[i][4]+", el cual SI se encuentra aprobado.");
            
            }else{
                
                System.out.println("El alumno "+(i + 1)+" tiene un promedio de "+matriz[i][4]+", el cual NO se encuentra aprobado.");
            }
        }
    }
    
    public static void promedio(double [][]matriz){
    
        for (int i = 0; i < 10; i++){
            
            matriz[i][4] = (matriz[i][0] +  matriz[i][1] +  matriz[i][2] +  matriz[i][3]) / 4;
        }
    }   
    
    public static void ingresarNotas(double [][]matriz){
        
        Scanner leer = new Scanner(System.in);
                
        for (int i = 0; i < 10; i++){
            
            System.out.println("INGRESE LAS NOTAS DEL ESTUDIANTE: "+(i + 1));
            
            // Columna 0 - Primer trabajo práctico evaluativo
            System.out.print("Ingrese la nota del Primer trabajo práctico evaluativo: ");
            matriz[i][0] = leer.nextDouble();
          
                
            // Columna 1 - Segundo trabajo práctico evaluativo
            System.out.print("Ingrese la nota del segundo trabajo práctico evaluativo: ");
            matriz[i][1] = leer.nextDouble();
                
            // Columna 2 - Primer Integrador
            System.out.print("Ingrese la nota del primer Integrador: ");
            matriz[i][2] = leer.nextDouble();
                
            // Columna 3 - Segundo Integrador
            System.out.print("Ingrese la nota del segundo Integrador: ");
            matriz[i][3] = leer.nextDouble();
        }       
    }
}