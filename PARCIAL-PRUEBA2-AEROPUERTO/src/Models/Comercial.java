package Models;

import Interface.Servicios;

import java.util.List;

public class Comercial extends Avion implements Servicios {
    private Integer cantAzafatas;
    private List<String> servicios;

    public Comercial(String modelo, String marca, String tipoMotor, Integer cantAsientos, Integer cantCombustible, Integer cantAzafatas, List<String> servicios) {
        super(modelo, marca, tipoMotor, cantAsientos, cantCombustible);
        this.cantAzafatas = cantAzafatas;
        this.servicios = servicios;
    }

    public Integer getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(Integer cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public void servirComida() {
        // TODO: Ver que lógica implementar acá
    }

    @Override
    public void darMantas() {
        // TODO: Ver que lógica implementar acá
    }

    @Override
    public Boolean verMundial() {
        return false;
    }

    public void agregarServicio(String servicio){
        servicios.add(servicio);
    }
}
