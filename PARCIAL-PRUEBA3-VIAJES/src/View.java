import Models.Agencia;
import Models.Cliente;
import Models.Historial.HistorialVenta;
import Models.Historial.Venta;
import Models.Paquete;
import Models.Ventas.Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    // Para el cliente
    public static String nombre;
    private static String apellido;
    private static Integer pasaporte;
    private static Cliente cliente;

    // Para el paquete turistico
    private static int ID;
    private static String destino;
    private static Integer stock;
    private static Integer duracion;
    private static Double precioUnitario;
    private static Paquete paquete;

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia(new ArrayList<>(), new ArrayList<>());
        HistorialVenta HC = new HistorialVenta();
        Registro registro = new Registro(agencia.getPaquete());

        int op, idBorrar;
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
                    System.out.println("Ingresar el nombre del cliente: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingresar el apellido del cliente: ");
                    apellido = scanner.nextLine();

                    System.out.println("Ingresar el pasaporte del cliente: ");
                    pasaporte = scanner.nextInt();
                    scanner.nextLine();

                    cliente = new Cliente(nombre, apellido, pasaporte);
                    agencia.agregarNuevoCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingresar nro. identificador: ");
                    ID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresar el destino: ");
                    destino = scanner.nextLine();

                    System.out.println("Ingresar el stock: ");
                    stock = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresar duracion (en días): ");
                    duracion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresar el precio unitario: ");
                    precioUnitario = scanner.nextDouble();
                    scanner.nextLine();

                    paquete = new Paquete(ID, destino, stock, duracion, precioUnitario);
                    agencia.agregarPaqueteTurisistico(paquete);

                    registro.registrarVenta(paquete);
                    break;
                case 3:
                    if (cliente != null && paquete != null) {
                        HC.registrar(cliente, paquete);
                    } else {
                        System.out.println("No se puede registrar el historial: cliente o paquete faltante.");
                        System.out.println("Primero debe cargar por lo menos un paquete y un cliente");
                    }

                    HC.mostrarHistorialVenta();
                    break;
                case 4:
                    System.out.println("Ingresar el NRO. IDENTIFICADOR del paquete que desea eliminar: ");
                    idBorrar = scanner.nextInt();
                    scanner.nextLine();

                    for (Paquete p : agencia.getPaquete()){
                        if (paquete.getID().equals(idBorrar)) {
                            agencia.borrarPaqueteTuristico(p);
                        } else {
                            System.out.println("No se encontró ningun paquete con el ID proporcionado. ");
                        }
                    }
                    break;
                case 5:
                    registro.mostrarInfoPaqueteMasVendido();
                    break;
                case 6:

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
        System.out.println("2. Agregar paquete turistico. ");
        System.out.println("3. Mostrar historial de venta. ");
        System.out.println("4. Eliminar paquete turistico. ");
        System.out.println("5. Ver paquete historico. ");
        System.out.println("6. Aumento de tarifa 2024. ");
    }
}
