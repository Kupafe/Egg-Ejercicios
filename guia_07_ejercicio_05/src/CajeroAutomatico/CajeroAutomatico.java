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

package CajeroAutomatico;

import CuentaBancaria.CuentaBancaria;
import Servicio.CuentaBancariaServicio;


public class CajeroAutomatico {

    public static void main(String[] args) {
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        int opc;
        boolean opcion = false;
        
        
        CuentaBancaria cb1 = cbs.ingresarDatosUsuario();
        
        do{
            
            opc = cbs.menu(cb1);
            
            switch (opc){
                
                case 1:
                    //1 - INGRESAR DINERO.
                    cbs.ingresarDinero(cb1);
                    break;
                    
                case 2:
                    //2 - RETIRAR DINERO.
                    cbs.retirarDinero(cb1);
                    break;
                    
                case 3:
                    //3 - EXTRACCION RAPIDA.
                    cbs.extraccionRapida(cb1);
                    break;
                    
                case 4:
                    //4 - CONSULTAR SALDO.
                    cbs.consultarSaldo(cb1);
                    break;
                    
                case 5:
                    //5 - CONSULTAR DATOS
                    cbs.consultarDatos(cb1);
                    break;
                    
                case 0:
                    //0 - SALIR
                    opcion = true;
                    break;
            }
            
        }while (opcion == false);
    
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
}