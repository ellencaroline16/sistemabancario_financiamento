package Util;

import java.util.Scanner;

public class InterfaceUsuario {

    private static double limite_de_valor_do_imovel = 3_000_000.00; // limitando o valor
    private static int limite_de_prazo_financiamento = 32;

    Scanner scanner = new Scanner(System.in);
    String comprador; // solicitando o nome do comprador

    public InterfaceUsuario() {
        criarLogin(); // met.constr
    }

    private void criarLogin() {
        System.out.println("Digite seu nome: ");
        this.comprador = scanner.nextLine();
        System.out.println("Olá, " + this.comprador + "! Vamos começar a simulação de financiamentos.");
    }

    public double pedirValorImovel() {
        double valorImovel;

        do {
            System.out.println("Informe o valor do imóvel, serão aceitos apenas valores positivos: ");
            valorImovel = scanner.nextDouble();

            if (valorImovel <= 0) {
                System.out.println("Erro: O valor do imóvel deve ser positivo. Por gentileza, tente novamente.");
            } else if (valorImovel > limite_de_valor_do_imovel) {
                System.out.println("Erro: o valor do imóvel não pode exceder 3.000.000,00. Por gentileza, insira um valor menor.");
            }
        } while (valorImovel <= 0 || valorImovel > limite_de_valor_do_imovel);

        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;

        do {
            System.out.println("Digite o prazo do financiamento em anos, o número deve ser positivo: ");
            prazoFinanciamento = scanner.nextInt();

            if (prazoFinanciamento <= 0) {
                System.out.println("Erro: O prazo de financiamento deve ser positivo. Por gentileza, tente novamente.");
            } else if (prazoFinanciamento > limite_de_prazo_financiamento) {
                System.out.printf("Erro: O prazo do financiamento não pode exceder 32 anos. Por gentileza, tente novamente.%n");
            }
        } while (prazoFinanciamento <= 0 || prazoFinanciamento > limite_de_prazo_financiamento);

        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;
        double limite_de_taxa_juros = 15.0; // limite da taxa

        do {
            System.out.println("Digite a taxa de juros anual, o valor deve ser positivo: ");
            taxaJuros = scanner.nextDouble();

            if (taxaJuros <= 0) {
                System.out.println("Erro: A taxa de juros deve ser positiva. Por gentileza, tente novamente.");
            } else if (taxaJuros > limite_de_taxa_juros) {
                System.out.println("Erro: a taxa de juros não pode exceder o valor de 15%, por gentileza, insira um valor menor.");
            }

        } while (taxaJuros <= 0 || taxaJuros > limite_de_taxa_juros);

        return taxaJuros;
    }
}


// do - while faço a entrada de dados em cada metodo, unifico e simplifico, garanto que o valor correto vai ser inserido
// garanto isso através da conferência no if , pois se o valor for inválido, ele informa o erro e garante a regra de negócio
// quando for solicitado uma "garantia" da regra, posso usar o do while.