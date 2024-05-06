package Models;

import java.util.List;

public class Hangar {
    private List<Avion> aviones;
    private Aeropuerto aeropuerto;

    public Hangar(List<Avion> aviones, Aeropuerto aeropuerto) {
        this.aviones = aviones;
        this.aeropuerto = aeropuerto;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void agregarAviones(Avion avion){
        aviones.add(avion);
    }

    public void despegarAviones(){
        // TODO: Ver que lógica implementar acá
    }
}
