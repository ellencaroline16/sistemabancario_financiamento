package Model;

public class Apartamento extends Financiamento{

    public Apartamento (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual){
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual); // classe pai
    }

    public double calcularPagamentoMensal(){ //override
        double taxaMensal = this.getTaxaJurosAnual()/12/100; //dividindo por meses e em decimal
        int meses = this.getPrazoFinanciamento() * 12; // mudo para meses

        // formula price - amortização ao longo do tempo e tem uma formula matemática tbm
        // math.pow é usado para representar exponenciação 2 (elevado) ^ 3, tipo isso
        return (this.getValorImovel() * taxaMensal * Math.pow( 1 + taxaMensal, meses)) / (Math.pow(1 + taxaMensal,meses) - 1);
    }

}
