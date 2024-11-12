package Util;

import java.util.Scanner;

// entradas de dados do usuário, é ela quem vai fazer a integração
// implementar o scanner


public class InterfaceUsuario {

     Scanner scanner = new Scanner(System.in);
     String comprador; // solicitando o nome do comprador

     public InterfaceUsuario() {
         this.comprador = criarLogin(); // criando um met.constr.
     }

     public String criarLogin() {
         System.out.println("Digite seu nome: "); // impressão do nome no console
         String login = scanner.nextLine();
         return login;
     }

    public double pedirValorImovel() {
        double valorImovel;

        do {
            System.out.println("Informe o valor do imóvel, serão aceitos apenas valores positivos: ");
            valorImovel = scanner.nextDouble();

            if (valorImovel <= 0) {
                System.out.println(" Erro: O valor do imóvel deve ser positivo. Por gentileza, tente novamente. ");

            }
        } while (valorImovel <= 0); // enquanto o valor não for positivo ou maior do que zero, ele vai entrar no loop
            return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;

        do {
            System.out.println("Digite o prazo do financiamento em anos, o número deve ser positivo: ");
            prazoFinanciamento = scanner.nextInt();

            if (prazoFinanciamento <= 0) {
            System.out.println(" Erro: O prazo do financiamento deve ser positivo. Por gentileza, tente novamente. "); }

        } while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;

        do {
            System.out.println("Digite a taxa de juros anual, o valor deve ser positivo: ");
            taxaJuros = scanner.nextDouble();

            if (taxaJuros <= 0) {
                System.out.println("Erro: A taxa de juros deve ser positiva. Por gentileza, tente novamente.");
            }

        } while (taxaJuros <= 0);

        return taxaJuros;
    }
}


// do - while faço a entrada de dados em cada metodo, unifico e simplifico, garanto que o valor correto vai ser inserido
// garanto isso através da conferência no if , pois se o valor for inválido, ele informa o erro e garante a regra de negócio
// quando for solicitado uma "garantia" da regra, posso usar o do while.