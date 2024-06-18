import excep.CustomException;
import model.Generico;
import model.Persona;
import util.Json;

import java.io.IOException;
import java.util.*;

public class Main {
    public static final String FILE_JSON = "generated.json";
    public static final int AGE = 18;

    public static void main(String[] args) {
        try {
            // --------- PUNTO 1, 2, 3
            List<Persona> JSON = Json.importarJson(FILE_JSON);
            Generico<Persona> personasAdultas = new Generico<>();

            for(Persona p : JSON){
                try {
                    personasAdultas.agregarPersona(p);
                } catch (CustomException e) {
                    System.out.println(e.getMessage());
                }
            }

            // --------- PUNTO 4
            Set<Persona> setAutores = new HashSet<>(personasAdultas.getPeople());

            System.out.println("\n\n" +
                    "Personas adultas: ");
            for(Persona p : setAutores) {
                System.out.println(p);
            }

            // --------- PUNTO 5
            Map<String, ArrayList<String>> etiquetas = new HashMap<>();
            for(Persona p : personasAdultas.getPeople()){
                etiquetas.put(p.get_id(), new ArrayList<>(p.getTags()));
            }

            System.out.println("\n\nEtiquetas por persona: ");
            for(Map.Entry<String, ArrayList<String>> entry : etiquetas.entrySet()){
                System.out.println("ID: " + entry.getKey() + ", Etiquetas: " + entry.getValue());
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}