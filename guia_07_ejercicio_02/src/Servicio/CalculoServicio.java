/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
 */

package Servicio;

import Circulo.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

public class CalculoServicio {
    
    Scanner leer = new Scanner(System.in);
    //double PI = 3.1419;
    
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia ingresarRadio(){
        
        Circunferencia circun = new Circunferencia();
        
        System.out.print("Ingrese el Radio del Circulo: ");
        circun.setRadio(leer.nextDouble());
        
        return circun;
    }
    
    //d) Método area(): para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
    public void area(Circunferencia circun){
        
        //double PI = 3.1419;
        
        //double area = PI * (circun.getRadio() * circun.getRadio());
        System.out.println("El AREA del CIRCULO es de: "+ (PI * circun.getRadio() * circun.getRadio()));
    }
    
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
    public void perimetro(Circunferencia circun){
        
        //double PI = 3.1419;
        //double valor = 2 * PI * Math.pow(circun.getRadio(), 2);
        System.out.println("El PERIMETRO del CIRCULO es de: "+ (2 * PI * circun.getRadio()));
    }
}

