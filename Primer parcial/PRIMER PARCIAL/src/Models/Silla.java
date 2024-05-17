package Models;

import Interface.Descuento;

public class Silla extends Mueble implements Descuento {
    private Boolean tieneRuedas;

    public Silla(String nombre, Double precio, Integer stock, Boolean tieneRuedas) {
        super(nombre, precio, stock);
        this.tieneRuedas = tieneRuedas;
    }

    public Boolean getTieneRuedas() {
        return tieneRuedas;
    }

    public void setTieneRuedas(Boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "tieneRuedas=" + tieneRuedas +
                '}';
    }

    @Override
    public double descuentoEspecial(Double porcentaje) {
        double descuento = getPrecio() * (porcentaje / 100);
        return getPrecio() - descuento;
    }
}
