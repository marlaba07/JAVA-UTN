package Models;

import Interface.Calculo;

import java.util.List;

public class Relax extends Paquete implements Calculo {
    private List<String> servicios;

    public Relax(int ID, String destino, Integer stock, Integer duracion, Double precioUnitario, List<String> servicios) {
        super(ID, destino, stock, duracion, precioUnitario);
        this.servicios = servicios;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public Double calcularSeguro(Double monto) {
        return null;
    }

    @Override
    public Double calcularPrecioTotal() {
        return null;
    }
}
