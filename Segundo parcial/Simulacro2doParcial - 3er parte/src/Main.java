import excep.ClienteException;
import modelo.Cliente;
import modelo.Supermercado;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Supermercado supermercado = new Supermercado();

            for (int i = 0; i < 50; i++) {
                supermercado.agregarClienteAFila(new Cliente());
            }

            supermercado.distribuirClientes();
            supermercado.atender();

            String jsonOutput = supermercado.exportarCajasAJson();
            System.out.println(jsonOutput);

        } catch (ClienteException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}