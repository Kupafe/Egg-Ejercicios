/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package Servicio;

import CalculosBasicos.CalculosBasicos;
import Operacion.Operacion;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CalculosBasicosServicio {
    
    //Scanner leer = new Scanner(System.in).useDelimiter("\n"); // useDelimiter("\n") --> Me permite leer frases
    Scanner leer = new Scanner(System.in);
    
    private double resultado;
    
    /*
    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
    los atributos del objeto.
    */
    
    public Operacion crearOperacion(){
    
        Operacion oper = new Operacion();
        
        System.out.print("Ingrese el Primer Numero: ");
        oper.setNumero1(leer.nextDouble());
        
        System.out.print("Ingrese el Segundo Numero: ");
        oper.setNumero2(leer.nextDouble());
        
        return oper;
    }
    
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar(Operacion oper){
        
        return oper.getNumero1() + oper.getNumero2();        
    }
    
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(Operacion oper){
        
        return oper.getNumero1() - oper.getNumero2();        
    }
    
    /*
    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
    no, se hace la multiplicación y se devuelve el resultado al main
    */
    public double multiplicar(Operacion oper){
        
        return oper.getNumero1() * oper.getNumero2();        
    }
    
    /*
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    */
    public double dividir(Operacion oper){
        
        if(oper.getNumero1() > oper.getNumero2()){
            
            return oper.getNumero2() / oper.getNumero1();
        
        }else{
            
            return oper.getNumero1() / oper.getNumero2();        
        }
    }
}