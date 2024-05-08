package Models.Historial;

import Models.Paquete;

import java.util.Date;

public class Venta {
    private Date fecha;
    private Paquete paquete;

    public Venta(Date fecha, Paquete paquete) {
        this.fecha = fecha;
        this.paquete = paquete;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
