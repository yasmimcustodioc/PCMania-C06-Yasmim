package br.inatel.sistema;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraInfo() {
        System.out.println("Acompanha: " + nome + " de " + capacidade + "Gb");
    }
}