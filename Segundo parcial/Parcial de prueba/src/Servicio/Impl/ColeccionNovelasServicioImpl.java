package Servicio.Impl;

import Excepciones.CustomException;
import Modelo.Libro;
import Modelo.Novela;
import Servicio.ColeccionServicio;

import java.util.ArrayList;
import java.util.List;

public class ColeccionNovelasServicioImpl implements ColeccionServicio<Novela> {
    private List<Novela> novelas = new ArrayList<>();

    @Override
    public void eliminar(int id) throws CustomException {
        try {
            boolean elimineado = novelas.removeIf(novela -> novela.getId() == id);

            if(!elimineado)
                throw new CustomException("La novela con el id ingresado no existe!!");

        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Novela agregar(Novela novela) throws CustomException {
        try {
            for(Novela nov : novelas){
                if(nov.getId() == novela.getId())
                    throw new CustomException("La novela que desea agregar ya tiene ese ID. ");
            }

            novelas.add(novela);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return novela;
    }

    @Override
    public Novela modificar(int id, Novela novela) throws CustomException {
        try {
            boolean encontrado = false;

            for(Novela nov : novelas){
                if(nov.getId() == id){
                    nov.setAutor (novela.getAutor());
                    nov.setFecha (novela.getFecha());
                    nov.setTitulo(novela.getTitulo());

                    encontrado = true;
                }
            }

            if(!encontrado)
                throw new CustomException("La novela solicitada no existe en la coleccion! ");

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return novela;
    }


    @Override
    public List<Novela> filtrar(String titulo) throws CustomException {
        try{
            List<Novela> novelasFiltradas = new ArrayList<>();

            for(Novela novela : novelas){
                if(novela.getTitulo().toLowerCase().contains(titulo)){
                    novelasFiltradas.add(novela);
                    return novelasFiltradas;
                }
            }

            throw new CustomException("Novela no encontrada! ");

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List listar() throws CustomException {
        return new ArrayList<>(novelas);
    }

}
