import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> productosCarga = new ArrayList<>();
        productosCarga.add("Producto 1");
        productosCarga.add("Producto 2");

        Carga avionCarga = new Carga("Modelo Carga", "Marca", "Motor Tipo", 0, 2000, 5000, productosCarga);
        Comercial avionComercial = new Comercial("Modelo Comercial", "Marca", "Motor Tipo", 200, 3000, 100, new ArrayList<>());
        Privado avionPrivado = new Privado("Modelo Privado", "Marca", "Motor Tipo", 10, 1000, true, "ClaveWifi");

        List<Avion> avionesHangar1 = new ArrayList<>();
        avionesHangar1.add(avionCarga);

        List<Avion> avionesHangar2 = new ArrayList<>();
        avionesHangar2.add(avionComercial);
        avionesHangar2.add(avionPrivado);

        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional", "Código", "Dirección", 10, new ArrayList<>());

        Hangar hangar1 = new Hangar(avionesHangar1, aeropuerto);
        Hangar hangar2 = new Hangar(avionesHangar2, aeropuerto);

        aeropuerto.getHangares().add(hangar1);
        aeropuerto.getHangares().add(hangar2);
    }
}