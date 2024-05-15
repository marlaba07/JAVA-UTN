package Models;

import java.util.List;

public class Agencia {
    private List<Paquete> paquete;
    private List<Cliente> cliente;

    public Agencia(List<Paquete> paquete, List<Cliente> cliente) {
        this.paquete = paquete;
        this.cliente = cliente;
    }

    public List<Paquete> getPaquete() {
        return paquete;
    }

    public void setPaquete(List<Paquete> paquete) {
        this.paquete = paquete;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public void agregarPaqueteTurisistico(Paquete p){
        if(!paquete.contains(p)){
            paquete.add(p);
            System.out.println("Paquete agregado correctamente! ");
        }
    }

    public void borrarPaqueteTuristico(Paquete p){
        if(paquete.contains(p)){
            paquete.remove(p);
            System.out.println("Paquete eliminado correctamente! ");
        }
    }

    public void agregarNuevoCliente(Cliente c){
        if(!cliente.contains(c)){
            cliente.add(c);
            System.out.println("Cliente agregado correctamente! ");
        }
    }

    public void borrarCliente(Cliente c){
        if(paquete.contains(c)){
            cliente.remove(c);
            System.out.println("Cliente eliminado correctamente! ");
        }
    }
}
