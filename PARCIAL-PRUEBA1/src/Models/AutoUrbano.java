package Models;

public class AutoUrbano extends Automovil{
    private Integer ocupantesMax;

    public AutoUrbano(String modelo, Double precio, String tipo, Double airbagsMax, Integer ocupantesMax) {
        super(modelo, precio, tipo, airbagsMax);
        this.ocupantesMax = ocupantesMax;
    }

    public Integer getOcupantesMax() {
        return ocupantesMax;
    }

    public void setOcupantesMax(Integer ocupantesMax) {
        this.ocupantesMax = ocupantesMax;
    }

    @Override
    public String toString() {
        return "AutoUrbano{" +
                "ocupantesMax=" + ocupantesMax +
                '}';
    }
}
