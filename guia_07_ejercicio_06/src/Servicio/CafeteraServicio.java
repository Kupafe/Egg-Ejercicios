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

package Servicio;

import Cafetera.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    int opc;
    boolean opcion = false;
    
    public int menu(){

        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        
        do{
           
            System.out.println("BIENVENIDO AL MENU CAFETERA.");
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("");
            System.out.println("QUE DESEA HACER: ");
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("1 - LLENAR LA CAFETERA. 2 LITROS.");
            System.out.println("");
            System.out.println("2 - SERVIR TAZA.");       
            System.out.println("");
            System.out.println("3 - VACIAR CAFETERA.");
            System.out.println("");
            System.out.println("4 - AGREGAR CAFE.");
            System.out.println("");
            System.out.println("0 - SALIR.");
            System.out.println("");
            System.out.print("INGRESE OPCION: ");
            opc = leer.nextInt();
            
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            
            if(opc >= 0 && opc <= 5){
                
                opcion = true;
            }
        
        }while (opcion == false);
        
        return opc;
        
    }
    
    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    
    public Cafetera llenarCafetera(Cafetera caf){
        
        caf.setCapacidadMaxima(2000);
        caf.setCapacidadActual(2000);
        ///System.out.println("caf.setCapacidadMaxima(2000): "+caf.getCapacidadMaxima());
        
        return caf;
    }
   
    // Menu Seleccion de Taza a llenar.
    public Cafetera seleccionarTamanoTaza(Cafetera caf){

        do{
            
            System.out.println("MENU DE SELECCION DE TAZA.");
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("1 - TAZA 50 MILILITROS.");
            System.out.println("");
            System.out.println("2 - TAZA 100 MILILITROS.");
            System.out.println("");
            System.out.println("3 - TAZA 250 MILILITROS.");
            System.out.println("");
            System.out.println("4 - TAZA 500 MILILITROS.");
            System.out.println("");
            System.out.println("0 - VOLVER AL MENU ANTERIOR.");
            System.out.println("");
            System.out.print("INGRESE OPCION: ");
            opc = leer.nextInt();
            
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            
            if(opc >= 0 && opc <= 5){
                
                switch(opc){
                
                    case 1:
                        servirTaza(caf, 50);
                        break;
                        
                    case 2:
                        servirTaza(caf, 100);
                        break;
                        
                    case 3:
                        servirTaza(caf, 250);
                        break;
                        
                    case 4:
                        servirTaza(caf, 500);
                        break;
                }
                
                opcion = true;
            }
        
        }while (opcion == false);
        
        return caf;
    }
    
    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    */
    public Cafetera servirTaza(Cafetera caf, int tamano){
        
        caf.setCapacidadActual((int) (caf.getCapacidadActual() - tamano));
        
        System.out.println("Le restan "+caf.getCapacidadActual()+" Mililitros a la cafetera para utilizar.");
        
        if (tamano > caf.getCapacidadActual()){
            
            System.out.println("En la cafetera quedan "+caf.getCapacidadActual()+" mililitros de cafe.");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("1 - Servir lo que resta.");
            System.out.println("2 - Preparar mas cafe.");
            System.out.println("----------------------");
            System.out.print("Elija opcion: ");
            opc = leer.nextInt();
            
            switch(opc){
                
                case 1:
                    // Servir el resto del cafe
                    System.out.println("Se le sirvieron "+caf.getCapacidadActual()+" mililitros de cafe en la taza de "+tamano+" mililitros.");
                    caf.setCapacidadActual((int) (caf.getCapacidadActual() - caf.getCapacidadActual()));
                   
                    System.out.println("LA CAFETERA SE QUEDO SIN CAFE.");

                    break;
                    
                case 2:
                    /*
                    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
                    recibe y se añade a la cafetera la cantidad de café indicada.
                    */
                    agregarCafe(caf);
                    break;
            }
        }
        
        return caf;
    }
    
    // Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public Cafetera vaciarCafetera(Cafetera caf){
        
        System.out.println("VACIAR CAFETERA.");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        caf.setCapacidadActual((int) (caf.getCapacidadActual() - caf.getCapacidadActual()));
        
        System.out.println("Se vacio la Cafetera. El contenido de la misma es de: "+caf.getCapacidadActual());
        System.out.println("");
        return caf;
    }
    
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
      recibe y se añade a la cafetera la cantidad de café indicada.
    */
    public Cafetera agregarCafe(Cafetera caf){
        
        int tamano;
        int agua;
        
        System.out.println("AGREGAR CAFE.");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        
        System.out.println("¿Cuanto agua para hacer cafe quiere agregarle a la cafetera?. No puede superar las 2000 Mililitros.");
        tamano = leer.nextInt();
                
        agua = ((int) (caf.getCapacidadActual() + tamano));
            
        if (agua < caf.getCapacidadMaxima()){
                
            caf.setCapacidadActual((int) (caf.getCapacidadActual() + agua));
            System.out.println("La cafetra ahora tiene "+caf.getCapacidadActual()+" mililitros de cafe.");
            
        }else{
     
            System.out.println("La cantidad de cafe que le quiere agregar va a hacer rebalsar la cafetera.");
            System.out.println("No se le va a agregar lo pedido.");
        }

        return caf;
    }
}