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

package Circulo;

public class Circunferencia {
    
    // Atributo
    
    private Double radio;

    // a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
       
    }
    
    //b) Métodos get y set para el atributo radio de la clase Circunferencia.

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}