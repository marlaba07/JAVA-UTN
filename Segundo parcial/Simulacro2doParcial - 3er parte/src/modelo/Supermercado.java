package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import excep.ClienteException;

public class Supermercado {
    private List<Caja> cajas;
    private Queue<Cliente> filaEspera;
    private static final int NUM_CAJAS = 5;

    public Supermercado() {
        this.cajas = new ArrayList<>();
        this.filaEspera = new LinkedList<>();
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajas.add(new Caja());
        }
    }

    public void agregarClienteAFila(Cliente cliente) {
        filaEspera.add(cliente);
    }

    public void distribuirClientes() throws ClienteException {
        while (!filaEspera.isEmpty()) {
            Cliente cliente = filaEspera.poll();
            Caja cajaMenor = cajas.get(0);
            for (Caja caja : cajas) {
                if (caja.getTiempoTotal() < cajaMenor.getTiempoTotal()) {
                    cajaMenor = caja;
                }
            }
            cajaMenor.agregarCliente(cliente);
        }
    }

    public void atender() {
        for (Caja caja : cajas) {
            caja.atenderClientes();
        }
    }

    public String exportarCajasAJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = mapper.createArrayNode();

        for (Caja caja : cajas) {
            arrayNode.add(mapper.readTree(caja.exportarClientes()));
        }

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
    }

}
