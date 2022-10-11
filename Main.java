import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
            // Todas las opciones del menú
            System.out.println("\n\n ***** MENÚ DE OPCIONES *****");
            System.out.println("-----------------------------------------");
            System.out.println("0: Finaliza el programa");
            System.out.println("1: Creará un nuevo vehículo si la cantidad de vehiculos es menor a 10");
            System.out.println("2: Mostrará la información de todos los vehículos");
            System.out.println("3: Mostrará la cantidad total de vehículos actualmente");
            System.out.println("4: Mostrará la información de los vehículos cuyo color sea verde");
            System.out.println("5: Mostrará la información de los vehículos cuyo modelo esté entre los años 2000-2021");
            System.out.println("6: Creará un nuevo objeto Sensor si la cantidad de sensores actuales es menor a 8");
            System.out.println("7: Mostrará la información de todos los sensores");
            System.out.println("8: Mostrará la cantidad de sensores actualmente");
            System.out.println("9: Mostrará la información de todos los sensores cuyo tipo sea temperatura");
            System.out.println("666: Mostrará todos los sensores cuyo tipo sea temperatura, ordenándolos por valor");
            System.out.println("------------------------------------------");
            System.out.print("Su opción: ");
            // Opción que toma el usuario
            opcion = sc.nextInt();
            System.out.println("\n");
            switch (opcion) {
                case 0:
                    System.out.println("Ingresaste el número 0, por lo tanto se termina la ejecución\n");
                    break;

                case 1:
                    if (Vehiculo.posAñadir < Vehiculo.tamano) {
                        System.out.println("Ingresaste el número 1, por lo tanto ingresa la siguiente información:");
                        System.out.print("Modelo del vehículo: ");
                        int modelo = sc.nextInt();
                        System.out.print("Marca del vehículo: ");
                        String marca = sc.next();
                        System.out.print("Valor comercial del vehículo: ");
                        Double valorComercial = sc.nextDouble();
                        System.out.print("Color del vehículo: ");
                        String color = sc.next();
                        // Crea el vehículo
                        Vehiculo vehiculo = new Vehiculo(modelo, marca, valorComercial, color);
                        System.out.println("\n¡Se ha creado su vehículo!");
                    } else {
                        System.out.println("Error, la base de datos está llena actualmente");
                    }
                    break;

                case 2:
                    System.out.println(
                            "Ingresaste el número 2, por lo tanto aquí está la información de todos los vehículos ");
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;

                case 3:
                    System.out.print("Ingresaste el número 3, la cantidad de vehículos que hay actualmente es de: ");
                    System.out.println(Vehiculo.cantidadVehiculos());
                    break;

                case 4:
                    System.out.println("Ingresaste el número 4, la información de los vehículos de color verde es: ");
                    System.out.println(Vehiculo.toStringVerdes());
                    break;

                case 5:
                    System.out.println(
                            "Ingresaste el número 5, la información de los vehículos de modelo 2000 hasta el 2021 es: ");
                    System.out.println(Vehiculo.toStringModelo());
                    break;

                case 6:
                    if (Sensor.posAñadir < Sensor.tamaño) {
                        System.out.println("Ingresaste el número 6, por lo tanto ingresa la siguiente información:");
                        System.out.print("Tipo de Sensor: ");
                        String tipoSensor = sc.next();
                        System.out.print("Valor del Sensor: ");
                        double valorSensor = sc.nextDouble();
                        // Crea el sensor
                        Sensor sensor = new Sensor(tipoSensor, valorSensor);
                        System.out.println("\n¡Se ha creado su sensor!");
                    } else {
                        System.out.println("Error, la base de datos está llena actualmente");
                    }
                    break;

                case 7:
                    System.out.println(
                            "Ingresaste el número 7, por lo tanto a continuación tendrás información de todos los Sensores");
                    System.out.println(Sensor.toStringSensores());
                    break;

                case 8:
                    System.out.print("Ingresaste el número 8, la cantidad de sensores que hay actualmente es de: ");
                    System.out.println(Sensor.cantidadSensores());
                    break;

                case 9:
                    System.out.println(
                            "Ingresaste el número 9, a continuación tendrás la información de los sensores de tipo 'Temperatura'");
                    System.out.println(Sensor.toStringTemperatura());
                    break;

                case 666:
                    System.out.println(
                            "Ingresaste el número 666, a continuación tendrás la información de los sensores de tipo 'Temperatura' ordenados por valor");
                    System.out.println(Sensor.toStringTemperaturaOrdenados());
                    break;

                default:
                    System.out.println("Por favor, escoja un número válido");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
