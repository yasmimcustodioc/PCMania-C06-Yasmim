package br.inatel.cliente;

import br.inatel.sistema.Computador;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] computadores;
    private int qtdComputadores = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

        this.computadores = new Computador[20];
    }

    public void addComputador(Computador computador) {

        if (qtdComputadores < 20) {
            computadores[qtdComputadores] = computador;
            qtdComputadores++;
        }
    }

    public float calculaTotalCompra() {

        float total = 0;

        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }

        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void mostraInfoCliente() {

        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);

        System.out.println("\n--- PCs Adquiridos ---");

        for (int i = 0; i < qtdComputadores; i++) {
            computadores[i].mostraPCConfigs();
        }

        System.out.println("VALOR TOTAL DA COMPRA: R$ " + calculaTotalCompra());
    }
}