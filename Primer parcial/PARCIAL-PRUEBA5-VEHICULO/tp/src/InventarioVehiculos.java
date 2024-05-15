import java.util.ArrayList;

public class InventarioVehiculos {

   private ArrayList<Vehiculo> lista;
   private ArrayList<VehiculoMaritimo> listaVehiculosMaritimos;

   //Constructor
    public InventarioVehiculos() {

        this.lista = new ArrayList<>();
        this.listaVehiculosMaritimos = new ArrayList<>();
    }

    // Get y Set

    public ArrayList<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }

    // Metodos propios
    public void agregarVehiculo(Vehiculo vehiculo){
        lista.add(vehiculo);
    }

    public void agregarVehiculoMaritimo(VehiculoMaritimo vehiculoMaritimo) {
        listaVehiculosMaritimos.add(vehiculoMaritimo);
    }

    public Vehiculo buscarPorPatente(String patente){
        for(Vehiculo vehiculo : lista){
            if(vehiculo.getPatente().equals(patente)){
                return  vehiculo;
            }
        }
        return null;
    }

    public int contarVehiculos(){
        return lista.size();
    }

    public ArrayList<Vehiculo> devolverListado(){
        return lista;
    }

    public boolean eliminarPorPatente(String patente){
        int flag = 0;
        for(int i = 0 ; i < lista.size() && flag == 0; i++){
            if(lista.get(i).getPatente().equals(patente)){
                flag = i;
            }
        }

        if(flag != 0){
            lista.remove(flag);
            return true;
        }else{
            return false;
        }
    }

    public double calcularTotalInventario() {
        double total = 0;
        for (Vehiculo vehiculo : lista) {
            total += vehiculo.getPrecio();
        }
        for (VehiculoMaritimo vehiculoMaritimo : listaVehiculosMaritimos) {
            total += vehiculoMaritimo.calcularPrecio();
        }
        return total;
    }
}
