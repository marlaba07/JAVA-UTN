package View;
import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            options();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 10:

                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 10);

        scanner.close();
    }

    public static void options() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Inscribir equipo para el torneo. ");
        System.out.println("2. Inscribir jugadores ");
        System.out.println("3. Ver jugadores. ");
        System.out.println("4. Ver equipos del torneo.");
        System.out.println("10. Salir");
    }
}
