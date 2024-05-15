package Models;

public class Viajes {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Double distancia;
    private Double precioTotal;

    public Viajes(Cliente cliente, Vehiculo vehiculo, Double distancia, Double precioTotal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Double calcularTotal(){
        return 0.0;
    }
}
