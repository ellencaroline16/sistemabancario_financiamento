package Model;

public class Casa extends Financiamento{

    // construtor
    public Casa (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual){
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual); // classe pai
    }

    public double calcularPagamentoMensal(){ //override
        return super.calcularPagamentoMensal() + 80; // regra do enunciado

    }

}
