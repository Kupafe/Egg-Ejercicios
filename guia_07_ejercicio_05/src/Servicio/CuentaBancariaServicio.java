/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

package Servicio;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    
    CuentaBancaria cb = new CuentaBancaria();
    
    // c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public CuentaBancaria ingresarDatosUsuario(){
       
        long dniPersona;
        int numeroCuentaPersona, saldo;
        boolean dp = false;
        boolean ncp = false;
        
        do{
       
            System.out.println("Ingrese un Numero de DNI para comenzar.");
            System.out.println("Este debe de ser de OCHO CIFRAS");
            System.out.print("Ingrese un Numero de DNI: ");
            dniPersona = leer.nextLong();
            
            if (dniPersona >= 10000000 && dniPersona <= 99999999){
                
                dp = true;
            }
            
        }while (dp == false);
            
        cb.setDni(dniPersona);
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");
        
        do{
            
            System.out.println("Ingrese su Numero de Cuenta para comenzar.");
            System.out.println("El mismo debe de ser de CINCO CIFRAS.");
            System.out.print("Ingrese numero de cuenta: ");
            numeroCuentaPersona = leer.nextInt();

            if (numeroCuentaPersona >= 10000 && numeroCuentaPersona <= 99999){
            
                ncp = true;
            }
    
        }while (ncp == false);
            
        cb.setNumeroCuenta(numeroCuentaPersona);
       
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");
        
        do {
             System.out.println("Ingrese su Saldo para comenzar.");
             System.out.println("El numero o la cifra debe de ser un NUMERO POSITIVO.");
             System.out.print("Ingrese su Saldo: $");
             saldo = leer.nextInt();
           
        } while (saldo < 0);
        
        cb.setSaldoActual(saldo);
        
        System.out.println("");
        
        return cb;
    }
    
    public int menu(CuentaBancaria cb){
        
        int opc;
        boolean opcion = false;
        
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        
        do{
            
            System.out.println("BIENVENIDO AL MENU "+cb.getDni());
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("");
            System.out.println("QUE DESEA HACER: ");
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("1 - INGRESAR DINERO.");
            System.out.println("");
            System.out.println("2 - RETIRAR DINERO.");       
            System.out.println("");
            System.out.println("3 - EXTRACCION RAPIDA.");
            System.out.println("");
            System.out.println("4 - CONSULTAR SALDO.");
            System.out.println("");
            System.out.println("5 - CONSULTAR DATOS.");
            System.out.println("");
            System.out.println("0 - SALIR.");
            System.out.println("");
            System.out.print("INGRESE OPCION: ");
            opc = leer.nextInt();
            
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("");
            
            if(opc >= 0 && opc <= 5){
                
                opcion = true;
            }
        
        }while (opcion == false);
        
        return opc;
    }
    
    // 1 - INGRESAR DINERO
    
    public CuentaBancaria ingresarDinero(CuentaBancaria cb){
        
        System.out.println("INGRESAR DINERO.");
        System.out.println("");
        System.out.println("¿Cuanto Dinero desea Ingresar a su cuenta?");
        System.out.println("");
        System.out.println("En su cuenta al momento tiene $"+cb.getSaldoActual()+" Pesos.");
        System.out.println("");
        System.out.print("Ingrese el monto: $");
        int monto = leer.nextInt();
        cb.setSaldoActual(cb.getSaldoActual() + monto);
        System.out.println("Con el monto recien ingresado al momento tiene $"+cb.getSaldoActual()+" Pesos.");
        
        return cb;
    }
    
    //2 - RETIRAR DINERO
    public CuentaBancaria retirarDinero(CuentaBancaria cb){
        
        System.out.println("RETIRAR DINERO.");
        System.out.println("");
        System.out.println("¿Cuanto Dinero desea Retirar de su cuenta?");
        System.out.println("");
        System.out.println("En su cuenta al momento tiene $"+cb.getSaldoActual()+" Pesos.");
        System.out.println("");
        System.out.print("Ingrese el monto: $");
        int monto = leer.nextInt();
        
        if (monto > cb.getSaldoActual()){
            System.out.println("El monto a retirar es mayor al que tiene en la cuenta.");
            System.out.println("Se le va a descontar rl monto que tiene en la cuenta.");
            cb.setSaldoActual(cb.getSaldoActual() - cb.getSaldoActual());
            System.out.println("En la cuenta le quedaron $"+cb.getSaldoActual()+" Pesos.");
            
        }else{
            cb.setSaldoActual(cb.getSaldoActual() - monto);
            System.out.println("Con el monto recien retirado al momento tiene $"+cb.getSaldoActual()+" Pesos.");
        }
 
        return cb;
    }
    
    //3 - EXTRACCION RAPIDA
    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    */
    public CuentaBancaria extraccionRapida(CuentaBancaria cb){
        
        System.out.println("EXTRACCION RAPIDA.");
        System.out.println("");
        System.out.println("En su cuenta al momento tiene $"+cb.getSaldoActual()+" Pesos.");
       
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        
        System.out.println("Se van a descontar de su cuenta el total de $"+(20 * cb.getSaldoActual()) / 100);
        System.out.println("-----------------");
        System.out.println("Con el retiro del 20% de su cuenta su Saldo Actual es de $"+(cb.getSaldoActual() - ((20 * cb.getSaldoActual()) / 100)));
 
        return cb;
    }
    
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cb){
        
        System.out.println("Su Saldo es de $"+cb.getSaldoActual()+" Pesos.");
    }
    
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaBancaria cb){
        
        System.out.println(cb.toString());
    }
    
    
      // System.out.println(l1.toString());
}

/*
System.out.println("-----------------");
            System.out.println("Ingrese su opcion \n"
                    + "1. ingresar saldo\n"
                    + "2. retirar saldo\n"
                    + "3. extracción rápida\n"
                    + "4. consultar saldo\n"
                    + "5. datos de la cuenta\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");

*/