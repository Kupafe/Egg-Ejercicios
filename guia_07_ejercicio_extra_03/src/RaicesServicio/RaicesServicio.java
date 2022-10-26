/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
    
    • Método getDiscriminante(): devuelve el valor del discriminante (double). El
      discriminante tiene la siguiente formula: (b^2)-4*a*c
    • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
      que esto ocurra, el discriminante debe ser mayor o igual que 0.
    • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
      que esto ocurra, el discriminante debe ser igual que 0.
    • Método obtenerRaices(): llama a tieneRaíces() y si devolvió ́ true, imprime las 2 posibles
      soluciones.
    • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió ́ true imprime una única raíz. Es
      en el caso en que se tenga una única solución posible.
    • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
      pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
      obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
      de no existir solución, se mostrará un mensaje.
    
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */

package RaicesServicio;

import Raices.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Raices rai = new Raices();
    
    public Raices ingresarNumeros(){ // -900 -500 600vTRaices =true <---> TRaiz = False
        
        System.out.print("Ingrese un numero para el Valor A: ");
        rai.setValorA(leer.nextDouble());
        
        System.out.print("\nIngrese un numero para el Valor B: ");
        rai.setValorB(leer.nextDouble());
        
        System.out.print("\nIngrese un numero para el Valor C: ");
        rai.setValorC(leer.nextDouble());
        
        return rai;
    }
    
    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices rai){
        
        double discriminante;
        
        // Formula Discriminante --> D = (b^2)-4*a*c
        
        return discriminante = (Math.pow(rai.getValorB(),2) - 4 * rai.getValorA() * rai.getValorC() );
    }
    
    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices(Raices rai){
        
        return getDiscriminante(rai) >= 0;
    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(Raices rai){
        
        return getDiscriminante(rai) == 0;
    }
    
    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió ́ true, imprime las 2 posibles
    soluciones.
    */
    public void obtenerRaices(Raices rai){

        if (tieneRaices(rai) == true){
            
            double raizX1 = (double) (-rai.getValorB() + Math.sqrt(getDiscriminante(rai))) / 2 * rai.getValorA();
            double raizX2 = (double) (-rai.getValorB() - Math.sqrt(getDiscriminante(rai))) / 2 * rai.getValorA();
            
            System.out.println("Raiz X1: "+raizX1+" y Raiz X2: "+raizX2);
        }
    }

    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió ́ true imprime una única raíz. Es
    en el caso en que se tenga una única solución posible.
    */
    
    public void obtenerRaiz(Raices rai){
    
        if (tieneRaiz(rai) == true){
            
            System.out.println("La raiz es: " + (double) -rai.getValorB() / 2 * rai.getValorA());
        }
    }
}


