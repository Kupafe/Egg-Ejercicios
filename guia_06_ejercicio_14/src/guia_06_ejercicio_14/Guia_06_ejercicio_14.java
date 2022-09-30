/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia_06_ejercicio_14;

import java.util.Scanner;

public class Guia_06_ejercicio_14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        double cant;
        int opcion;
        
        System.out.println("Ingrese cantidad de euros");
        cant = leer.nextDouble();
        
         do {
             
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("1. libras");
            System.out.println("2. pesos");
            System.out.println("3. yenes");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion)  {
                case 1:
                    System.out.println("libras " + (cant * 0.86));
                break;
               
                case 2:
                    System.out.println("pesos " + (cant * 1.28611));
                break;
                
                case 3:
                    System.out.println("yenes " + (cant * 129.852));
               break;
  
          }
        
     }while(opcion != 4);
    }
}

/*
Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        String moneda = leer.next();
        cambiar(euros,moneda);
        
    }
    public static void cambiar(double euros, String moneda){
        switch (moneda){
            case "libras":
                System.out.println("en libras es: "+(0.86*euros));
                break;
            case "dolar":
                System.out.println("en dolar es: "+(1.28611*euros));
                break;
            case "yenes":
                System.out.println("en yenes es; "+ (129.852*euros));
                break;
        }
    }

*/