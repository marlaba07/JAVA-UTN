package modelo;

import modelo.enums.TipoCliente;
import modelo.enums.TipoPago;

import java.util.Random;

public class Cliente {
    private static final Random random = new Random();
    private TipoPago medioDePago;
    private TipoCliente tipoCliente;
    private int cantidadArticulos;

    public Cliente() {
        this.tipoCliente = TipoCliente.values()[random.nextInt(TipoCliente.values().length)];
        this.medioDePago = TipoPago.values()[random.nextInt(TipoPago.values().length)];
        this.cantidadArticulos = random.nextInt(20) + 1; // Número de artículos entre 1 y 20
    }

    public Cliente(TipoPago medioDePago, TipoCliente tipoCliente) {
        this.medioDePago = medioDePago;
        this.tipoCliente = tipoCliente;
        this.cantidadArticulos = random.nextInt(20) + 1;
    }

    public TipoPago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(TipoPago medioDePago) {
        this.medioDePago = medioDePago;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public int calcularTiempo() {
        int tiempoBase = this.cantidadArticulos * 30;
        double tiempoCliente = 0;
        double tiempoPago = 0;

        switch (this.tipoCliente) {
            case COMUN:
                tiempoCliente = tiempoBase * 0.15;
                break;
            case JUBILADO:
                tiempoCliente = tiempoBase * 0.25;
                break;
            case EMBARAZADA:
                tiempoCliente = tiempoBase * 0.20;
                break;
        }

        switch (this.medioDePago) {
            case EFECTIVO:
                tiempoPago = tiempoBase * 0.10;
                break;
            case TARJETA_SIN_PROBLEMA:
                tiempoPago = tiempoBase * 0.15;
                break;
            case TARJETA_CON_PROBLEMA:
                tiempoPago = tiempoBase * 0.50;
                break;
        }

        return (int) (tiempoBase + tiempoCliente + tiempoPago);
    }

}
