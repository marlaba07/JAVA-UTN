import java.util.ArrayList;
import java.util.Objects;

public class Auto extends Vehiculo{
    private ArrayList<String> prestaciones;
    private ModoCambios modoCambio;

    private int precio;

    // Constructores
    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, int consumoCombustible, int cantDeRuedas, float precio, ArrayList<String> prestaciones, ModoCambios modoCambio) {
        super(patente, marca, modelo, consumoCombustible, cantDeRuedas, precio);
        this.prestaciones = prestaciones;
        this.modoCambio = modoCambio;
        this.precio = 15;
    }

    // Get y Set

    public ArrayList<String> getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(ArrayList<String> prestaciones) {
        this.prestaciones = prestaciones;
    }

    public ModoCambios getModoCambio() {
        return modoCambio;
    }

    public void setModoCambio(ModoCambios modoCambio) {
        this.modoCambio = modoCambio;
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones=" + prestaciones +
                ", modoCambio=" + modoCambio +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(prestaciones, auto.prestaciones) && modoCambio == auto.modoCambio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prestaciones, modoCambio);
    }
}
