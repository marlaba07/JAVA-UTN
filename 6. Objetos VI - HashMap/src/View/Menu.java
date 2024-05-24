package View;

import Models.Password;
import Models.Persona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            Opciones();
            System.out.println("Ingresar una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:

                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Introduce el sexo (H/M): ");
                    char sexo = scanner.next().charAt(0);

                    System.out.print("Introduce el peso (kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Introduce la altura (m): ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();

                    Persona persona1 = new Persona(nombre, peso, edad, sexo, altura);
                    Persona persona2 = new Persona(nombre, edad, sexo);
                    Persona persona3 = new Persona();

                    Map<Integer, Persona> mapa = new HashMap<>(Integer, Persona);
                    mapa.put(persona1.getDNI(), persona1);
                    mapa.put(persona2.getDNI(), persona2);
                    mapa.put(persona3.getDNI(), persona3);

                    for (Map.Entry<Integer, Persona> entry : mapa.entrySet()) {
                        // getValue obtiene el valor de la posición actual.
                        Persona persona_value = entry.getValue();
                        System.out.println(persona_value.toString());
                        System.out.println(persona_value.calcularIMC());
                    }

                    break;
                case 2:
                    int index = 0;

                    System.out.println("Ingresa un tamaño para la contraseña: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();

                    Map<Integer, Password> map_password = new HashMap<Integer, Password>();
                    Map<Integer, Boolean > map_password_fuerte = new HashMap<Integer, Boolean>();

                    while(index < size){
                        Password password = new Password();
                        map_password.put(password.hashCode(), password);
                        map_password_fuerte.put(password.hashCode(), password.esFuerte());
                        System.out.println(password.toString());
                        index++;
                    }

                    break;
                default:
                    System.out.println("Opción incorrecta... ");
                    break;
            }
        } while (op != 0);
    }

    public static void Opciones(){
        System.out.println("0. Salir. ");
        System.out.println("1. Primer ejercicio. ");
        System.out.println("2. Segundo ejercicio. ");
    }
}
