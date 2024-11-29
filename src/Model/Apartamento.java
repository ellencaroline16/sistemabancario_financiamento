package Model;

public class Apartamento extends Financiamento{

    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual, int vagasGaragem, int numeroAndar) {
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual); // classe pai
        this.vagasGaragem = 0;
        this.numeroAndar = 0;
    }

    public double calcularPagamentoMensal(){ //override
        double taxaMensal = this.getTaxaJurosAnual()/12/100; //dividindo por meses e em decimal
        int meses = this.getPrazoFinanciamento() * 12; // mudo para meses

        // formula price - amortização ao longo do tempo e tem uma formula matemática tbm
        // math.pow é usado para representar exponenciação 2 (elevado) ^ 3, tipo isso
        return (this.getValorImovel() * taxaMensal * Math.pow( 1 + taxaMensal, meses)) / (Math.pow(1 + taxaMensal,meses) - 1);
    }

    public void detalhesAdicionais(){
        System.out.println("Número de vagas na garagem: " + this.vagasGaragem);
        System.out.println("Andar: " + this.numeroAndar);
    }

}
