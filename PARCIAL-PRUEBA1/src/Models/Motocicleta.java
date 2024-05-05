package Models;

public class Motocicleta extends Vehiculo{
    private Double cilindrada;

    public Motocicleta(String modelo, Double precio, String tipo, Double cilindrada) {
        super(modelo, precio, tipo);
        this.cilindrada = cilindrada;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
