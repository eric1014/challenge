package challenge;

import java.util.ArrayList;
import java.util.List;

class Diagnostico {
    private String descricaoProblema;
    private List<String> possiveisCausas;

    // Construtor
    public Diagnostico(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
        this.possiveisCausas = new ArrayList<>();
    }

    // Métodos
    public void adicionarCausa(String causa) {
        possiveisCausas.add(causa);
    }

    public List<String> getPossiveisCausas() {
        return possiveisCausas;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }
}