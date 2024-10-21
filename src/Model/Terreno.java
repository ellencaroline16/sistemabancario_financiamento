package Model;

public class Terreno extends Financiamento{

    public Terreno (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual){
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual); // classe pai
    }

    public double calcularPagamentoMensal(){ //override
        return super.calcularPagamentoMensal() * 2.00;

    }
}
