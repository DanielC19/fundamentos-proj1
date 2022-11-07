public class Vehiculo {
    // Estos son los atributos de nuestra clase de clase Vehiculo
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAñadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    /**
     * * Constructores
     */
    public Vehiculo() {}

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;

        int index = Vehiculo.posAñadir;
        Vehiculo.vehiculos[index] = this;
        Vehiculo.posAñadir++;
    }

    public Vehiculo(int mo, String ma, double va) {
        this(mo, ma, va, "verde");
    }

    /**
     * * Imprime la info de un solo vehículo
     * 
     * @return String
     */
    public String getInfo() {
        return "Vehiculo de marca: " + this.marca + ", con modelo: " + this.modelo + ", color: " + this.color
                + " y con valor: " + this.valorComercial;
    }

    /**
     * * Concatena la info de todos los vehículos verdes
     * 
     * @return String
     */
    public static String toStringVerdes() {
        String str = "";
        boolean existe = false;
        for (int i = 0; i < Vehiculo.posAñadir; i++) {
            if (Vehiculo.vehiculos[i].color.toLowerCase().equals("verde")) {
                existe = true;
                str += Vehiculo.vehiculos[i].getInfo() + "\n";
            }
        }
        if (existe) {
            return str;
        } else {
            return "No hay vehículos para mostrar";
        }
    }

    /**
     * * Identifica los vehiculos cuyos modelos estén dentro del rango de años
     * 2000-2021
     * 
     * @return String
     */
    public static String toStringModelo() {
        String str = "";
        boolean existe = false;
        for (int i = 0; i < Vehiculo.posAñadir; i++) {
            if (Vehiculo.vehiculos[i].modelo >= 2000 && Vehiculo.vehiculos[i].modelo < 2022) {
                existe = true;
                str += Vehiculo.vehiculos[i].getInfo() + "\n";
            }
        }
        if (existe) {
            return str;
        } else {
            return "No hay vehículos para mostrar";
        }
    }

    /**
     * * Metodo que retorna la información de todos los vehiculos registrados
     * 
     * @return String
     */
    public static String toStringVehiculos() {
        String str = "";
        boolean existe = false;
        for (int i = 0; i < Vehiculo.posAñadir; i++) {
            existe = true;
            str += Vehiculo.vehiculos[i].getInfo() + "\n";
        }
        if (existe) {
            return str;
        } else {
            return "No hay vehículos para mostrar";
        }
    }

    /**
     * * Retorna la cantidad de vehículos registrados
     * 
     * @return Integer
     */
    public static int cantidadVehiculos() {
        return Vehiculo.posAñadir;
    }

    /**
     * * SETTERS Y GETTERS
     */
    public void setModelo(int mo) {
        this.modelo = mo;
    }

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public void setValor(double val) {
        this.valorComercial = val;
    }

    public void setColor(String col) {
        this.color = col;
    }

    public int getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValor() {
        return this.valorComercial;
    }

    public String getColor() {
        return this.color;
    }
}