import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Punto 3 */
        List<Producto> productos = new ArrayList<>();

        Escritorio escritorio = new Escritorio("Escritorio", 500000.0, 20, 120, 200);
        Silla silla           = new Silla("Silla", 50000.0, 300, true);
        Notebook notebook     = new Notebook("Vivobook Asus", 970245.0, 10, "Mariano", 68);
        Impresora impresora   = new Impresora("Impresora", 780000.0, 100, "Mariano", 50);

        productos.add(escritorio);
        productos.add(silla);
        productos.add(notebook);
        productos.add(impresora);

        for(Producto p : productos){
            System.out.println(p);
        }

        /* Punto 4 */
        double sillaDesc     = silla.descuentoEspecial(20.0);
        double impresoraDesc = impresora.descuentoEspecial(30.0);

        System.out.println("Silla sin descuento: " + silla.getPrecio());
        System.out.println("Silla con descuento: " + sillaDesc);
        System.out.println("Impresora sin descuento: " + impresora.getPrecio());
        System.out.println("Impresora con descuento: " + impresoraDesc);

        /* Punto 5 */
        System.out.println("\nProductos antes y después de aumentos: ");
        for(Producto p : productos){
            System.out.println("Producto: " + p.getClass().getSimpleName());
            System.out.println("Precio antes del aumento: " + p.getPrecio());
            Double aumento = obtenerAumento(p);
            Producto.aumentarPrecio(p, aumento);
            System.out.println("Precio después del aumento: " + p.getPrecio());
        }
    }

    private static Double obtenerAumento(Producto p){
        double aumento = 1d;

        if(p instanceof Silla){
            aumento = 5d;
        }

        if(p instanceof Escritorio){
            aumento = 10d;
        }

        if(p instanceof Impresora){
            aumento = 15d;
        }

        if(p instanceof Notebook){
            aumento = 20d;
        }

        return aumento;
    }
}