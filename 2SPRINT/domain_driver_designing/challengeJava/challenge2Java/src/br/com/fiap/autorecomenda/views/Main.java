package br.com.fiap.autorecomenda.views;

import br.com.fiap.autorecomenda.models.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        CatalogoPecas catalogoPecas = new CatalogoPecas();
        catalogoPecas.adicionarPeca("Filtro de Óleo", 50.0);
        catalogoPecas.adicionarPeca("Pneu", 300.0);
        catalogoPecas.adicionarPeca("Velas de Ignição", 40.0);

        CalculadoraOrcamento calculadora = new CalculadoraOrcamento(catalogoPecas);

        Cliente cliente = new Cliente("João Silva", "11987654321", new Veiculo("Toyota", "Corolla", "ABC-1234", null));

        Mecanica mecanica = new Mecanica("Oficina do Zé", "Rua das Flores, 123");

        OrdemDeServico ordem = new OrdemDeServico("Troca de óleo e filtro", cliente, mecanica);
        ordem.adicionarPeca(new Peca("Filtro de Óleo", 50.0));
        ordem.adicionarPeca(new Peca("Óleo do Motor", 150.0));

        cliente.adicionarOrdemDeServico(ordem);

        CentralRedirecionamento central = new CentralRedirecionamento();
        central.adicionarOficina(mecanica);

        // Execução de funcionalidades
        System.out.println("Orçamento para troca de peças: " + calculadora.calcularOrcamento(Arrays.asList("Filtro de Óleo", "Pneu")));

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Veículo: " + cliente.getVeiculo().getMarca() + " " + cliente.getVeiculo().getModelo());

        System.out.println("Ordem de Serviço: " + ordem.getDescricaoProblema());
        System.out.println("Custo Total: " + ordem.getCustoTotal());

        System.out.println("Oficinas Confiáveis:");
        for (Mecanica oficina : central.buscarOficinas()) {
            System.out.println("- " + oficina.getNome() + ", " + oficina.getEndereco());
        }
    }
}
