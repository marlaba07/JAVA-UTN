package Models;

import java.util.List;

public class Agencia {
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private Double recaudacion;

    public Agencia(List<Cliente> clientes, List<Vehiculo> vehiculos) {
        this.clientes = clientes;
        this.vehiculos = vehiculos;
    }

    public Agencia(List<Cliente> clientes, List<Vehiculo> vehiculos, Double recaudacion) {
        this.clientes = clientes;
        this.vehiculos = vehiculos;
        this.recaudacion = recaudacion;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(Double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public void agregarCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
            System.out.println("Cliente agregado correctamente! ");
        }
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        if(!vehiculos.contains(vehiculo)){
            vehiculos.add(vehiculo);
            System.out.println("Vehiculo agregado correctamente! ");
        }
    }

    public void actualizarMonto(Double monto){
        // TODO: Pendiente
    }

    public void enviarViaje(Cliente cliente, Vehiculo vehiculo, Double distancia){
        // TODO: Pendiente
    }
}
