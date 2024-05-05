package Models;

public class Automovil extends Vehiculo{
    private Double airbagsMax;

    public Automovil(String modelo, Double precio, String tipo, Double airbagsMax) {
        super(modelo, precio, tipo);
        this.airbagsMax = airbagsMax;
    }

    public Double getAirbagsMax() {
        return airbagsMax;
    }

    public void setAirbagsMax(Double airbagsMax) {
        this.airbagsMax = airbagsMax;
    }
}
