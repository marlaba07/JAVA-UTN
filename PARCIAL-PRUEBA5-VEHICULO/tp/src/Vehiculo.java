import java.util.Objects;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int consumoCombustible;

    private int cantDeRuedas;

    private float precio;

    // Constructores

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, int consumoCombustible, int cantDeRuedas, float precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustible = consumoCombustible;
        this.cantDeRuedas = cantDeRuedas;
        this.precio = precio;
    }

    // Get y Set

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getCantDeRuedas() {
        return cantDeRuedas;
    }

    public void setCantDeRuedas(int cantDeRuedas) {
        this.cantDeRuedas = cantDeRuedas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoCombustible=" + consumoCombustible +
                ", cantDeRuedas=" + cantDeRuedas +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return consumoCombustible == vehiculo.consumoCombustible && cantDeRuedas == vehiculo.cantDeRuedas && Float.compare(precio, vehiculo.precio) == 0 && Objects.equals(patente, vehiculo.patente) && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente, marca, modelo, consumoCombustible, cantDeRuedas, precio);
    }


}
