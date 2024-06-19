package modelo;

import com.fasterxml.jackson.databind.ObjectMapper;
import excep.ClienteException;
import modelo.enums.TipoPago;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Caja {
    private Queue<Cliente> fila;
    private int tiempoTotal;
    private int clientesConProblemas;

    public Caja() {
        this.fila = new LinkedList<>();
        this.tiempoTotal = 0;
        this.clientesConProblemas = 0;
    }

    public void agregarCliente(Cliente cliente) throws ClienteException {
        if (cliente.getMedioDePago() == TipoPago.TARJETA_CON_PROBLEMA) {
            clientesConProblemas++;

            if (clientesConProblemas > 3) {
                throw new ClienteException("Más de 3 clientes con tarjeta con problemas en esta caja.");
            }
        }

        fila.add(cliente);
    }

    public void atenderClientes() {
        int tiempoAcumulado = 0;
        while (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            tiempoAcumulado += cliente.calcularTiempo();
            tiempoTotal += tiempoAcumulado;
        }
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public int getClientesConProblemas() {
        return clientesConProblemas;
    }

    public String exportarClientes() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
