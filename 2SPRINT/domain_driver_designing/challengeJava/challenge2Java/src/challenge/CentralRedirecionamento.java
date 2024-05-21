package challenge;

import java.util.ArrayList;
import java.util.List;

class CentralRedirecionamento {
    private List<Mecanica> oficinasConfiaveis;

    // Construtor
    public CentralRedirecionamento() {
        this.oficinasConfiaveis = new ArrayList<>();
    }

    // Métodos
    public void adicionarOficina(Mecanica mecanica) {
        oficinasConfiaveis.add(mecanica);
    }

    public void removerOficina(Mecanica mecanica) {
        oficinasConfiaveis.remove(mecanica);
    }

    public List<Mecanica> buscarOficinas() {
        return oficinasConfiaveis;
    }
}