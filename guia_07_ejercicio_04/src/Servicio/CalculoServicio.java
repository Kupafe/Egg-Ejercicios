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

package Servicio;

import Rectangulo.Rectangulo;
import java.util.Scanner;

public class CalculoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo ingresarDatos(){
        
        Rectangulo ret = new Rectangulo();
        
        System.out.print("Ingrese cuanto mide la BASE del Rectangulo: ");
        ret.setBase(leer.nextDouble());
        
        System.out.print("Ingrese cuanto mide la ALTURA del Rectangulo: ");
        ret.setAltura(leer.nextDouble());
        
        return ret;
    }
    
    //Método para calcular la superficie del rectángulo.
    public double superficie(Rectangulo ret){
        
        //Superficie = base * altura
        return ret.getBase() * ret.getAltura(); 
    }
    
    //Método para calcular el perímetro del rectángulo
    public double perimetro(Rectangulo ret){
        
        //Perímetro = (base + altura) * 2
        return (ret.getBase() + ret.getAltura()) * 2;  
    }
    
    /*
    Método que dibujará el rectángulo mediante asteriscos usando la base y la
    altura
    */
    public void dibujar(Rectangulo ret){
        
        System.out.println("DIBUJO EL RECTANGULO COMPLETO.");
        System.out.println("");
        
        for(int i = 0; i < ret.getAltura(); i++){
            
            for (int j = 0; j < ret.getBase(); j++){
                
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
    
     public void dibujoContorno (Rectangulo ret){
   
        System.out.println("DIBUJO EL RECTANGULO CONTORNO.");
        System.out.println("");
        
        for (int i = 1; i <= ret.getAltura(); i++) {
            
            for (int j = 1; j <= ret.getBase(); j++) {
                
                if (j > 1 && j < ret.getBase() && i > 1 && i < ret.getAltura()){
                    
                    System.out.print("  ");
                    
                } else {
                  
                    System.out.print("* ");
                }
            }
            
            System.out.println("");
        }
    }
}