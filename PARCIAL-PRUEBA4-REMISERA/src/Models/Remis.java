package Models;

public class Remis extends Vehiculo{
    private Double tarifaXCuadra;

    public Remis(String marca, String modelo, String tipoCombustible, String patente, Boolean disponible, Double tarifaXCuadra, String tipo) {
        super(marca, modelo, tipoCombustible, patente, disponible, tipo);
        this.tarifaXCuadra = tarifaXCuadra;
    }

    public Double getTarifaXCuadra() {
        return tarifaXCuadra;
    }

    public void setTarifaXCuadra(Double tarifaXCuadra) {
        this.tarifaXCuadra = tarifaXCuadra;
    }

    @Override
    public Boolean isDiponible() {
        return null;
    }

    public void remisDisponible() {
        if (isDiponible()) {
            System.out.println("Vehículo disponible:");
            System.out.println(toString());
        } else {
            System.out.println("No hay vehículos disponibles!");
        }
    }

    @Override
    public String toString() {
        return "Remis{" +
                "tarifaXCuadra=" + tarifaXCuadra +
                '}';
    }
}
