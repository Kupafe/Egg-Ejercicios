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

package MatematicaServicio;

import Matematica.Matematica;


// Deberá además implementar los siguientes métodos:

public class MatematicaServicio {
    
    Matematica mat = new Matematica();
    
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
     public double devolverMayor(Matematica mat){
         
        if (mat.getNumero1() > mat.getNumero2()){
            
            return mat.getNumero1();
            
        }else{
            
            return mat.getNumero2();
        }
    }

     /*
     b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        al menor número. Previamente se deben redondear ambos valores.
     */
     
     public double calcularPotencia(Matematica mat){
         
         double mayor, resultado;
         long num1, num2;
         
         num1 = Math.round(mat.getNumero1());
         num2 = Math.round(mat.getNumero2());
         
         mayor = devolverMayor(mat);
         
         if (mayor == mat.getNumero1()){
             
             System.out.print("La potencia del numero "+mat.getNumero1()+" elevado a la "+mat.getNumero2()+" da como resultado el numero: ");
             resultado =  Math.pow(num1, num2);
             
         }else{
             System.out.print("La potencia del numero "+mat.getNumero2()+" elevado a la "+mat.getNumero1()+" da como resultado el numero: ");
             resultado = Math.pow(num2, num1);
         }
         
         return Math.round(resultado);
    }
   
    /*
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
       Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
     
     public double calcularRaiz(Matematica mat){
         
         
         double mayor, raizCuadrada;
         long num1, num2;
         double num1ABS, num2ABS;
         
         num1ABS = Math.abs(mat.getNumero1());
         num2ABS = Math.abs(mat.getNumero2());

         mayor = devolverMayor(mat);
         
         if (mayor == mat.getNumero1()){
             
             raizCuadrada = Math.sqrt(mat.getNumero2());
             
             System.out.print("La Raiz Cuadrada del menor de los dos numeros es: ");
             
         }else{
             
             raizCuadrada = Math.sqrt(mat.getNumero1());
             System.out.print("La Raiz Cuadrada del menor de los dos numeros es: ");

         }

         return raizCuadrada;
     }
}
