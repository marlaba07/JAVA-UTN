package model;

import excep.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Generico <T extends Persona> {
    private List<T> lista = new ArrayList<>();
    public Generico() {
    }
    public void agregarPersona(T persona) throws CustomException {
        if(persona.getAge() < 18)
            throw new CustomException(persona.getAge());

        lista.add(persona);
    }
    public List<T> getPeople() {
        return lista;
    }
}
