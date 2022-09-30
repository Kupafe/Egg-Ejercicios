/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */

package guia_06_ejercicio_extra_12;

public class Guia_06_ejercicio_extra_12 {

    public static void main(String[] args) {
        
       String vectorA[] = new String[1000];

        for(int i = 0; i < 1000; i++){
        
            vectorA[i] = Integer.toString(i).replace("3", "E");
        }

        for(int i = 0; i < 1000; i++){
        
            if (vectorA[i].length()==1) {
            
                System.out.println("00"+vectorA[i]);
            
            }else if (vectorA[i].length()==2) {
                
                System.out.println("0"+vectorA[i]);
            
            }else{
            
                System.out.println(vectorA[i]);
            }
            
        }
    }
}
