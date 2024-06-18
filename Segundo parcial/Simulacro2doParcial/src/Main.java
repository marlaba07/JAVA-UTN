
import excep.CustomException;
import modelo.Aeropuerto;
import util.Json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String JSON_FILE_AEROPUERTOS = "G6UyHYt7.json";

    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad mínima: ");
        int capacidad = scanner.nextInt();

        try{
            List<Aeropuerto> listaAeropuertos    = Json.importarJson(JSON_FILE_AEROPUERTOS);
            List<Aeropuerto> listaAeropuertosCap = new ArrayList<>();

            for(Aeropuerto aeropuerto : listaAeropuertos){
                if(aeropuerto.getCapacidad() > capacidad) listaAeropuertosCap.add(aeropuerto);
                else throw new CustomException("No se encontraron aeropuertos con mayor capacidad a la seleccionada. " );
            }

            System.out.println("Aeropuertos con capacidad mayor a " + capacidad + ":");
            for (Aeropuerto aeropuerto : listaAeropuertosCap) {
                System.out.println(aeropuerto);
            }

        } catch(IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}