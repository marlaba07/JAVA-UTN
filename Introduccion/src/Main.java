import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcularVariables calcularVariables = new CalcularVariables();

        System.out.println("1. Realizar operaciones (Punto 1)");
        System.out.println("2. Realizar operaciones (Punto 2)");
        System.out.println("3. Realizar operaciones (Punto 3)");
        System.out.println("3. Realizar operaciones (Punto 4)");

        System.out.println("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularVariables.realizarOperacionesPto1();
                break;
            case 2:
                calcularVariables.realizarOperacionesPto2();
                break;
            case 3:
                calcularVariables.realizarOperacionesPto3();
                break;
            case 4:
                calcularVariables.realizarOperacionesPto4();
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}