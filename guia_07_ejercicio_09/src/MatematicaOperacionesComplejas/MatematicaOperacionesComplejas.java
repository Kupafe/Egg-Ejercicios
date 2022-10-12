/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package MatematicaOperacionesComplejas;

import Matematica.Matematica;
import MatematicaServicio.MatematicaServicio;
import java.util.Scanner;

public class MatematicaOperacionesComplejas {

    /*
    En el main se creará el objeto y se usará el Math.random para generar los
    dos números y se guardaran en el objeto con su respectivos set.
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Matematica mat = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();

        char opcion;
        double mayor, potencia, raiz;
        boolean salir = false;
        
        do{
            System.out.println("");
            mat.setNumero1((double)(Math.random() * 1000));
            mat.setNumero2((double)(Math.random() * 1000));
            System.out.println("Numero 1: "+mat.getNumero1());
            System.out.println("Numero 2: "+mat.getNumero2());
            
            mayor = ms.devolverMayor(mat);
            System.out.println("");
            
            System.out.println("El numero mayor entre los numeros "+mat.getNumero1()+" y "+mat.getNumero2()+" es el numero: "+mayor+".");
        
            
            potencia = ms.calcularPotencia(mat);
            System.out.println(potencia+".");
            System.out.println("");
            raiz = ms.calcularRaiz(mat);
            System.out.println(raiz+".");
            System.out.println("");
            
            System.out.println("Quiere salir del sistema. S (Si). Si no quiere salir presione cualquier otro boton.");
            System.out.print("Elija opcion: ");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'S' || opcion == 's'){
                
                salir = true;
            }

        }while (salir == false);
                
    }
    
}
