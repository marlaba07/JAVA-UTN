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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

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