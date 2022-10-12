/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá ́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */

package Cantante;

import Cancion.Cancion;
import CancionServicio.CancionServicio;
import java.util.Scanner;

public class Cantante {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        CancionServicio cs = new CancionServicio();
        Cancion can = new Cancion();
        
        String opc;
        boolean opcion = false;
        
        do{
            
            can = cs.crearCancion();
            cs.mostrarCancion(can);
        
            System.out.println("PARA SALIR DEL PROGRAMA PRESIONE S (SALIR).");
            System.out.print("PARA CONTINUAR PRESIONE CUALQUIER OTRA TECLA: ");
            opc = leer.next();
            opc = opc.toUpperCase();
            
            if(opc.equals("S")){
                
                opcion = true;
            }
            
        }while (opcion == false);
        
        System.out.println("\nFINALIZO LA EJECUCION DEL PROGRAMA.");
        System.out.println("");
    }
    
}
