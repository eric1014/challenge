package challenge;

import java.util.ArrayList;
import java.util.List;

class NegociosPorto {
    private List<Cliente> clientesPorto;

    // Construtor
    public NegociosPorto() {
        this.clientesPorto = new ArrayList<>();
    }

    // Métodos
    public void adicionarCliente(Cliente cliente) {
        clientesPorto.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientesPorto.remove(cliente);

    }

}