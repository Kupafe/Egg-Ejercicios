/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package guia_06_ejercicio_extra_04;

import java.util.Scanner;

public class Guia_06_ejercicio_extra_04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        do{
                           
            System.out.println("Ingrese un numero del 1 al 10.");
            System.out.print("Para salir, ingrese el numero 0: ");
            num = leer.nextInt();
            
            if (num >= 0 && num < 11){
                
                switch(num){
                
                    case 1:
                        System.out.println("El numero ingresado es 1 y en Numero Romano nos quedaria I.");
                        break;
                        
                    case 2:
                        System.out.println("El numero ingresado es 2 y en Numero Romano nos quedaria II.");
                        break;
                       
                    case 3:
                        System.out.println("El numero ingresado es 3 y en Numero Romano nos quedaria III.");
                        break;
                        
                    case 4:
                        System.out.println("El numero ingresado es 4 y en Numero Romano nos quedaria IV.");
                        break;
                    
                    case 5:
                        System.out.println("El numero ingresado es 5 y en Numero Romano nos quedaria V.");
                        break;
                    
                    case 6:
                        System.out.println("El numero ingresado es 6 y en Numero Romano nos quedaria VI.");
                        break;
                    
                    case 7:
                        System.out.println("El numero ingresado es 7 y en Numero Romano nos quedaria VII.");
                        break;
                    
                    case 8:
                        System.out.println("El numero ingresado es 8 y en Numero Romano nos quedaria VIII.");
                        break;
                    
                    case 9:
                        System.out.println("El numero ingresado es 9 y en Numero Romano nos quedaria IX.");
                        break;
                    
                    case 10:
                        System.out.println("El numero ingresado es 10 y en Numero Romano nos quedaria X.");
                        break;
                }
                
                }else{
                
                    System.out.println("Numero mal ingresado.");
            
            }

        }while (num != 0);
    
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.");
    }
}
