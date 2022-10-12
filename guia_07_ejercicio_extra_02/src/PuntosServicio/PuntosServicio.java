/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */

package PuntosServicio;

import Puntos.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
   
    Puntos pun = new Puntos();
    
    /*
    Generar un objeto puntos usando un método crearPuntos() que le pide al
    usuario los dos números y los ingresa en los atributos del objeto.
    */
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese los datos del Punto 1.\n");
        
        System.out.print("X1: ");
        pun.setX1(leer.nextDouble());
        System.out.println("");
        System.out.print("Y1: ");
        pun.setY1(leer.nextDouble());
        
        System.out.println("\n"
                + "------------------------"
                + "\n");
        
        System.out.println("Ingrese los datos del Punto 2.\n");
        
        System.out.print("X2: ");
        pun.setX2(leer.nextDouble());
        System.out.println("");
        System.out.print("Y2: ");
        pun.setY2(leer.nextDouble());
       
        System.out.println("\n"
                + "------------------------"
                + "\n");
        
        System.out.println("Los datos de P1(X1,Y1) son:\n"
                + "P1: ("+pun.getX1()+", "+pun.getY1()+") y P2: ("+pun.getX2()+", "+pun.getY2()+").\n");
        
        return pun;
    }
    
    /*
    método calcular y devolver la distancia que existe entre los dos puntos
    que existen en la clase Puntos.
    */
    public double calcularDistancia(Puntos pun){
        
        //Formula --> d(P1, P2) = √(x2 - x1)² + (y2 - y1)²
        
        double x, y, distanciaResultado;
        
        x = pun.getX2() - pun.getX1();
        y = pun.getY2() - pun.getX2();
        
        distanciaResultado = Math.sqrt(x * x + y * y);
        
        return distanciaResultado;
    }
}
