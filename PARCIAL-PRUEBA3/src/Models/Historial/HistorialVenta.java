package Models.Historial;

import Models.Cliente;
import Models.Paquete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialVenta {
    private List<HistorialVentaCliente> historiales;

    public HistorialVenta() {
        this.historiales = new ArrayList<>();
    }

    public List<HistorialVentaCliente> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(List<HistorialVentaCliente> historiales) {
        this.historiales = historiales;
    }

    public void registrar(Cliente cliente, Paquete paquete){
        HistorialVentaCliente HC = null;

        for(HistorialVentaCliente historial : historiales){
            if(historial.getCliente().equals(cliente)){
                HC = historial;
                break;
            }
        }

        if (HC == null) {
            HC = new HistorialVentaCliente(cliente);
            historiales.add(HC);
        }

        HC.agregarVenta(new Venta(new Date(), paquete));
    }

    public void mostrarHistorialVenta() {
        System.out.println("Historial de Ventas:");
        for (HistorialVentaCliente historial : historiales) {
            System.out.println("Cliente: " + historial.getCliente().getNombre() + " " + historial.getCliente().getApellido());
            System.out.println("Ventas:");
            for (Venta venta : historial.getVentas()) {
                System.out.println("Fecha: " + venta.getFecha() + ", Paquete: " +venta.getPaquete().toString());
            }
            System.out.println();
        }
    }


}
