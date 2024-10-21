public class Financiamento {

    //Atributos
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    //Construtor
    Financiamento (double valorDesejadoImovel, int prazoFinanciamentoEmAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoEmAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //Metodos
    double calcularPagamentoMensal(){ //colocar as ações do metodo em verbo p/ facilitar o entendimento

        //fórmula informada do enunciado da atividade
        //Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * ( 1 + (this.taxaJurosAnual / 12));

    }

    double calcularTotalPagamento() {
        //fórmula informada do enunciado da atividade
        //Total do pagamento = pagamento mensal * prazo do financiamento em anos * 12
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

}

