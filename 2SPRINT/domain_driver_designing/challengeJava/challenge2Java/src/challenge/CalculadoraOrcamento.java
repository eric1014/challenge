package challenge;

import java.util.List;

class CalculadoraOrcamento {
    private CatalogoPecas catalogoPecas;

    // Construtor
    public CalculadoraOrcamento(CatalogoPecas catalogoPecas) {
        this.catalogoPecas = catalogoPecas;
    }

    // Métodos
    public double calcularOrcamento(List<String> pecasNecessarias) {
        double total = 0.0;
        for (String peca : pecasNecessarias) {
            total += catalogoPecas.buscarPrecoPeca(peca);
        }
        return total;
    }
}