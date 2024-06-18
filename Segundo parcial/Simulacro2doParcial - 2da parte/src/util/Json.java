package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Persona;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Json {
    public static List<Persona> importarJson(String nombre) throws IOException {
        File file = new File(nombre);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file,new TypeReference<List<Persona>>() {});
    }
}
