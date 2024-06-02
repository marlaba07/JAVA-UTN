package Models;

public abstract class Entretenimiento {

    private String titulo;
    private String genero;
    private Boolean entregado = false;

    public Entretenimiento(){
        this.entregado = false;
    }
    public Entretenimiento(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public void entregar(){ this.entregado = true; }
    public void devolver(){ this.entregado = false; }
    public boolean isEntregado(){ return entregado; }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (! (obj instanceof Entretenimiento)) return false;
        Entretenimiento serie = (Entretenimiento) obj;
        return titulo == serie.getTitulo();
    }
}
