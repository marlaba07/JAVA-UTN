import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de InventarioVehiculos
        InventarioVehiculos inventario = new InventarioVehiculos();

        // Crear algunos vehículos y agregarlos al inventario
        ArrayList<String> prestaciones = new ArrayList<>();
        prestaciones.add("ta lindo el tutu");

        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", 7, 4, 25000, prestaciones, ModoCambios.AUTOMATICO);
        Moto moto1 = new Moto("DEF456", "Honda", "CBR500R", 4, 2, 8000, 500, true);
        inventario.agregarVehiculo(auto1);
        inventario.agregarVehiculo(moto1);



        // Probar el método buscarPorPatente
        Vehiculo vehiculoEncontrado = inventario.buscarPorPatente("ABC123");
        if (vehiculoEncontrado != null) {
            System.out.println("Vehículo encontrado: " + vehiculoEncontrado);
        } else {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }

        // Probar el método contarVehiculos
        System.out.println("Cantidad de vehículos en el inventario: " + inventario.contarVehiculos());

        // Probar el método devolverListado
        System.out.println("Listado de vehículos en el inventario:");
        for (Vehiculo vehiculo : inventario.devolverListado()) {
            System.out.println(vehiculo);
        }

        // Probar el método eliminarPorPatente
        boolean eliminado = inventario.eliminarPorPatente("ABC123");
        if (eliminado) {
            System.out.println("Vehículo eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún vehículo con esa patente para eliminar.");
        }
    }
}
