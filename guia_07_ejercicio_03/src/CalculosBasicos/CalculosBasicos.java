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

package CalculosBasicos;

import Operacion.Operacion;
import Servicio.CalculosBasicosServicio;

public class CalculosBasicos {

    public static void main(String[] args) {
        
        CalculosBasicosServicio cbs = new CalculosBasicosServicio();
        Operacion oper1 = cbs.crearOperacion();
        
        System.out.println("");
        System.out.println("La SUMA de los numeros "+oper1.getNumero1()+" + "+oper1.getNumero2()+" da como resultado: "+cbs.sumar(oper1)+".");
        System.out.println("");
        System.out.println("La RESTA de los numeros "+oper1.getNumero1()+" - "+oper1.getNumero2()+" da como resultado: "+cbs.restar(oper1)+".");
        System.out.println("");
        System.out.println("La MULTIPLICACION de los numeros "+oper1.getNumero1()+" * "+oper1.getNumero2()+" da como resultado: "+cbs.multiplicar(oper1)+".");
        System.out.println("");
        if (oper1.getNumero1() > oper1.getNumero2()){
                
            System.out.println("La DIVISION de los numeros "+oper1.getNumero1()+" / "+oper1.getNumero2()+" da como resultado: "+cbs.dividir(oper1)+".");
                
        }else{
            
            System.out.println("La DIVISION de los numeros "+oper1.getNumero2()+" / "+oper1.getNumero1()+" da como resultado: "+cbs.dividir(oper1)+".");
        }
    }   
}