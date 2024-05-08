package Models;

public class Taxi extends Vehiculo{
    private Integer km;
    private Double precio;
    private Double precioKmRecorrido;

    public Taxi(String marca, String modelo, String tipoCombustible, String patente, Boolean disponible, Double precio, Double precioKmRecorrido, String tipo) {
        super(marca, modelo, tipoCombustible, patente, disponible, tipo);
        this.precio = precio;
        this.precioKmRecorrido = precioKmRecorrido;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecioKmRecorrido() {
        return precioKmRecorrido;
    }

    public void setPrecioKmRecorrido(Double precioKmRecorrido) {
        this.precioKmRecorrido = precioKmRecorrido;
    }

    @Override
    public Boolean isDiponible() {
        return null;
    }

    public void taxiDisponible() {
        if (isDiponible()) {
            System.out.println("Vehículo disponible:");
            System.out.println(toString());
        } else {
            System.out.println("No hay vehículos disponibles!");
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "km=" + km +
                ", precio=" + precio +
                ", precioKmRecorrido=" + precioKmRecorrido +
                '}';
    }
}

