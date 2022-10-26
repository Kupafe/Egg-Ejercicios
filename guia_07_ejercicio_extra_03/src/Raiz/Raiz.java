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

package Raiz;

import Raices.Raices;
import RaicesServicio.RaicesServicio;
import java.util.Scanner;

public class Raiz {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        RaicesServicio rs = new RaicesServicio();
        Raices rai = new Raices();
        
        String opc;
        boolean prueba;
        boolean opcion = false;
        
        boolean tiene2Raices;
        
        boolean tiene1Raiz;
        
        do{
        
            System.out.println("\nSOFTWARE PARA SACAR LAS RAICES DE TRES VALORES.\n");
            
            rai = rs.ingresarNumeros();
         
            if(rs.tieneRaiz(rai) == true){

                rs.obtenerRaiz(rai);
                
            }else if(rs.tieneRaices(rai) == true){
            
                rs.obtenerRaices(rai);
            
            }else{
                
                System.out.println("La raiz no tiene solución real. El discriminante es menor a 0.");
            }

            System.out.println("\nPARA SALIR DEL PROGRAMA PRESIONE S (SALIR).");
            System.out.print("PARA CONTINUAR PRESIONE CUALQUIER OTRA TECLA: ");
            opc = leer.next();
            opc = opc.toUpperCase();
            
            if(opc.equals("S")){
                
                opcion = true;
            }
            
        }while (opcion == false);
    
        System.out.println("\nFINALIZO LA EJECUCION DEL PROGRAMA.\n");
    }
}