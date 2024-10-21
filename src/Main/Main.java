import Model.Financiamento;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario login = new InterfaceUsuario(); // objeto que veio da classe de interfaceUsuario

        Financiamento fin = new Financiamento(login.pedirValorImovel(), login.pedirPrazoFinanciamento(), login.pedirTaxaJuros());
        // objeto fin chama os métodos que estão na classe financiamento valor do imovel, prazo do financiamento e a taxa

        System.out.println("O valor total do seu financiamento será de: " + fin.calcularTotalPagamento());
        System.out.println("O valor mensal do seu financiamento será de: " + fin.calcularPagamentoMensal());

    }
}
