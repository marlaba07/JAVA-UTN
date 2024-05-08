package Models;

import java.util.ArrayList;

public class GestorVehiculos {
    private ArrayList<Vehiculo> vehiculos;

    public GestorVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void actualizarPrecios(double porcentajeAumentoMotos, double porcentajeAumentoUtilitarios, double porcentajeAumentoAutomovil, double porcentajeAumentoCarrera) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Motocicleta)
                vehiculo.actualizarPrecio(porcentajeAumentoMotos);

            if (vehiculo instanceof Utilitarios)
                vehiculo.actualizarPrecio(porcentajeAumentoUtilitarios);

            if (vehiculo instanceof Automovil) {
                if (vehiculo instanceof AutoCarrera)
                    vehiculo.actualizarPrecio(porcentajeAumentoCarrera);
                else
                    vehiculo.actualizarPrecio(porcentajeAumentoAutomovil);
            }
        }
    }
}
