package Model;

public abstract class Financiamento {

    //Atributos
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    //getter

    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }



    //Construtor - é um métod.
    public Financiamento (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoEmAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public abstract void detalhesAdicionais();

    //Metodos
    public  double calcularPagamentoMensal(){ //colocar as ações do metodo em verbo p/ facilitar o entendimento

        //fórmula informada do enunciado da atividade
        //Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * ( 1 + (this.taxaJurosAnual / 12));

    }

    public double calcularTotalPagamento() {
        return 0;
    }

    protected void setValorDesejadoImovel(double valorNovo) {
    }

    public String toString() {
        return String.format("Valor do Imóvel: %.2f, Prazo: %d anos, Taxa de Juros: %.2f%%",
                this.valorImovel, this.prazoFinanciamento, this.taxaJurosAnual);
    }

}