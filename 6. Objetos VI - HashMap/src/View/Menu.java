package View;

import Models.Persona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            Opciones();
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

                    System.out.print("Introduce la altura (m): ");
                    double altura = scanner.nextDouble();

                    Persona persona1 = new Persona(nombre, peso, edad, sexo, altura);
                    Persona persona2 = new Persona(nombre, edad, sexo);
                    Persona persona3 = new Persona();

                    Map<Integer, Persona> mapa = new HashMap<>();
                    mapa.put(persona1.getDNI(), persona1);
                    mapa.put(persona2.getDNI(), persona2);
                    mapa.put(persona3.getDNI(), persona3);

                    /* for (Map.Entry<Integer, Persona> entry : mapa.entrySet()) {
                        Persona persona_value = entry.getValue();
                        System.out.println(persona_value.toString());
                        System.out.println(persona_value.calcularIMC());
                    } */

                    break;
                default:
                    System.out.println("Opción incorrecta... ");
                    break;
            }
        } while (op != 0);
    }

    public static void Opciones(){
        System.out.println("0. Salir. ");
        System.out.println("1. Crear persona. ");
    }
}
