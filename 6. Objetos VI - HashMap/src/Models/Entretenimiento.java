package Models;

public abstract class Entretenimiento {
    private String titulo;
    private Boolean prestado;
    private String genero;

    public Entretenimiento() {
    }

    public Entretenimiento(String titulo, Boolean entregado, String genero) {
        this.titulo = titulo;
        this.prestado = entregado;
        this.genero = genero;
    }

    public Boolean entregar(){
        return this.prestado = true;
    }
}
