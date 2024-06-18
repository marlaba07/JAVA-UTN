import excep.CustomException;
import modelo.Aeropuerto;
import modelo.Etiqueta;
import modelo.Generico;
import modelo.Avion;
import util.Json;

import java.io.IOException;
import java.util.*;

public class Main {
    public static final String JSON_FILE_AEROPUERTOS = "G6UyHYt7.json";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad mínima: ");
        int capacidad = scanner.nextInt();

        try {
            // ------------------- PUNTO 1, 2
            List<Aeropuerto> listaAeropuertos    = Json.importarJson(JSON_FILE_AEROPUERTOS);
            List<Aeropuerto> listaAeropuertosCap = new ArrayList<>();

            for(Aeropuerto aeropuerto : listaAeropuertos){
                if(aeropuerto.getCapacidad() > capacidad) {
                    listaAeropuertosCap.add(aeropuerto);
                } else {
                    throw new CustomException("No se encontraron aeropuertos con mayor capacidad a la seleccionada. ");
                }
            }

            System.out.println("Aeropuertos con capacidad mayor a " + capacidad + ": \n");

            for (Aeropuerto aeropuerto : listaAeropuertosCap) {
                System.out.println(aeropuerto);
            }

            // ------------------- PUNTO 3
            Generico<String> listaTagsPilotos = new Generico<>();
            List<Etiqueta> etiquetas          = new ArrayList<>();

            for (Aeropuerto aeropuerto : listaAeropuertos) {
                // Almacenar pilotos
                for (Avion avion : aeropuerto.getAviones()) {
                    listaTagsPilotos.agregar("PILOTO: " + avion.getPiloto());
                }

                // Almacenar etiquetas
                for (String etiqueta : aeropuerto.getEtiquetas()) {
                    Etiqueta tag = new Etiqueta(etiqueta);
                    etiquetas.add(tag);
                    listaTagsPilotos.agregar("TAG: " + etiqueta);
                }
            }

            // Imprimir todos los datos almacenados
            System.out.println("\n\nDatos almacenados: [Pilotos y Tags mezclados] \n");
            List<String> datos = listaTagsPilotos.obtenerTodos();

            for (String dato : datos) {
                System.out.println(dato);
            }

            // ------------------- PUNTO 4
            Set<Etiqueta> setEtiquetas = new HashSet<>(etiquetas);

            System.out.println("\n\nTags únicos:\n");
            for (Etiqueta etiqueta : setEtiquetas) {
                System.out.println(etiqueta.getNombre());
            }

        } catch(IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}