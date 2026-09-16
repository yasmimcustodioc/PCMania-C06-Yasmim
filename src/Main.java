import br.inatel.cliente.Cliente;
import br.inatel.sistema.Computador;
import br.inatel.sistema.HardwareBasico;
import br.inatel.sistema.MemoriaUSB;
import br.inatel.sistema.ProcessarPedido;
import br.inatel.sistema.SistemaOperacional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float minhaMatricula = 149;

        // PROMOÇÃO 1
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);

        Computador pc1 = new Computador("Apple", minhaMatricula, so1);

        pc1.addHardware(new HardwareBasico("Pentium", 2200));
        pc1.addHardware(new HardwareBasico("Memória RAM", 8));
        pc1.addHardware(new HardwareBasico("HD", 500));

        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));


        // PROMOÇÃO 2
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);

        Computador pc2 = new Computador("Samsung", minhaMatricula + 1, so2);

        pc2.addHardware(new HardwareBasico("Core i5", 3370));
        pc2.addHardware(new HardwareBasico("Memória RAM", 16));
        pc2.addHardware(new HardwareBasico("HD", 1000));

        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));


        // PROMOÇÃO 3
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        Computador pc3 = new Computador("Dell", minhaMatricula + 2, so3);

        pc3.addHardware(new HardwareBasico("Core i7", 4500));
        pc3.addHardware(new HardwareBasico("Memória RAM", 32));
        pc3.addHardware(new HardwareBasico("HD", 2000));

        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));


        // CRIANDO O CLIENTE
        Cliente cliente = new Cliente("Yasmim Carvalho", "149.149.149-00");


        // MENU
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("===================================");
            System.out.println("          LOJA PC MANIA            ");
            System.out.println("===================================");
            System.out.println("1 - Comprar Promoção 1 (Apple) - R$ " + minhaMatricula);
            System.out.println("2 - Comprar Promoção 2 (Samsung) - R$ " + (minhaMatricula + 1));
            System.out.println("3 - Comprar Promoção 3 (Dell) - R$ " + (minhaMatricula + 2));
            System.out.println("0 - Finalizar Compra");

            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();


            if (opcao == 1) {

                cliente.addComputador(pc1);
                System.out.println("-> Computador da Promoção 1 adicionado!\n");

            } else if (opcao == 2) {

                cliente.addComputador(pc2);
                System.out.println("-> Computador da Promoção 2 adicionado!\n");

            } else if (opcao == 3) {

                cliente.addComputador(pc3);
                System.out.println("-> Computador da Promoção 3 adicionado!\n");

            } else if (opcao != 0) {

                System.out.println("-> Opção inválida! Tente novamente.\n");
            }
        }


        // MOSTRANDO OS DADOS FINAIS
        System.out.println("\n");

        cliente.mostraInfoCliente();


        // PROCESSANDO O PEDIDO
        System.out.println("\n--- Status do Pedido ---");

        ProcessarPedido.enviarPedido(cliente.getComputadores());


        entrada.close();
    }
}