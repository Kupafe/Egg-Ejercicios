/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:

    • Constructores, tanto el vacío como el parametrizado.
    • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
      la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
      Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
      palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
      valor que ingresó el usuario y encontradas en 0.
    • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
      buscar como se usa el vector.length.
    • Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
      letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
      cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
      devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
      busque una letra que no esté, se le restará uno a sus oportunidades.
    • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    • Método juego(): el método juego se encargará de llamar todos los métodos
      previamente mencionados e informará cuando el usuario descubra toda la palabra o
      se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

    Ingrese una letra:
    a
    Longitud de la palabra: 6
    Mensaje: La letra pertenece a la palabra
    Número de letras (encontradas, faltantes): (3,4)
    Número de oportunidades restantes: 4
    ----------------------------------------------
    Ingrese una letra:
    z
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (3,4)
    Número de oportunidades restantes: 3
    ---------------------------------------------
    Ingrese una letra:
    b
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (4,3)
    Número de oportunidades restantes: 2
    ----------------------------------------------
    Ingrese una letra:
    u
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (4,3)
    Número de oportunidades restantes: 1
    ----------------------------------------------
    Ingrese una letra:
    q
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Mensaje: Lo sentimos, no hay más oportunidades
 */

package Ahorcado;

//Crear una clase Ahorcado (como el juego).

import java.util.Locale;
import java.util.Scanner;

//Crear una clase Ahorcado (como el juego).


public class Ahorcado {
    
    /*
    Atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
    jugadas máximas que puede realizar el usuario.
    */
    private String []palabraSecreta; // palabra
    private String []palabraAuxiliar; // palabraAux - Es el vector que va a contener los diones del ahorcado 
    private int cantidadEncontradas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta, String[] palabraAuxiliar, int cantidadEncontradas, int cantidadJugadas) {
        this.palabraSecreta = palabraSecreta;
        this.palabraAuxiliar = palabraAuxiliar;
        this.cantidadEncontradas = cantidadEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public String[] getPalabraAuxiliar() {
        return palabraAuxiliar;
    }

    public void setPalabraAuxiliar(String[] palabraAuxiliar) {
        this.palabraAuxiliar = palabraAuxiliar;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.
    */
    public void crearJuego(){
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        // Ingreso la Palabra Secreta
        System.out.print("INGRESE LA PALABRA SECRETA: ");
        String frase = leer.next().toUpperCase();
        
        //Ingreso la cantidad de jugadas maximas
        System.out.print("INGRESE LA CANTIDAD DE JUGADAS PERMITIDAS: ");
        this.cantidadJugadas = leer.nextInt();
        
        // Dice que la cantidad de letras encontradas deben de comenzar en cero
        this.cantidadEncontradas = 0;
        
        // Defino la longitud de los dos vectores
        this.palabraSecreta = new String[frase.length()]; // Le defino el tamaño a la palabra secreta
        this.palabraAuxiliar = new String[frase.length()];
        
        for (int i = 0; i < frase.length(); i++){
            
            this.palabraSecreta[i] = frase.substring(i, i + 1); // Divido la frase en letras y las voy guardando en el vector de la palabra secreta
            this.palabraAuxiliar[i] = "_"; // Lleno el vector auxiliar con diones bajos para simular el ahorcado
        }
    }
    
    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
    */
    public void longitud(){
        
        System.out.println("LA LONGITUD DE LA PALABRA ES DE "+this.palabraSecreta.length+" CARACTERES.");
    }
    
    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public boolean buscarLetra(String letra){
        
        int contador = 0;
        boolean bandera = false;
        
        for (int i = 0; i < this.palabraSecreta.length; i++){
            
            if (this.palabraSecreta[i].equals(letra)){
                
                contador++;
                bandera = true;
            }
        }

        if (contador == 0){

            System.out.printf("LA LETRA %s NO SE ENCUENTRA EN LA PALABRA SECRETA \n",letra);

        }else{

            System.out.printf("LA LETRA %s SI SE ENCUENTRA EN LA PALABRA SECRETA %d VECES \n",letra, contador); // printf --> https://www.baeldung.com/java-printstream-printf
        }
        
        return bandera;
    }
    
    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    public boolean encontradas(String letra){
        
        boolean bandera = false;
        
        for (int i = 0; i < this.palabraSecreta.length; i++){
            
            if (this.palabraSecreta[i].equals(letra)){
                
                if (this.palabraAuxiliar[i].equals("_")){
                    
                    this.palabraAuxiliar[i] = letra; // ver 
                    this.cantidadEncontradas++;
                }
                
                bandera = true;
            }
        }
        
        if (!bandera){
            
            this.cantidadJugadas--;
        }
        
        return buscarLetra(letra);
        
    }
    
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public void intentos(){
        
        System.out.printf("LE QUEDAN %s INTENTOS \n",this.cantidadJugadas);
    }    
    
    public void mostrarAhorcado(){
        
        for (int i = 0; i < this.palabraAuxiliar.length; i++) {
            
            System.out.print(this.palabraAuxiliar[i]+ " ");
        }
        
        System.out.println("");
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
    */
    
    public void juego(){
 
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        String letra, opc;
        boolean opcion = false;
                
        do{
            
            crearJuego();
        
            do{
            
                mostrarAhorcado();
            
                intentos();
            
                longitud();
            
                System.out.println("INGRESE LETRA A BUSCAR EN LA PALABRA SECRETA: ");
                letra = leer.next().toUpperCase();
            
                encontradas(letra);
            
            }while (this.cantidadJugadas != 0 && this.cantidadEncontradas != this.palabraSecreta.length);
    
            if (this.cantidadEncontradas == this.palabraSecreta.length){
            
                System.out.println("USTED SI DESCUBRIO LA PALABRA SECRETA. :)");
                mostrarAhorcado();
            
            }else{
            
                System.out.println("USTED NO DESCUBRIO LA PALABRA SECRETA. :(");
            }
            
            System.out.println("\nPARA SALIR DEL PROGRAMA PRESIONE S (SALIR).");
            System.out.print("PARA VOLVER A COMENZAR EL JUEGO PRESIONE CUALQUIER OTRA TECLA: ");
            opc = leer.next().toUpperCase();
            
            if(opc.equals("S")){
                
                opcion = true;
            }
            
        }while (opcion == false);
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.\n");
    }
}