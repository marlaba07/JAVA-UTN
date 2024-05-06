package Models;

import Interface.Servicios;

public class Privado extends Avion implements Servicios {
    private Boolean jacuzzi;
    private String claveWifi;

    public Privado(String modelo, String marca, String tipoMotor, Integer cantAsientos, Integer cantCombustible, Boolean jacuzzi, String claveWifi) {
        super(modelo, marca, tipoMotor, cantAsientos, cantCombustible);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    public Boolean getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(Boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public void servirComida() {

    }

    @Override
    public void darMantas() {

    }

    @Override
    public Boolean verMundial() {
        return true;
    }
}
