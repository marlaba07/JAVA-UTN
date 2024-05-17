package Models;

public class Escritorio extends Mueble{
    private Integer ancho;
    private Integer alto;

    public Escritorio(String nombre, Double precio, Integer stock, Integer ancho, Integer alto) {
        super(nombre, precio, stock);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
