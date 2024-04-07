import java.util.Scanner;
public class Menu {
    CalcularVariables calcularVariables = new CalcularVariables();
    Scanner scanner = new Scanner(System.in);
    public void consignas(){
        System.out.println("1. Realizar operaciones (Punto 1)");
        System.out.println("2. Realizar operaciones (Punto 2)");
        System.out.println("3. Realizar operaciones (Punto 3)");
        System.out.println("4. Realizar operaciones (Punto 4)");
        System.out.println("5. Realizar operaciones (Punto 5)");
        System.out.println("6. Realizar operaciones (Punto 6)");
        System.out.println("7. Realizar operaciones (Punto 7)");
        System.out.println("8. Realizar operaciones (Punto 8)");
        System.out.println("9. Realizar operaciones (Punto 9)");
        System.out.println("10. Realizar operaciones (Punto 10)");
        System.out.println("11. Realizar operaciones (Punto 11)");
        System.out.println("12. Realizar operaciones (Punto 12)");
        System.out.println("13. Realizar operaciones (Punto 13)");
        System.out.println("14. Realizar operaciones (Punto 14)");
        System.out.println("15. Realizar operaciones (Punto 15)");
        System.out.println("16. Realizar operaciones (Punto 16)");
        System.out.println("17. Realizar operaciones (Punto 17)");
        System.out.println("18. Realizar operaciones (Punto 18)");
    }

    public void ejercicios(){
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
            case 5:
                calcularVariables.realizarOperacionesPto5();
                break;
            case 6:
                calcularVariables.realizarOperacionesPto6();
                break;
            case 7:
                calcularVariables.realizarOperacionesPto7();
                break;
            case 8:
                calcularVariables.realizarOperacionesPto8();
                break;
            case 9:
                calcularVariables.realizarOperacionesPto9();
                break;
            case 10:
                calcularVariables.realizarOperacionesPto10();
                break;
            case 11:
                calcularVariables.realizarOperacionesPto11();
                break;
            case 12:
                calcularVariables.realizarOperacionesPto12();
                break;
            case 13:
                calcularVariables.realizarOperacionesPto13();
                break;
            case 14:
                calcularVariables.realizarOperacionesPto14();
                break;
            case 15:
                calcularVariables.realizarOperacionesPto15();
                break;
            case 16:
                calcularVariables.realizarOperacionesPto16();
                break;
            case 17:
                calcularVariables.realizarOperacionesPto17();
                break;
            case 18:
                calcularVariables.realizarOperacionesPto18();
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

}
