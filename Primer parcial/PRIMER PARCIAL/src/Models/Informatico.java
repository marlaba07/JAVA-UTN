package Models;

public abstract class Informatico extends Producto {
    private String nombreFabricante;

    public Informatico(String nombre, Double precio, Integer stock, String nombreFabricante) {
        super(nombre, precio, stock);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "Informatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                '}';
    }
}
