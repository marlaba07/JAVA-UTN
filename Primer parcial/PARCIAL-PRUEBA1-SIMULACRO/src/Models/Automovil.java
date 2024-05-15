package Models;

public class Automovil extends Vehiculo{
    private Integer airbagsMax;

    public Automovil(String modelo, Double precio, String tipo, Integer airbagsMax) {
        super(modelo, precio, tipo);
        this.airbagsMax = airbagsMax;
    }

    @Override
    public String obtenerDatosEspecificos() {
        return "Número de Airbags: " + airbagsMax;
    }

}
