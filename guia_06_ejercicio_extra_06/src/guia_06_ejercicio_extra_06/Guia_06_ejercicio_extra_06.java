/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */

package guia_06_ejercicio_extra_06;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int personas, altura, totalAltura, alturaMenor160, personasMenor160;
        
        totalAltura = 0;
        alturaMenor160 = 0;
        personasMenor160 = 0;

        
        System.out.print("Ingrese la cantidad de personas de las que va a tomar la altura: ");
        
        personas = leer.nextInt();
        System.out.println("");
        
        for (int i = 0; i < personas; i++){
            
            System.out.print("Ingrese la altura de la persona "+(i + 1)+" en centimetros: ");
            altura = leer.nextInt();
            
            totalAltura = totalAltura + altura;
            
            
            if (totalAltura <= 160){
                
                personasMenor160++;
                alturaMenor160 = alturaMenor160 + altura;
                
                
            }
        }
        System.out.println("");
        System.out.println("El promedio de estaturas que se encuentran por debajo de 160 cms es de "+alturaMenor160 / personasMenor160+" cms.");
        
        System.out.println("");
        System.out.println("El promedio general de las personas es de "+(totalAltura / personas)+" centimetros.");
        System.out.println("");

    }
    
    // Promedio de estaturas en general
    //totalAltura / personas
    
}
/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */