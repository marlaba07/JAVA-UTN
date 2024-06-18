package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import modelo.Aeropuerto;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Json {
    public static List<Aeropuerto> importarJson(String archivo) throws IOException {
        File file = new File(archivo);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, new TypeReference<List<Aeropuerto>>() {});
    }

    public static void guardarJson(String archivo, List<Aeropuerto> aeropuerto) throws Exception {
        // Escribir la lista de objetos de vuelta al archivo JSON
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(archivo), aeropuerto);
    }
}