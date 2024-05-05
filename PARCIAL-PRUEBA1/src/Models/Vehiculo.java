package Models;

public abstract class Vehiculo {
    private String modelo;
    private Double precio;
    private Double precioOriginal; // Nuevo campo para almacenar el precio original
    private String tipo;

    public Vehiculo(String modelo, Double precio, String tipo) {
        this.modelo = modelo;
        this.precio = precio;
        this.precioOriginal = precio;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioSinAumento() {
        return precioOriginal; // Devolver el precio original
    }

    public Double getPrecio() {
        return precio;
    }

    public abstract String obtenerDatosEspecificos();

    public void actualizarPrecio(double porcentajeAumento) {
        precio *= (1 + porcentajeAumento / 100);
    }

    @Override
    public String toString() {
        return "Tipo= " + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio + '\'' +
                ", Datos específicos{" + obtenerDatosEspecificos() + "}" + "\n";
    }
}
