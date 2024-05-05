package Models;

public class AutoCarrera extends Vehiculo {
    private Integer velMax;

    public AutoCarrera(String modelo, Double precio, String tipo, Integer velMax) {
        super(modelo, precio, tipo);
        this.velMax = velMax;
    }

    public Integer getVelMax() {
        return velMax;
    }

    public void setVelMax(Integer velMax) {
        this.velMax = velMax;
    }
}
