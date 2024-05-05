package Models;

public abstract class Vehiculo {
    private String modelo;
    private Double precio;
    private String tipo;

    public Vehiculo(String modelo, Double precio, String tipo) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
