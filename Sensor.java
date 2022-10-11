public class Sensor {

    public static Sensor[] sensores = new Sensor[8];
    public static int tamaño = 8;
    public static int posAñadir = 0;
    private String tipo;
    private double valor;

    /**
     * * Constructor vacío
     * Solo añade sensor vacío a la lista de sensores
     */
    public Sensor() {
        int index = Sensor.posAñadir;
        Sensor.sensores[index] = this;
        Sensor.posAñadir++;
    }

    /**
     * * Constructor con parámetros
     * Asigna los valores y añade sensor a la lista
     * 
     * @param t
     * @param v
     */
    public Sensor(String t, double v) {
        this.tipo = t;
        this.valor = v;

        int index = Sensor.posAñadir;
        Sensor.sensores[index] = this;
        Sensor.posAñadir++;
    }

    /**
     * * SETTERS Y GETTERS
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    /**
     * * Información del sensor
     * 
     * @return String
     */
    public String getInfo() {
        return "Sensor de tipo " + this.tipo + " con valor " + this.valor;
    }

    /**
     * * Información concatenada de todos los sensores
     * 
     * @return String
     */
    public static String toStringSensores() {
        String str = "";
        boolean existe = false;
        for (int i = 0; i < Sensor.posAñadir; i++) {
            existe = true;
            str += Sensor.sensores[i].getInfo() + "\n";
        }
        if (existe) {
            return str;
        } else {
            return "No hay sensores para mostrar";
        }
    }

    /**
     * * Información de los sensores tipo temperatura
     * 
     * @return String
     */
    public static String toStringTemperatura() {
        boolean existe = false;
        String str = "";
        for (int i = 0; i < Sensor.posAñadir; i++) {
            if (Sensor.sensores[i].tipo.toLowerCase().equals("temperatura")) {
                existe = true;
                str += Sensor.sensores[i].getInfo() + "\n";
            }
        }
        if (existe) {
            return str;
        } else {
            return "No hay sensores para mostrar";
        }
    }

    /**
     * * Información de los sensores tipo temperatura ordenados por valor
     * 
     * @return String
     */
    public static String toStringTemperaturaOrdenados() {
        // Crea array auxiliar y lo ordena
        Sensor[] sensoresOrdenados = Sensor.sensores;
        Sensor temp;
        for (int i = Sensor.posAñadir - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sensoresOrdenados[j].valor > sensoresOrdenados[j + 1].valor) {
                    temp = sensoresOrdenados[j];
                    sensoresOrdenados[j] = sensoresOrdenados[j + 1];
                    sensoresOrdenados[j + 1] = temp;
                }
            }
        }

        // Imprime info de los que tienen tipo temperatura
        String str = "";
        boolean existe = false;
        for (int i = 0; i < Sensor.posAñadir; i++) {
            if (Sensor.sensores[i].tipo.toLowerCase().equals("temperatura")) {
                existe = true;
                str += Sensor.sensores[i].getInfo() + "\n";
            }
        }
        if (existe) {
            return str;
        } else {
            return "No hay sensores para mostrar";
        }
    }

    /**
     * * Cantidad de sensores totales
     * 
     * @return int
     */
    public static int cantidadSensores() {
        return Sensor.posAñadir;
    }
}
