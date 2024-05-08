package Models;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private Integer ID;
    private String destino;
    private Integer stock;
    private Integer duracion;
    private Double precioUnitario;
    private List<Cliente> cliente;
    private int ventas;

    public Paquete(Integer ID, String destino, Integer stock, Integer duracion, Double precioUnitario) {
        this.ID = ID;
        this.destino = destino;
        this.stock = stock;
        this.duracion = duracion;
        this.precioUnitario = precioUnitario;
        this.cliente = new ArrayList<>();
        this.ventas = 0;
    }

    public Integer getID() {
        return ID;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public int getVentas() {
        return ventas;
    }
    public void aumentarVentas() { ventas++; }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", destino='" + destino + '\'' +
                ", stock=" + stock +
                ", duracion=" + duracion +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
