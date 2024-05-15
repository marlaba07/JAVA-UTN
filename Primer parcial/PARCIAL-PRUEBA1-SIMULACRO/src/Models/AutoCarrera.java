package Models;

import Interface.Deportivos;

public class AutoCarrera extends Automovil implements Deportivos {
    private Integer velMax;

    public AutoCarrera(String modelo, Double precio, String tipo, Integer airbagsMax, Integer velMax) {
        super(modelo, precio, tipo, airbagsMax);
        this.velMax = velMax;
    }

    @Override
    public void competirEnPista() {
        System.out.println("...Simulando competencia... [ruido de vehiculo deportivo]");
    }

    @Override
    public String obtenerDatosEspecificos() {
        return "Velocidad Máxima: " + velMax + " km/h";
    }

    @Override
    public String toString() {
        return "Auto de Carrera: " + super.toString();
    }
}
