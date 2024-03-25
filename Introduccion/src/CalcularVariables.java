import java.util.Scanner;

public class CalcularVariables {
    Scanner scanner = new Scanner(System.in);
    public void realizarOperacionesPto1() {
        System.out.println("Método que hace cálculos sobre las variables ingresadas. (PARTE 1) ");

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

        scanner.close();
    }

    public void realizarOperacionesPto2() {
        System.out.println("Método que hace cálculos sobre las variables ingresadas. (PARTE 2)");

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

        scanner.close();
    }

    public void realizarOperacionesPto3() {
        System.out.println("Método que modifica la variable ingresada. ");

        System.out.println("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        N += 77;
        N = 3;
        N *= 2;

        System.out.println("El valor final de N es: " + N);

        scanner.close();
    }

    public void realizarOperacionesPto4() {
        System.out.println("Método que intercambia los valores de las variables.");

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

    public void realizarOperacionesPto5() {
        System.out.println("Método que indica si la variable elegida es par o no.");

        System.out.println("Ingresar un valor para A: ");
        int A = scanner.nextInt();

        if(A % 2 == 0) {
            System.out.println("La variable" + A + "es par");
        } else {
            System.out.println("La variable" + A + "es impar");
        }

        scanner.close();
    }

    public void realizarOperacionesPto6(){
        System.out.println("Método que indica si la variable elegida es negativa o positiva. ");

        System.out.println("Ingresar un valor para B: ");
        int B = scanner.nextInt();

        if(B >= 0){
            System.out.println("La variable" + B + "es positivo. ");
        } else {
            System.out.println("La variable" + B + "es negativo. ");
        }

        scanner.close();
    }

    public void realizarOperacionesPto7(){
        System.out.println("Método que indica si la variable elegida es negativa o positiva. ");

        System.out.println("Ingresar un valor para C: ");
        int C = scanner.nextInt();

        if(C % 2 == 0) {
            System.out.println("La variable" + C + "es par");
        } else {
            System.out.println("La variable" + C + "es impar");
        }

        if(C >= 0){
            System.out.println("La variable" + C + "es positivo. ");
        } else {
            System.out.println("La variable" + C + "es negativo. ");
        }

        if (C % 5 == 0) {
            System.out.println("El valor" + C + "es múltiplo de 5.");
        } else {
            System.out.println("El valor" + C + "no es múltiplo de 5.");
        }

        if (C % 10 == 0) {
            System.out.println("El valor" + C + "es múltiplo de 10.");
        } else {
            System.out.println("El valor" + C + "no es múltiplo de 10.");
        }

        if (C > 100) {
            System.out.println("El valor" + C + "es mayor que 100.");
        } else if (C < 100) {
            System.out.println("El valor" + C + "es menor que 100.");
        } else {
            System.out.println("El valor" + C + "es igual a 100.");
        }

        scanner.close();
    }

    public void realizarOperacionesPto8(){
        System.out.println("Método que lee un nombre y genera un saludo personalizado. ");

        System.out.println("Ingresar su nombre, por favor");
        String name = scanner.nextLine();

        System.out.println("Buenos dias, " + name);

        scanner.close();
    }

    public void realizarOperacionesPto9(){
        System.out.println("Método que lee un nombre y genera un saludo personalizado. ");

        System.out.println("Ingresar un número: ");
        int temp = scanner.nextInt();

        int multiplicacion = temp * 2;
        System.out.println("El doble de" + temp + "es igual a: " + multiplicacion);

        int division = temp / 2;
        System.out.println("La mitad de" + temp + "es igual a: " + division);

        scanner.close();
    }

    public void realizarOperacionesPto10(){
        System.out.println("Método que convierte de grados Fahrenheit a grados centígrados. ");

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("La temperatura en grados Celsius es: " + celsius + " °C");

        scanner.close();
    }

    public void realizarOperacionesPto11(){
        System.out.print("Método que calcula y muestra la longitud y área de la circunferencia. ");

        System.out.print("Ingrese el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // MATH.PI es una clase del paquete java.lang que almacena el valor de PI.
        // No es necesario importarlo, ya viene con JAVA.
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);

        scanner.close();
    }

    public void realizarOperacionesPto12() {
        System.out.print("Método que pasa velocidad de KM a M ");

        System.out.print("Ingrese velocidad en KM: ");
        int km = scanner.nextInt();

        int m = km * 1000;
        System.out.println("Los kilometros ingresados (" + km + ") son: " + m + " metros. ");

        scanner.close();
    }

    public void realizarOperacionesPto13(){
        System.out.print("Método que calcula la longitud de la hipotenusa según el teorema de Pitágoras ");

        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // MATH.sqrt calcula la raíz cuadrada de un número dado.
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

        scanner.close();
    }

    public void realizarOperacionesPto14(){
        System.out.print("Método que calcula el volumen de una esfera. ");

        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        double pi = Math.PI;

        // math.pow la utilizo para no hacer 3 veces la multiplicación * 3.
        // En vez de hacer radio * radio * radio, utilizamos pow para almacenar el resultado.
        double volumen = (4.0 / 3.0) * pi * Math.pow(radio, 3);;

        System.out.println("El volumen de la esfera es: " + volumen);

        scanner.close();
    }

    public void realizarOperacionesPto15() {
        System.out.print("Método que calcula el area de un triangulo a partir de la longitud de sus lados. ");

        System.out.println("Ingrese la longitud del lado 1:");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 2:");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 3:");
        double lado3 = scanner.nextDouble();

        // Calcular el semiperímetro
        double s = (lado1 + lado2 + lado3) / 2;

        // Calcular el área utilizando la fórmula de Herón
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }

    public void realizarOperacionesPto16(){
        System.out.print("Método que muestra un numero de 3 cifras por separado. ");

        System.out.println("Ingrese un numero de 3 cifras: ");
        int n = scanner.nextInt();

        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        System.out.println(digits[0] + " " + digits[1] + " " + digits[2]);

        scanner.close();
    }

    public void realizarOperacionesPto17(){
        System.out.print("Método que que lea un número entero 5 cifras y muestre las cifras que ocupan posiciones impares");

        System.out.print("Ingrese un número entero de 5 cifras: ");
        int numero = scanner.nextInt();

        // Validar que el número tenga 5 cifras
        if (numero < 10000 || numero > 99999) {
            System.out.println("El número debe tener exactamente 5 cifras.");
        } else {
            // Convertir el número a una cadena para poder acceder a cada dígito individualmente
            String numeroString = Integer.toString(numero);

            // Mostrar las cifras que ocupan posiciones impares
            System.out.print("Las cifras que ocupan posiciones impares son: ");
            for (int i = 0; i < numeroString.length(); i++) {
                // Verificar si el índice es impar (considerando el índice inicial como 0)
                if (i % 2 != 0) {
                    System.out.print(numeroString.charAt(i) + " ");
                }
            }
        }

        scanner.close();
    }

    public void realizarOperacionesPto18() {
        System.out.print("Método que indica si una hora en particular es válida. ");
        int H, M, S;

        System.out.print("Ingrese una hora: ");
        H = scanner.nextInt();

        if(H <= 23) {
            System.out.print("Ingrese los minutos: ");
            M = scanner.nextInt();

            if(M <= 60){
                System.out.print("Ingrese los segundos: ");
                S = scanner.nextInt();

                if(S <= 60){
                    System.out.print("La hora indicada: "+ H +":"+ M+":"+ S+" es correcta! ");
                } else {
                    System.out.print("Segundos ingresados inválidos. ");
                }
            } else {
                System.out.print("Minutos ingresados inválidos. ");
            }

        } else {
            System.out.print("Hora ingresada inválida. ");
        }

        scanner.close();
    }
}
