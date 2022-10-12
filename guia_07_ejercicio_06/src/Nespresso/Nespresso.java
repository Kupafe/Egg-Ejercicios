/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
    • Constructor predeterminado o vacío
    • Constructor con la capacidad máxima y la cantidad actual
    • Métodos getters y setters.
    • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
      tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
      cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
      método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
      cuanto quedó la taza.
    • Método vaciarCafetera(): pone la cantidad de café actual en cero.
    • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
      recibe y se añade a la cafetera la cantidad de café indicada.
*/

package Nespresso;

import Cafetera.Cafetera;
import Servicio.CafeteraServicio;

public class Nespresso {

    public static void main(String[] args) {
        
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera caf = new Cafetera();
        
        //Cafetera caf = cs.llenarCafetera(); // Opcion del Switch
        
        int opc;
        boolean opcion = false;

        do{
            
            opc = cs.menu();
            
            switch(opc){
                
                case 1:
                    // 1 - LLENAR CAFETERA
                    cs.llenarCafetera(caf);
                    System.out.println("Capacidad Maxima Main: " +caf.getCapacidadMaxima());
                    System.out.println("Capacidad Actual Main: " +caf.getCapacidadActual());
                    break;
                    
                case 2:
                    // 2 - SELECCIONAR TAMAÑO TAZA
                    cs.seleccionarTamanoTaza(caf);
                    break;
                    
                case 3:
                    // 3 - VACIAR CAFETERA
                    cs.vaciarCafetera(caf);
                    break;
                    
                case 4:
                    // 4 - AGREGAR CAFE
                    cs.agregarCafe(caf);
                    break;
                    
                case 0:
                    //0 - SALIR
                    opcion = true;
                    break;
            }
                
        }while (opcion == false);
    }
}