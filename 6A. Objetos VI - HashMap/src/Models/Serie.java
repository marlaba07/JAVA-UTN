package Models;

public class Serie extends Entretenimiento{
    private Integer temporadas;
    private String creador;

    public Serie() {
        super();
        this.temporadas = 3;
    }

    public Serie(String titulo, String creador) {
        super();
        this.setTitulo(titulo);
        this.creador = creador;
        this.temporadas = 3;
    }

    public Serie(String titulo, Integer temporadas, String genero, String creador) {
        super(titulo, genero);
        this.temporadas = temporadas;
        this.creador = creador;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "temporadas=" + temporadas +
                ", creador='" + creador + '\'' +
                ", genero='" + this.getGenero() + '\'' +
                ", titulo='" + this.getTitulo() + '\'' +
                ", entregado='" + this.isEntregado() + '\'' +
                '}';

    }
}
