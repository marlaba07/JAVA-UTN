package View;

import Models.*;
import com.sun.org.apache.xpath.internal.operations.Bool;

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

                    Map<Integer, Persona> mapa = new HashMap<Integer, Persona>();
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

                    Map<Integer, Password> map_password        = new HashMap<Integer, Password>();
                    Map<Integer, Boolean > map_password_fuerte = new HashMap<Integer, Boolean>();

                    while(index < 3){
                        Password password = new Password();
                        map_password.put(password.hashCode(), password);
                        map_password_fuerte.put(password.hashCode(), password.esFuerte());
                        System.out.println(password.toString());
                        index++;
                    }

                    for (Map.Entry<Integer, Boolean> entry : map_password_fuerte.entrySet()) {
                        System.out.println("La clave: " + entry.getKey() + ", es fuerte?: " + entry.getValue() );
                    }

                    Password p1 = new Password();
                    Password p2 = new Password();

                    // Creamos nuevas pass y comparamos si son iguales:
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());
                    System.out.println(p1.compareTo(p2));

                    break;
                case 3:
                    Serie s1 = new Serie("Succesion", 4, "Drama", "Jesse Armstrong");
                    Serie s2 = new Serie("The Mandalorian", 3, "Aventuras", "Jon Favreau");
                    Serie s3 = new Serie("Stranger Things", 4, "Terror", "Matt Duffer");
                    Serie s4 = new Serie("The Crown", 5, "Drama", "Peter Morgan");
                    Serie s5 = new Serie("The Witcher", 3, "Fantasía", "Lauren Schmidt");

                    VideoJuego v1 = new VideoJuego("The Legend Of Zelda", 150, "Aventura", "Nintendo");
                    VideoJuego v2 = new VideoJuego("Elden Ring", 120, "Acción", "FromSoftware");
                    VideoJuego v3 = new VideoJuego("Cyberpunk 2077", 100, "RPG", "CD Projekt Red");
                    VideoJuego v4 = new VideoJuego("Hogwart Legacy", 70, "Aventura", "Portkey Games");
                    VideoJuego v5 = new VideoJuego("God of War", 60, "Acción", "Santa Monica Studio");

                    HashMap<Integer, Entretenimiento> listaEntretenimiento = new HashMap<Integer, Entretenimiento>();

                    // Por ahora cargamos solo series porque el equals en entretenimiento comapara series
                    listaEntretenimiento.put(listaEntretenimiento.hashCode(), s1);
                    listaEntretenimiento.put(listaEntretenimiento.hashCode(), s2);
                    listaEntretenimiento.put(listaEntretenimiento.hashCode(), s3);
                    listaEntretenimiento.put(listaEntretenimiento.hashCode(), s4);
                    listaEntretenimiento.put(listaEntretenimiento.hashCode(), s5);

                    // Recorremos toda la lista de entretenimiento y mediante el equals comparamos si son iguales, si son iguales mandamos msg
                    Boolean existe = false;
                    for(Map.Entry<Integer, Entretenimiento> entry : listaEntretenimiento.entrySet()){
                        Serie serieObj = (Serie) entry.getValue();
                        if (serieObj.equals(s5)) {
                            System.out.println("La serie: " + s5.getTitulo() + ", ya existe! ");
                            existe = true;
                        }
                    }

                    // Si no existe lo agregamos a la lista
                    if(!existe){
                        listaEntretenimiento.put(listaEntretenimiento.hashCode(), s5);
                    }

                    // Entregamos algunas series y video juegos
                    s1.entregar();
                    s2.entregar();
                    v4.entregar();

                    // Contamos la cantidad de series entregadas
                    int cantEntregados = 0;
                    for(Map.Entry<Integer, Entretenimiento> entry : listaEntretenimiento.entrySet()){
                        if(entry.getValue().isEntregado() ){
                            cantEntregados++;
                        }
                    }

                    System.out.println("cantEntregados [SERIES] = " + cantEntregados);

                    // Serie con más temporadas y juego con más horas estimadas
                    int key = 0;
                    int cantTemporadas = 0;
                    for(Map.Entry<Integer, Entretenimiento> entry : listaEntretenimiento.entrySet() ){
                        Serie serieObj = (Serie) entry.getValue();
                        if(cantTemporadas < serieObj.getTemporadas()){
                            cantTemporadas = serieObj.getTemporadas();
                            key = entry.getKey();
                        }
                    }
                    
                    Serie serieMaxTemp = (Serie) listaEntretenimiento.get(key);
                    System.out.println("serieMaxTemp = " + serieMaxTemp.toString());

                    for(Map.Entry<Integer, Entretenimiento> entry : listaEntretenimiento.entrySet()){
                        Serie series = (Serie) entry.getValue();
                        System.out.println(series.toString());
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
        System.out.println("3. Tercer ejercicio. ");
    }
}
