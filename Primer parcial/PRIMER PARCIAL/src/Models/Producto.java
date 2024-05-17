package Models;

public abstract class Producto {
    private String nombre;
    private Double precio;
    private Integer stock;

    public Producto(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    public static Double aumentarPrecio(Producto producto, Double aumentoPorcentaje){
        Double aumento = (producto.getPrecio() * aumentoPorcentaje / 100);
        Double nuevoPrecio = producto.getPrecio() + aumento;
        producto.setPrecio(nuevoPrecio);
        return producto.getPrecio();
    }
}
