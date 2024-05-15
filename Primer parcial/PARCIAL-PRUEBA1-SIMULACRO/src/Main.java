import Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Utilitarios("ModeloUtilitario1", 20000.0, "Vehiculo", 1500.0, 2.0));
        vehiculos.add(new Utilitarios("ModeloUtilitario2", 40000.0, "Vehiculo", 1600.0, 2.2));
        vehiculos.add(new Utilitarios("ModeloUtilitario3", 60000.0, "Vehiculo", 1700.0, 2.5));

        vehiculos.add(new Automovil("ModeloAutomovil1", 20000.0, "Vehiculo", 2));
        vehiculos.add(new Automovil("ModeloAutomovil2", 40000.0, "Vehiculo", 2));
        vehiculos.add(new Automovil("ModeloAutomovil3", 60000.0, "Vehiculo", 2));

        vehiculos.add(new AutoUrbano("ModeloUrbano1", 30000.0, "Automóvil", 2, 4));
        vehiculos.add(new AutoUrbano("ModeloUrbano2", 40000.0, "Automóvil", 2, 4));
        vehiculos.add(new AutoUrbano("ModeloUrbano3", 50000.0, "Automóvil", 2, 6));

        vehiculos.add(new AutoCarrera("ModeloCarrera1", 30000.0, "Automóvil", 2, 200));
        vehiculos.add(new AutoCarrera("ModeloCarrera2", 40000.0, "Automóvil", 2, 220));
        vehiculos.add(new AutoCarrera("ModeloCarrera3", 50000.0, "Automóvil", 1, 240));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        GestorVehiculos gestor = new GestorVehiculos(vehiculos);

        // Llamar al método para actualizar los precios con los porcentajes dados
        gestor.actualizarPrecios(5, 10, 15, 20);

        // Imprimir los precios actualizados
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Precio de " + vehiculo.getModelo() + " sin aumento: " + vehiculo.getPrecioSinAumento());
            System.out.println("Precio de " + vehiculo.getModelo() + " con aumento: " + vehiculo.getPrecio());
        }
    }
}