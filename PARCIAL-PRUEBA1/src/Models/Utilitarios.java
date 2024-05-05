package Models;

public class Utilitarios extends Vehiculo{
    private Double kgMax;
    private Double altura;

    public Utilitarios(String modelo, Double precio, String tipo, Double kgMax, Double altura) {
        super(modelo, precio, tipo);
        this.kgMax = kgMax;
        this.altura = altura;
    }

    public Double getKgMax() {
        return kgMax;
    }

    public void setKgMax(Double kgMax) {
        this.kgMax = kgMax;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
