import Models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String nombre;
    private static String apellido;
    private static String direccion;
    private static long telefono;
    private static String marca;
    private static String modelo;
    private static String tipoCombustible;
    private static String patente;
    private static String tipo;
    private static Double tarifaXCuadra;
    private static Double bajadaBandera;
    private static Double precioKmRecorrido;

    public static void main(String[] args) {
        Agencia agencia = new Agencia(new ArrayList<>(), new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            Options();
            System.out.println("Ingresar una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println("Ingresa nombre del cliente: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingresar apellido del cliente: ");
                    apellido = scanner.nextLine();

                    System.out.println("Ingresar direccion del cliente: ");
                    direccion = scanner.nextLine();

                    System.out.println("Ingresar telefono del cliente: ");
                    telefono = scanner.nextLong();
                    scanner.nextLine();

                    Cliente cliente = new Cliente(nombre, apellido, direccion, telefono);
                    agencia.agregarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingresa marca del vehiculo: ");
                    marca = scanner.nextLine();

                    System.out.println("Ingresar modelo del vehiculo: ");
                    modelo = scanner.nextLine();

                    System.out.println("Ingresar tipo de combustible del vehiculo: ");
                    tipoCombustible = scanner.nextLine();

                    System.out.println("Ingresar patente del vehiculo: ");
                    patente = scanner.nextLine();

                    System.out.println("Es taxi o remis?: ");
                    tipo = scanner.nextLine();

                    Vehiculo vehiculo = null;

                    if (tipo.equalsIgnoreCase("taxi")) {
                        System.out.println("Ingresar bajada de bandera del taxi: ");
                        bajadaBandera = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Ingresar precio por kilómetro del taxi: ");
                        precioKmRecorrido = scanner.nextDouble();
                        scanner.nextLine();
                        vehiculo = new Taxi(marca, modelo, tipoCombustible, patente, true, bajadaBandera, precioKmRecorrido, tipo);
                    } else if (tipo.equalsIgnoreCase("remis")) {
                        System.out.println("Ingresar tarifa por cuadra: ");
                        tarifaXCuadra = scanner.nextDouble();
                        scanner.nextLine();
                        vehiculo = new Remis(marca, modelo, tipoCombustible, patente, true, tarifaXCuadra, tipo);
                    } else {
                        System.out.println("Tipo de vehículo inválido.");
                    }

                    agencia.agregarVehiculo(vehiculo);
                    break;
                case 3:
                    for (Vehiculo v : agencia.getVehiculos()) {
                        if (v instanceof Taxi) {
                            ((Taxi) v).taxiDisponible();
                        } else if (v instanceof Remis) {
                            ((Remis) v).remisDisponible();
                        }
                    }

                    break;
                default:
                    System.out.println("Opción incorrecta...");
            }
        } while (op != 0);

        scanner.close();
    }

    public static void Options() {
        System.out.println("0. Salir. ");
        System.out.println("1. Agregar cliente. ");
        System.out.println("2. Agregar vehiculo. ");
        System.out.println("3. Despachar viaje. ");
    }
}