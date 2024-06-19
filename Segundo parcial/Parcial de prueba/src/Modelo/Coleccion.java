package Modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Coleccion {
    private int id;
    private String autor;
    private String titulo;
    private String fecha;
    private List<Libro> libros;
    private List<Novela> novelas;

    public Coleccion(int id, String autor, String titulo, String fecha) {
        this.id      = id;
        this.autor   = autor;
        this.titulo  = titulo;
        this.fecha   = fecha;
        this.libros  = new ArrayList<>();
        this.novelas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Novela> getNovelas() {
        return novelas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void setNovelas(List<Novela> novelas) {
        this.novelas = novelas;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
