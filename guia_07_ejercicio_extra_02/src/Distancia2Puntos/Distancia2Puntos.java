/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */

package Distancia2Puntos;

import Puntos.Puntos;
import PuntosServicio.PuntosServicio;
import java.util.Scanner;

public class Distancia2Puntos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        PuntosServicio ps = new PuntosServicio();

        /*
        Generar un objeto puntos usando un método crearPuntos() que le pide al
        usuario los dos números y los ingresa en los atributos del objeto.
        */
        Puntos pun = new Puntos();
        
        String opc;
        double distancia;
        boolean opcion = false;
        
        System.out.println("\nPROGRAMA PARA SABER LA DISTANCIA ENTRE DOS PUNTOS.\n");
        
        do{

            pun = ps.crearPuntos();
            distancia = ps.calcularDistancia(pun);
            
            System.out.println("\nLa distancia que hay entre el P1 y el P2 es de: "+distancia+" centimetros.\n");
        
            System.out.println("PARA SALIR DEL PROGRAMA PRESIONE S (SALIR).");
            System.out.print("PARA CONTINUAR PRESIONE CUALQUIER OTRA TECLA: ");
            opc = leer.next();
            opc = opc.toUpperCase();
            
            if(opc.equals("S")){
                
                opcion = true;
            }
            
        }while (opcion == false);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.\n");
    }
}
