import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú:");
            System.out.println("1. Objeto Rectángulo. ");
            System.out.println("2. Objeto Empleado. ");
            System.out.println("3. Objeto Ítem de venta. ");
            System.out.println("4. Objeto Cuenta bancaria. ");
            System.out.println("5. Objeto Hora. ");
            System.out.println("6. Salir. ");

            System.out.print("Elija una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Rectangulo rectangulo = new Rectangulo(6.0, 6.0);

                    System.out.println("Ancho por defecto: " + rectangulo.getWidth());
                    System.out.println("Alto por defecto: " + rectangulo.getHeight());
                    System.out.println("Área por defecto: " + rectangulo.calculateArea());
                    System.out.println("Perímetro por defecto: " + rectangulo.calculatePerimeter());

                    rectangulo.setWidth(5.0);
                    rectangulo.setHeight(6.0);

                    System.out.println("Nuevo ancho: " + rectangulo.getWidth());
                    System.out.println("Nuevo alto: " + rectangulo.getHeight());
                    System.out.println("Nueva área: " + rectangulo.calculateArea());
                    System.out.println("Nuevo perímetro: " + rectangulo.calculatePerimeter());

                    break;
                case 2:
                    Empleado empleado = new Empleado("Carlos", "Gutierrez", 23456345, 25000.0 );
                    Empleado empleado2 = new Empleado("Ana", "Sánchez", 34234123, 27500.0 );

                    empleado.showEmployee(empleado);
                    empleado2.showEmployee(empleado2);

                    empleado.increaseSalary(15.0);

                    System.out.println("El empleado aumentó su salario en un 15%" );
                    empleado.showEmployee(empleado);

                    break;
                case 3:
                    Item item = new Item(1, "Objeto coleccionable", 30, 1500);
                    String itemDetails = item.showItem(item);
                    System.out.println(itemDetails);

                    break;
                case 4:
                    Banco banco = new Banco(1, "Banco Provincia", 15000.0);

                    System.out.println("Te acreditamos 2.500");
                    banco.credito(2500.0);

                    System.out.println("Debitaste 1.500");
                    banco.debito(1500.0);

                    System.out.println("Debitaste 30.000");
                    banco.debito(30000.0);

                    String bancoDetails = banco.showCuenta(banco);
                    System.out.println(bancoDetails);

                    break;
                case 5:
                    Hora hora = new Hora(23, 30, 15);
                    System.out.println(hora);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}