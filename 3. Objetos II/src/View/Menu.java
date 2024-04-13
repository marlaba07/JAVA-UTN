package View;

import Models.Autor;
import Models.Cliente;
import Models.Factura;
import Models.Libro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Menu {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            options();
            System.out.print("Ingrese una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Autor author  = new Autor("Joshua", "Bloch", "joshua@email.com", "M");
                    Autor author2 = new Autor("Mariano", "Labatut", "mlabatut@email.com", "M");

                    ArrayList<Autor> autores = new ArrayList<>();
                    autores.add(author);
                    autores.add(author2);

                    Libro book = new Libro("Effective Java", 450.0, 150, autores );

                    System.out.println(author);
                    System.out.println(book);

                    book.setPrice(500.0);
                    book.setStock(book.getStock() + 50);

                    book.sendMessagge();
                    break;
                case 2:
                    UUID idClient  = UUID.randomUUID();
                    UUID idInvoice = UUID.randomUUID();

                    Cliente client = new Cliente(idClient, "Mariano", "marianolabatut@gmail.com", 10);
                    System.out.println(client);

                    Factura invoice = new Factura(idInvoice, 10000.0, client);
                    System.out.println(invoice);

                    Double discount = invoice.calculateDiscount();
                    invoice.setTotalAmount(discount);

                    System.out.println("\n Descuento realizado, generando nueva factura... ");
                    System.out.println(invoice);
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

    private static void options() {
        System.out.println("\n MENÚ DE OPCIONES \n");
        System.out.println("1. LIBRO ");
        System.out.println("2. VENTAS ");
        System.out.println("3. CUENTA ");
        System.out.println("4. SALIR ");
    }
}
