package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FazALeituraDosDados {

    public static void main(String[] args) {
        String arquivo = "financiamentos.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {  // o buff + o file são responsáveis por abrir e fazer a leitura do arquivo evitando erros
            String linha;
            while ((linha = reader.readLine()) != null) { //leitura de uma linha por vez
                System.out.println(linha);
            }
        } catch (IOException e) { // try p/ garantir que tá tudo ok
            System.out.println("Erro ao ler os dados do arquivo: " + e.getMessage());
        }
    }
}
