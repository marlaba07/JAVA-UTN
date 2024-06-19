package IU;

import Excepciones.CustomException;
import Modelo.Libro;
import Modelo.Novela;
import Servicio.Impl.ColeccionLibrosServicioImpl;
import Servicio.Impl.ColeccionNovelasServicioImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    public static int id;
    public static String autor;
    public static String titulo;
    public static String fecha;

    public static void Menu(){
        ColeccionNovelasServicioImpl coleccionNovelasServicio = new ColeccionNovelasServicioImpl();
        ColeccionLibrosServicioImpl coleccionLibrosServicio   = new ColeccionLibrosServicioImpl();

        List<Novela> novelas = new ArrayList<>();
        List<Libro>  libros  = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            Opciones();
            System.out.println("Ingrese una opción: ");
            op = scanner.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Autor: ");
                    autor = scanner.nextLine();

                    System.out.println("Titulo: ");
                    titulo = scanner.nextLine();

                    System.out.println("Fecha: ");
                    fecha = scanner.nextLine();

                    Novela novela = new Novela(id, autor, titulo, fecha);

                    try {
                        coleccionNovelasServicio.agregar(novela);
                        System.out.println("Novela agregada exitosamente!! ");
                    } catch (CustomException e) {
                        System.out.println("Error al agregar la novela: " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Titulo: ");
                    titulo = scanner.nextLine();
                    scanner.nextLine();

                    try {
                        novelas = coleccionNovelasServicio.filtrar(titulo);

                        for(Novela nov : novelas){
                            System.out.println(nov);
                        }

                    } catch(CustomException e) {
                        System.out.println("Error al buscar la novela: " + e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    try{
                        coleccionNovelasServicio.eliminar(id);
                        System.out.println("Novela eliminada exitosamente!! ");
                    } catch(CustomException e) {
                        System.out.println("Error al eliminar la novela: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Autor: ");
                    autor = scanner.nextLine();

                    System.out.println("Titulo: ");
                    titulo = scanner.nextLine();

                    System.out.println("Fecha: ");
                    fecha = scanner.nextLine();

                    Libro libro = new Libro(id, autor, titulo, fecha);

                    try {
                        coleccionLibrosServicio.agregar(libro);
                        System.out.println("Novela agregada exitosamente!! ");
                    } catch (CustomException e) {
                        System.out.println("Error al agregar el libro: " + e.getMessage());
                    }

                    break;
                case 5:
                    System.out.println("Titulo: ");
                    titulo = scanner.nextLine();
                    scanner.nextLine();

                    try {
                        libros = coleccionLibrosServicio.filtrar(titulo);

                        for(Libro lib : libros){
                            System.out.println(lib);
                        }

                    } catch(CustomException e) {
                        System.out.println("Error al buscar el libro: " + e.getMessage());
                    }

                    break;
                case 6:
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    try{
                        coleccionLibrosServicio.eliminar(id);
                        System.out.println("Libro eliminado exitosamente!! ");
                    } catch(CustomException e) {
                        System.out.println("Error al eliminar el libro: " + e.getMessage());
                    }

                    break;
                default:
                    System.out.println("La opción seleccionada es incorrecta!! ");
                    break;
            }
        } while(op != 0);

        scanner.close();
    }

    public static void Opciones(){
        System.out.println("\n\n");
        System.out.println("0. Salir ");
        System.out.println("--------------------- ");
        System.out.println("1. Agregar novela. ");
        System.out.println("2. Buscar novela. ");
        System.out.println("3. Eliminar novela. ");
        System.out.println("--------------------- ");
        System.out.println("4. Agregar libro. ");
        System.out.println("5. Buscar libro. ");
        System.out.println("6. Eliminar libro. ");
        System.out.println("\n\n");
    }
}
