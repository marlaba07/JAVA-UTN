package Models;

import Interface.Calculo;

import java.util.List;

public class Cultura extends Paquete implements Calculo {
    private int cantVisitas;

    public Cultura(int ID, String destino, Integer stock, Integer duracion, Double precioUnitario, int cantVisitas) {
        super(ID, destino, stock, duracion, precioUnitario);
        this.cantVisitas = cantVisitas;
    }

    public int getCantVisitas() {
        return cantVisitas;
    }

    public void setCantVisitas(int cantVisitas) {
        this.cantVisitas = cantVisitas;
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