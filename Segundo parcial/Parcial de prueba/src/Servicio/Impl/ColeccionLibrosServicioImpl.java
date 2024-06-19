package Servicio.Impl;

import Excepciones.CustomException;
import Modelo.Libro;
import Servicio.ColeccionServicio;

import java.util.ArrayList;
import java.util.List;

public class ColeccionLibrosServicioImpl implements ColeccionServicio<Libro> {
    private List<Libro> libros;

    public ColeccionLibrosServicioImpl() {
        this.libros = new ArrayList<>();
    }

    @Override
    public void eliminar(int id) throws CustomException {
        try {
            boolean elimineado = libros.removeIf(libro -> libro.getId() == id);
            if(!elimineado){
                throw new CustomException("El libro con el id ingresado no existe!!");
            }
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Libro agregar(Libro libro) throws CustomException {
        try {
            for(Libro lib : libros){
                if(lib.getId() == libro.getId())
                    throw new CustomException("El libro que desea agregar ya tiene ese ID. ");
            }

            libros.add(libro);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return libro;
    }

    @Override
    public Libro modificar(int id, Libro libro) throws CustomException {
        try {
            boolean encontrado = false;

            for(Libro lib : libros){
                if(lib.getId() == id){
                    lib.setAutor (libro.getAutor());
                    lib.setFecha (libro.getFecha());
                    lib.setTitulo(libro.getTitulo());

                    encontrado = true;
                }
            }

            if(!encontrado)
                throw new CustomException("El libro solicitado no existe en la coleccion! ");

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return libro;
    }


    @Override
    public List<Libro> filtrar(String titulo) throws CustomException {
        try{
            List<Libro> librosFiltrados = new ArrayList<>();

            for(Libro libro : libros){
                if(libro.getTitulo().toLowerCase().contains(titulo)){
                    librosFiltrados.add(libro);
                    return librosFiltrados;
                }
            }

            throw new CustomException("Libro no encontrado! ");

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List listar() throws CustomException {
        return new ArrayList<>(libros);
    }
}
