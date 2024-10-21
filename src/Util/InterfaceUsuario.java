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

    double pedirValorImovel() {
        System.out.println("Digite o valor do imóvel: ");
        return scanner.nextDouble(); // entrada do valor em double
    }

    int pedirPrazoFinanciamento() {
        System.out.println("Digite o prazo do financiamento em anos: ");
        return scanner.nextInt(); // entrada do valor em int
    }

    double pedirTaxaJuros() {
        System.out.println("Digite a taxa de juros anual: ");
        return scanner.nextDouble();
    }
}
