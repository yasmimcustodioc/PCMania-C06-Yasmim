package br.inatel.sistema;

public class Computador {

    private String marca;
    private float preco;

    private HardwareBasico[] hardwares;
    private int qtdHardwares = 0;

    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;

        this.hardwares = new HardwareBasico[3];
    }

    public void addHardware(HardwareBasico hardware) {

        if (qtdHardwares < 3) {
            hardwares[qtdHardwares] = hardware;
            qtdHardwares++;
        }
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        System.out.println("Hardwares Básicos:");

        for (int i = 0; i < qtdHardwares; i++) {
            hardwares[i].mostraInfo();
        }

        sistemaOperacional.mostraInfo();

        memoriaUSB.mostraInfo();

        System.out.println("-----------------------------------");
    }
}