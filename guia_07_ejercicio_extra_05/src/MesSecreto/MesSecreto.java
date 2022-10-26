/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */

package MesSecreto;

public class MesSecreto {
    
    private String[] mesDelAnio;
    private String mesSecreto;

    public MesSecreto() {
                
        mesDelAnio = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = mesDelAnio [4];
    }

    public MesSecreto(String[] mesdelAnio, String mesSecreto) {
        this.mesDelAnio = mesdelAnio;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesDelAnio() {
        return mesDelAnio;
    }

    public void setMesDelAnio(String[] mesDelAnio, int aleatorio) {
        this.mesDelAnio = mesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}

/*
Bruno Duca

public class Mes {
    private String [] meses = {"enero","febrero","marzo","abril","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String [] mesSecreto = Arrays.copyOf(meses, 12);

    public Mes() {
    }

    public Mes(String[] meses, String[] mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String[] getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String[] mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}

*/