/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package Calculo;

import Rectangulo.Rectangulo;
import Servicio.CalculoServicio;

public class Calculo {

    public static void main(String[] args) {
        
        CalculoServicio cs = new CalculoServicio();
        Rectangulo rect1 = cs.ingresarDatos();
        
        System.out.println("");
        System.out.println("Teniendo un RECTANGULO con una BASE de "+rect1.getBase()+" y una ALTURA de "+rect1.getAltura()+" nos da una SUPERFICIE de "+cs.superficie(rect1)+" y un PERIMETRO de "+cs.perimetro(rect1));
        System.out.println("");
        cs.dibujar(rect1);
        System.out.println("");
        cs.dibujoContorno(rect1);
        System.out.println("");
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");  
    }   
}