package modelo;

import java.util.ArrayList;
import java.util.List;

public class Generico<T> {
    private List<T> lista = new ArrayList<>();

    public Generico() {}
    public List<T> agregar(T item){
        lista.add(item);
        return lista;
    }

    public void eliminar(int id){
        lista.remove(id);
    }

    public T obtener(int pos){
        return lista.get(pos);
    }

    public List<T> obtenerTodos(){
        return lista;
    }
}
