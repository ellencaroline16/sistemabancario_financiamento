package Model;

public class Casa extends Financiamento{

    private double areaConstruida;
    private double areaTerreno;



    // construtor
    public Casa (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual, double areaConstruida, double areaTerreno){
        super(valorDesejadoImovel, prazoFinanciamentoEmAnos, taxaJurosAnual); // classe pai
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    public void detalhesAdicionais() {
        System.out.println("Detalhes adicionais da casa:");
        System.out.println("Área construída: " + this.areaConstruida + " m²");
        System.out.println("Área do terreno: " + this.areaTerreno + " m²");
    }

    public double calcularPagamentoMensal(){ //override
        return super.calcularPagamentoMensal() + 80; // regra do enunciado

    }

    public void aplicarDesconto(double desconto)throws DescontoMaiorDoQueJurosException{
        double jurosMensal = super.calcularPagamentoMensal() * super.getTaxaJurosAnual();

    if(desconto > jurosMensal){
        throw new DescontoMaiorDoQueJurosException("O desconto não foi validado pois é maior do que o valor dos juros mensais!");
    }

    double valorNovo = super.calcularPagamentoMensal() - desconto / 100;
    super.setValorDesejadoImovel (valorNovo);

        System.out.println("Desconto aplicado com sucesso, o novo valor do financiamento é de: " + valorNovo);
    }
}
