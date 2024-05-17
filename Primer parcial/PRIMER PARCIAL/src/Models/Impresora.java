package Models;

import Interface.Descuento;

public class Impresora extends Informatico implements Descuento {
    private Integer impresionPorMin;

    public Impresora(String nombre, Double precio, Integer stock, String nombreFabricante, Integer impresionPorMin) {
        super(nombre, precio, stock, nombreFabricante);
        this.impresionPorMin = impresionPorMin;
    }

    public Integer getImpresionPorMin() {
        return impresionPorMin;
    }

    public void setImpresionPorMin(Integer impresionPorMin) {
        this.impresionPorMin = impresionPorMin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionPorMin=" + impresionPorMin +
                '}';
    }

    @Override
    public double descuentoEspecial(Double porcentaje) {
        double descuento = getPrecio() * (porcentaje / 100);
        return getPrecio() - descuento;
    }
}
