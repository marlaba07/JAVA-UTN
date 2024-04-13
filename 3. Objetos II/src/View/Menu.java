package View;

import Models.Autor;
import Models.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            options();
            System.out.print("Ingrese una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ArrayList<String> autores = new ArrayList<>();
                    autores.add("Joshua");

                    Autor author = new Autor("Joshua", "Bloch", "joshua@email.com", "M");
                    Libro book = new Libro("Effective Java", 450.0, 150, autores );

                    System.out.println(author);
                    System.out.println(book);

                    book.setPrice(500.0);
                    book.setStock(book.getStock() + 50);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción que eligió no es válida.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }

    public void options() {
        System.out.println("\n MENÚ DE OPCIONES \n");
        System.out.println("1. LIBRO ");
        System.out.println("2. VENTAS ");
        System.out.println("3. CUENTA ");
        System.out.println("4. SALIR ");
    }
}
