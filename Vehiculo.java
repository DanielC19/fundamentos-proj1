import java.util.ArrayList;

public class Vehiculo {
    // Estos son los atributos de nuestra clase de clase Vehiculo
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static int idActual = 1;
    private int id;
    private int modelo;
    private ArrayList<Sensor> sensores = new ArrayList<>(); 
    private String marca;
    private double valorComercial;
    private String color;

    /**
     * * Constructores
     */
    public Vehiculo() {
        this.id = Vehiculo.idActual;
        Vehiculo.idActual++;

        Vehiculo.vehiculos.add(this);
    }

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        this.id = Vehiculo.idActual;
        
        Vehiculo.idActual++;
        Vehiculo.vehiculos.add(this);
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
        String str = "Vehiculo de marca: " + this.marca + "con id de:" + this.id + ", con modelo: " + this.modelo + ", color: " + this.color
                + " y con valor: " + this.valorComercial;
        for (Sensor sensor : this.sensores) {
            str += sensor.getInfo() + "\n";
        }
        return str;
    }

    /**
     * * Metodo que retorna la información de todos los vehiculos registrados
     * 
     * @return String
     */
    public static String toStringVehiculos() {
        String str = "";
        boolean existe = false;
        for (Vehiculo vehiculos : Vehiculo.vehiculos){
            existe = true;
            str += vehiculos.getInfo() + "\n";
        }
        if (!existe) {
            return "No existen vehículos creados hasta el momento compañero.";
        }
        return str;
 
    }
    
    /**
     * * Concatena la info de todos los vehículos verdes
     * 
     * @return String
     */
    public static String toStringVerdes() {
        String str = "";
        boolean existe = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.color.toLowerCase().equals("verde")) {
                existe = true;
                str += vehiculo.getInfo() + "\n";
            }
        }
        if (existe) {
            return str;
        } else {
            return "No hay vehículos para mostrar";
        }
    }

    public String findById(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId() == id) {
                return vehiculo.getInfo();
            }
        }
        return "No hay vehículos registrados con ese ID";
    }

    /**
     * * Retorna la cantidad de sensores del objeto
     * 
     * @return Integer
     */
    public int cantidadSensores() {
        return this.sensores.size();
    }

    /**
     * * Permite añadir sensores
     *
     * @param Sensor
     */
    public void anadirSensor(Sensor s){
        this.sensores.add(s);
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

    public void setId(int id){
        this.id = id;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    
    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public int getId(){
        return this.id;
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