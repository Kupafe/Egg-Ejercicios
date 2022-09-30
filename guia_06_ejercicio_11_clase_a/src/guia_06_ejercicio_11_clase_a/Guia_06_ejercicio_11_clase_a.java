package guia_06_ejercicio_11_clase_a;

import java.util.Scanner;

 public class Guia_06_ejercicio_11_clase_a {

    public  static  void  main ( String [] args ) {
        
        Scanner  leer = new Scanner(System.in);
        System.out.print( "Ingrese un numero para operar:" ); int  num1 = leer.nextInt();
        System.out.print( "Ingrese otro numero para operar:" ); int  num2 = leer.nextInt();
        int  opcion1 ; char  opcion2 ;
        do{   
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Opcion: "); opcion1 = leer.nextInt();
            switch(opcion1){
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + num1*num2);
                    break;
                case 4:
                    System.out.println("Resultado: " + num1/num2);
                    break;
                case 5:
                    System.out.print("¿Desea salir? S/N ");
                    opcion2 = leer.next().charAt(0); //Leo la opción, que la deposita en char opc2                  
                    while(opcion2!='s' && opcion2!='S' && opcion2!='n' && opcion2!='N'){ //Si la opción que ingresó, es distinta
                        System.out.println("Opción inválida. Reingrese.");   //de s, S, n o N, entonces me pide de nuevo
                        System.out.print("¿Desea salir? S/N ");              //hasta que ingrese una de esas 4.
                        opcion2 = leer.next().charAt(0);
                    }
                    if (opcion2 == 'S' || opcion2 == 's'){//Si desea salir, termina el switch y sale del do-while.
                        break;
                    }else { //Si no desea salir (hasta acá, salió del while anterior únicamente con S o N. En este caso, N.)
                        opcion1 = 0; //fuerza a que la opción elegida al principio, sea 0 en vez de 5. Por lo que...
                        break;//... con el break, termina el switch, pero vuelve a mostrar el menú.
                    }                    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while(opcion1 != 5);
        System.out.println("Gracias por usar nuestro programa.");
    }    
}