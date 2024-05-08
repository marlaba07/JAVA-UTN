package Models;

import Interface.Ingreso;

import java.util.List;

public class Carga extends Avion implements Ingreso {
    private Integer cantKgMax;
    private List<String> productos;

    public Carga(String modelo, String marca, String tipoMotor, Integer cantAsientos, Integer cantCombustible, Integer cantKgMax, List<String> productos) {
        super(modelo, marca, tipoMotor, 0, cantCombustible);
        this.cantKgMax = cantKgMax;
        this.productos = productos;
    }

    public Integer getCantKgMax() {
        return cantKgMax;
    }

    public void setCantKgMax(Integer cantKgMax) {
        this.cantKgMax = cantKgMax;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    @Override
    public Boolean ingresar() {
        System.out.println("Ingresando");
        return true;
    }

    public void agregarProductos(String producto){
        productos.add(producto);
    }
}
