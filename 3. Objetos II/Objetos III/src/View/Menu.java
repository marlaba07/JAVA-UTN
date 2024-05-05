package View;

import Models.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            options();
            System.out.println("Ingresar una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n==== Ejercicio 1 ==== \n");
                    Cilindro cilindroUno = new Cilindro();
                    System.out.println(cilindroUno);
                    System.out.println("Radio: " + cilindroUno.getRadio());
                    System.out.println("Altura: " + cilindroUno.getHeight());
                    System.out.println("Area: " + cilindroUno.calculateArea()); //comentar metodo en clase cilindo para calcular solo area del circulo
                    System.out.println("Volumen: " + cilindroUno.calculateVolumen());

                    Cilindro cilindroDos = new Cilindro(10.5, 20.3);
                    System.out.println(cilindroDos);
                    System.out.println("Radio: " + cilindroDos.getRadio());
                    System.out.println("Altura: " + cilindroDos.getHeight());
                    System.out.println("Area: " + cilindroDos.calculateArea());
                    System.out.println("Volumen: " + cilindroDos.calculateVolumen());
                    break;
                case 2:
                    Estudiante estudiante1 = new Estudiante(42231235, "Mariano", "Labatut", "mlabatut@gmail.com", "Curie 4845", 20000.0, "Programacion");
                    Estudiante estudiante2 = new Estudiante(42231236, "Esteban", "Quito", "esteban@gmail.com", "Tejedor 4845", 30000.0, "Derecho");
                    Estudiante estudiante3 = new Estudiante(42231237, "Harry", "Potter", "harringui@gmail.com", "Hogwarts 1234", 30000.0, "Magia");

                    Staff staff1 = new Staff(42231238, "Lebron", "James", "elrey@gmail.com", "Los Angeles 4567", 500000.0, "Director");
                    Staff staff2 = new Staff(42231239, "Luka", "Doncic", "lukamagic@gmail.com", "Dallas 1234", 400000.0, "Preceptor");
                    Staff staff3 = new Staff(42231240, "Bam", "Adebayo", "bambam@gmail.com", "Curie 9876", 500000.0, "Profesor");

                    Persona[] school = new Persona[6];
                    school[0] = estudiante1;
                    school[1] = estudiante2;
                    school[2] = estudiante3;

                    school[3] = staff1;
                    school[4] = staff2;
                    school[5] = staff3;
                    break;
                case 3:
                    Figura cuadrado = new Cuadrado("Azul", 20.5);
                    break;
                case 4:
                    System.out.println("Saliendo del programa... ");
                    break;
                default:
                    System.out.println("La opción seleccionada es inválida. ");
                    break;
            }
        } while (option != 4);
    }

    public static void options(){
        System.out.println("1. FIGURAS ");
        System.out.println("2. ESCUEKA ");
        System.out.println("3. FIGURAS ");
        System.out.println("4. SALIR ");
    }

}
