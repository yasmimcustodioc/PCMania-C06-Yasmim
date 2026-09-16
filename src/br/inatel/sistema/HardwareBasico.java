package br.inatel.sistema;

public class HardwareBasico {

    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraInfo() {
        System.out.println(" - " + nome + ": " + capacidade);
    }
}