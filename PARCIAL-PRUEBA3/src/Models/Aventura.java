package Models;

import Interface.Calculo;

import java.util.List;

public class Aventura extends Paquete implements Calculo {
    private List<String> actividades;

    public Aventura(int ID, String destino, Integer stock, Integer duracion, Double precioUnitario, List<String> actividades) {
        super(ID, destino, stock, duracion, precioUnitario);
        this.actividades = actividades;
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
