package Models;

import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigo;
    private String direccion;
    private Integer cantOperaciones;
    private List<Hangar> hangares;

    public Aeropuerto(String nombre, String codigo, String direccion, Integer cantOperaciones, List<Hangar> hangares) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.cantOperaciones = cantOperaciones;
        this.hangares = hangares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantOperaciones() {
        return cantOperaciones;
    }

    public void setCantOperaciones(Integer cantOperaciones) {
        this.cantOperaciones = cantOperaciones;
    }

    public List<Hangar> getHangares() {
        return hangares;
    }

    public void setHangares(List<Hangar> hangares) {
        this.hangares = hangares;
    }

    public void agregarHangares(Hangar hangar){
        hangares.add(hangar);
    }
}
