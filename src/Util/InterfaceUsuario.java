package Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    private static double limite_de_valor_do_imovel = 3_000_000.00; // limitando o valor
    private static int limite_de_prazo_financiamento = 32;

    Scanner scanner = new Scanner(System.in);
    String comprador; // nome da pessoa

    public InterfaceUsuario() {
        criarLogin(); // met.constr
    }

    private void criarLogin() {
        System.out.println("Digite seu nome: ");
        this.comprador = scanner.nextLine();
        System.out.println("Olá, " + this.comprador + "! Vamos começar a simulação de financiamentos.");
    }

    public double pedirValorImovel() {
        double valorImovel = -1;

        do {
            try {
                System.out.println("Informe o valor do imóvel, serão aceitos apenas valores positivos: ");
                valorImovel = scanner.nextDouble();

                if (valorImovel <= 0) {
                    System.out.println("Erro: O valor do imóvel deve ser positivo. Por gentileza, tente novamente.");
                } else if (valorImovel > limite_de_valor_do_imovel) {
                    System.out.println("Erro: o valor do imóvel não pode exceder 3.000.000,00. Por gentileza, insira um valor menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por gentileza, insira um valor numérico.");
                scanner.nextLine();
            }
        } while (valorImovel <= 0 || valorImovel > limite_de_valor_do_imovel);

        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento = -1;

        do {
            try {
                System.out.println("Digite o prazo do financiamento em anos, o número deve ser positivo: ");
                prazoFinanciamento = scanner.nextInt();

                if (prazoFinanciamento <= 0) {
                    System.out.println("Erro: O prazo de financiamento deve ser positivo. Por gentileza, tente novamente.");
                } else if (prazoFinanciamento > limite_de_prazo_financiamento) {
                    System.out.printf("Erro: O prazo do financiamento não pode exceder 32 anos. Por gentileza, tente novamente.%n");
                }
            }catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por gentileza, insira um valor numérico.");
                scanner.nextLine();
            }
        } while (prazoFinanciamento <= 0 || prazoFinanciamento > limite_de_prazo_financiamento);

        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros = -1;
        double limite_de_taxa_juros = 15.0; // limite da taxa

        do {
            try {
                System.out.println("Digite a taxa de juros anual, o valor deve ser positivo: ");
                taxaJuros = scanner.nextDouble();

                if (taxaJuros <= 0) {
                    System.out.println("Erro: A taxa de juros deve ser positiva. Por gentileza, tente novamente.");
                } else if (taxaJuros > limite_de_taxa_juros) {
                    System.out.println("Erro: a taxa de juros não pode exceder o valor de 15%, por gentileza, insira um valor menor.");
                }
            }catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por gentileza, insira um valor numérico.");
                scanner.nextLine();
            }

        } while (taxaJuros <= 0 || taxaJuros > limite_de_taxa_juros);

        return taxaJuros;
    }

    public double pedirAreaConstruida() {
        double areaConstruida;
        double limite_da_area = 100.0; // limite da taxa

        do {
            System.out.println("Digite o número da área desejada: ");
            areaConstruida = scanner.nextDouble();

            if (areaConstruida <= 0) {
                System.out.println("Erro: O número deve ser positivo. Por gentileza, tente novamente.");
            } else if (areaConstruida > limite_da_area) {
                System.out.println("Erro: O número não pode ser maior do que 100, por gentileza, insira um valor menor.");
            }

        } while (areaConstruida <= 0 || areaConstruida > limite_da_area);

        return areaConstruida;
    }

    public double pedirNumeroDeVagas() {

        double quantidadeVagas;
        double limite_de_vagas = 4; // limite da taxa

        do {
            System.out.println("Digite o número de vagas desejada: ");
            quantidadeVagas = scanner.nextDouble();

            if (quantidadeVagas <= 0) {
                System.out.println("Erro: O número deve ser positivo. Por gentileza, tente novamente.");
            } else if (quantidadeVagas > limite_de_vagas) {
                System.out.println("Erro: O número não pode ser maior do que 04, por gentileza, insira um valor menor.");
            }

        } while (quantidadeVagas <= 0 || quantidadeVagas > limite_de_vagas);

        return quantidadeVagas;
    }

    public double pedirNumeroDoAndar() {

        double numeroAndar;
        double limite_de_andares = 14; // limite da taxa

        do {
            System.out.println("Digite o número do andar desejado: ");
            numeroAndar = scanner.nextDouble();

            if (numeroAndar <= 0) {
                System.out.println("Erro: O número deve ser positivo. Por gentileza, tente novamente.");
            } else if (numeroAndar > limite_de_andares) {
                System.out.println("Erro: O número não pode ser maior do que 14, por gentileza, insira um valor menor.");
            }

        } while (numeroAndar <= 0 || numeroAndar > limite_de_andares);

        return numeroAndar;
    }

    public String pedirTipoDeZona() {

        String tipoZona;
        scanner.nextLine(); //limpar o scanner

        do {
            System.out.println("Digite o tipo de zona desejada (residencial ou comercial): ");
            tipoZona = scanner.nextLine().trim().toLowerCase(); //limpar e transformar

            if (!tipoZona.equals("residencial") && !tipoZona.equals("comercial")) {
                System.out.println("Erro: Tipo de zona inválido. Por gentileza, insira 'residencial' ou 'comercial'.");
            }

        } while (!tipoZona.equals("residencial") && !tipoZona.equals("comercial"));

        return tipoZona;
    }

    public String pedirTipoDeImovel() {
        String tipoImovel;

        do {
            System.out.println("Digite o tipo de imóvel desejado (Casa, Apartamento ou Terreno): ");
            tipoImovel = scanner.nextLine().trim().toLowerCase();

            if (!tipoImovel.equals("casa") && !tipoImovel.equals("apartamento") && !tipoImovel.equals("terreno")) {
                System.out.println("Erro: Tipo de imóvel inválido. Por gentileza, insira 'Casa', 'Apartamento' ou 'Terreno'.");
            }

        } while (!tipoImovel.equals("casa") && !tipoImovel.equals("apartamento") && !tipoImovel.equals("terreno"));

        return tipoImovel;
    }
}
