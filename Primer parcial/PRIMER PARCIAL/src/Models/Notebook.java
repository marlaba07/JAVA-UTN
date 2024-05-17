package Models;

public class Notebook extends Informatico{
    private Integer memoria;

    public Notebook(String nombre, Double precio, Integer stock, String nombreFabricante, Integer memoria) {
        super(nombre, precio, stock, nombreFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                '}';
    }
}
