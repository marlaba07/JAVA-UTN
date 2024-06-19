package Servicio;

import Excepciones.CustomException;
import Modelo.Libro;

import java.util.List;

public interface ColeccionServicio<T> {
    void eliminar(int id) throws CustomException;
    T agregar(T elemento) throws CustomException;
    T modificar(int id, T elemento) throws CustomException;
    List<T> filtrar(String criterio) throws CustomException;
    List<T> listar() throws CustomException;
}
