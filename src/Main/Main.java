package Main;

import Model.Apartamento;
import Model.Casa;
import Model.Financiamento;
import Model.Terreno;
import Util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario login = new InterfaceUsuario(); // objeto que veio da classe de interfaceUsuario

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // para financiar uma casa
        Casa primeiraCasa = new Casa(login.pedirValorImovel(), login.pedirPrazoFinanciamento(), login.pedirTaxaJuros());
        financiamentos.add(primeiraCasa);

        // simulando outros financiamentos mas dentro do código:

        Casa segundaCasa = new Casa(600000, 20, 10);
        Apartamento primeiroApartamento = new Apartamento(4800000, 25, 8);
        Apartamento segundoApartamento = new Apartamento(2800000, 12, 6);
        Terreno primeiroTerreno = new Terreno(3000000, 10, 5);


        // adicionando as infos da classe financiamento com as demais = fazendo a operação/simulação de forma mais reduzida
        financiamentos.add(segundaCasa);
        financiamentos.add(primeiroApartamento);
        financiamentos.add(segundoApartamento);
        financiamentos.add(primeiroTerreno);

        // variáveis para utilizar na soma
        double somaImoveis = 0;
        double somaFinanciamentos = 0;


        for (Financiamento finan : financiamentos) {
            System.out.println("O valor mensal do financiamento será de: " + String.format("%.2f", finan.calcularPagamentoMensal()));
            System.out.println("O valor total do financiamento será de: " + String.format("%.2f", finan.calcularTotalPagamento()));


            somaImoveis += finan.getValorImovel();
            somaFinanciamentos += finan.calcularTotalPagamento();
        }

        System.out.println("Soma total dos valores dos imóveis: " + String.format("%.2f", somaImoveis));
        System.out.println("Soma total dos valores dos financiamentos: " + String.format("%.2f", somaFinanciamentos));
    }
}

    //Financiamento fin = new Financiamento(login.pedirValorImovel(), login.pedirPrazoFinanciamento(), login.pedirTaxaJuros());
    // objeto fin chama os métodos que estão na classe financiamento valor do imovel, prazo do financiamento e a taxa
    //System.out.println("O valor total do seu financiamento será de: " + fin.calcularTotalPagamento());
    //System.out.println("O valor mensal do seu financiamento será de: " + fin.calcularPagamentoMensal());
