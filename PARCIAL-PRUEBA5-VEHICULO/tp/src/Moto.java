import java.util.Objects;

public class Moto extends Vehiculo {

    private int cilindrada;
    private boolean tieneBaul;

    // Constructores

    public Moto() {
    }


    public Moto(String patente, String marca, String modelo, int consumoCombustible, int cantDeRuedas, float precio, int cilindrada, boolean tieneBaul) {
        super(patente, marca, modelo, consumoCombustible, cantDeRuedas, precio);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }

    // Get y Set

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTieneBaul() {
        return tieneBaul;
    }

    public void setTieneBaul(boolean tieneBaul) {
        this.tieneBaul = tieneBaul;
    }

    // Sobreescrituras

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", tieneBaul=" + tieneBaul +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return cilindrada == moto.cilindrada && tieneBaul == moto.tieneBaul;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrada, tieneBaul);
    }
}
