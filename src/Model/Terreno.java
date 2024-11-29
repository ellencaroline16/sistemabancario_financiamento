package Model;

public class Terreno extends Financiamento{

    public String tipoZona;

    public Terreno (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual, String tipoZona){
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual);  // classe pai
        this.tipoZona = tipoZona;
    }

    public double calcularPagamentoMensal(){ //override
        return super.calcularPagamentoMensal() * 2.00;

    }

    public void detalhesAdicionais(){
        System.out.println("Tipo de zona: " + tipoZona);
    }
}
