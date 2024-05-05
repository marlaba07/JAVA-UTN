package Models;

import Interface.Deportivos;

public class Motocicleta extends Vehiculo implements Deportivos {
    private Double cilindrada;

    public Motocicleta(String modelo, Double precio, String tipo, Double cilindrada) {
        super(modelo, precio, tipo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void competirEnPista() {
        System.out.println("...Simulando competencia... [ruido de motocicleta]");
    }

    @Override
    public String obtenerDatosEspecificos() {
        return "Cilindrada: " + cilindrada + " cc";
    }

    @Override
    public String toString() {
        return "Motocicleta: " + super.toString();
    }
}
