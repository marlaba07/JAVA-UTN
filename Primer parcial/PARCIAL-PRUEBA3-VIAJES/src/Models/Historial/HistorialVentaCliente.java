package Models.Historial;

import Models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class HistorialVentaCliente {
    private Cliente cliente;
    private List<Venta> ventas;

    public HistorialVentaCliente(Cliente cliente) {
        this.cliente = cliente;
        this.ventas = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }
}
