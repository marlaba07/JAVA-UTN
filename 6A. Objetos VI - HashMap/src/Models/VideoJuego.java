package Models;

public class VideoJuego extends Entretenimiento{

    public Integer horasEstimadas;
    public String compania;

    public VideoJuego() {
        super();
        this.horasEstimadas = 10;
    }

    public VideoJuego(String compania, String titulo) {
        super();
        this.setTitulo(titulo);
        this.compania = compania;
        this.horasEstimadas = 10;
    }

    public VideoJuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", horas_juego=" + horasEstimadas +
                ", entregado=" + this.isEntregado() +
                ", genero=" + this.getGenero() +
                ", compania='" + compania + '\'' +
                '}';
    }

}
