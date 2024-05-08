package Models.Ventas;

import Models.Paquete;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Paquete> paquetes;

    public Registro(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public void registrarVenta(Paquete paquete) {
        paquete.aumentarVentas();
    }

    public Paquete obtenerPaqueteMasVendido() {
        Paquete masVendido = null;
        int maxVentas = 0;
        for (Paquete paquete : paquetes) {
            if (paquete.getVentas() > maxVentas) {
                maxVentas  = paquete.getVentas();
                masVendido = paquete;
            }
        }
        return masVendido;
    }

    public void mostrarInfoPaqueteMasVendido() {
        Paquete masVendido = obtenerPaqueteMasVendido();
        if (masVendido != null) {
            System.out.println("Paquete más vendido:");
            System.out.println(masVendido.getDestino());
        } else {
            System.out.println("No hay paquetes vendidos.");
        }
    }
}
