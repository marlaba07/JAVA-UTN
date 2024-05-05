package Models;

public class AutoUrbano extends Automovil{
    private Integer ocupantesMax;

    public AutoUrbano(String modelo, Double precio, String tipo, Integer airbagsMax, Integer ocupantesMax) {
        super(modelo, precio, tipo, airbagsMax);
        this.ocupantesMax = ocupantesMax;
    }

    @Override
    public String obtenerDatosEspecificos() {
        return "Max Ocupantes: " + ocupantesMax;
    }

    @Override
    public String toString() {
        return "Auto Urbano: " + super.toString();
    }
}
