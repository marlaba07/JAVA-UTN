import java.util.Scanner;

public class CalcularVariables {
    Scanner scanner = new Scanner(System.in);
    public void realizarOperacionesPto1() {

        System.out.print("Ingrese una letra: ");
        char letra = scanner.nextLine().charAt(0);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();

        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de letra es: " + letra);

        double suma = N + A;
        System.out.println("La suma de A + N es: " + suma);

        double diferencia = A - N;
        System.out.println("La diferencia de A - N es: " + diferencia);

        int valorNumerico = (int)letra;
        System.out.println("El valor numerico de la letra ingresada es: " + valorNumerico);
    }

    public void realizarOperacionesPto2() {

        System.out.print("Ingrese el valor de X: ");
        int X = scanner.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        int Y = scanner.nextInt();

        int suma = X + Y;
        int multiplicacion = X * Y;
        double division = X / Y;

        System.out.println("La suma de X + Y es: " + suma);
        System.out.println("La multiplicación de X * Y es: " + multiplicacion);
        System.out.println("La division de X / Y es: " + division);
    }

    public void realizarOperacionesPto3() {
        System.out.println("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        N += 77;
        N = 3;
        N *= 2;

        System.out.println("El valor final de N es: " + N);
        scanner.close();
    }

    public void realizarOperacionesPto4() {
        System.out.println("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor de B: ");
        int B = scanner.nextInt();
        System.out.println("Ingrese el valor de C: ");
        int C = scanner.nextInt();
        System.out.println("Ingrese el valor de D: ");
        int D = scanner.nextInt();

        B = C;
        C = A;
        A = D;
        D = B;

        System.out.println("El valor final de A es: " + A);
        System.out.println("El valor final de B es: " + B);
        System.out.println("El valor final de C es: " + C);
        System.out.println("El valor final de D es: " + D);

        scanner.close();
    }
}
