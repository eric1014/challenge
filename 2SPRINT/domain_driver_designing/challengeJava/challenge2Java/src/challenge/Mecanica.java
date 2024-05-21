package challenge;

import java.util.ArrayList;
import java.util.List;

class Mecanica {
    private String nome;
    private String endereco;
    private List<OrdemDeServico> ordensDeServico;

    // Construtor
    public Mecanica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.ordensDeServico = new ArrayList<>();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }

    public void adicionarOrdemDeServico(OrdemDeServico ordem) {
        this.ordensDeServico.add(ordem);
    }
}