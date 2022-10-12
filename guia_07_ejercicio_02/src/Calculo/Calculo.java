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

package Calculo;

import Circulo.Circunferencia;
import Servicio.CalculoServicio;

public class Calculo {
    
    public static void main(String[] args) {

        CalculoServicio cs = new CalculoServicio();
        Circunferencia c1 = cs.ingresarRadio();
        cs.area(c1);
        cs.perimetro(c1);
        
    }
    
}