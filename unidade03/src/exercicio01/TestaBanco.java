package exercicio01;

public class TestaBanco {
    public static void main(String[] args) {
        // Classe TestaBanco:

        // Ponto de entrada (main), testa as classes feitas, realizando transações,
        // capturando e imprimindo as mensagens de erro quando ocorrerem.
        ContaBancaria conta = new ContaBancaria(1200);

        //TransacaoBancaria.realizarTransacao(conta, 100);
        TransacaoBancaria.realizarTransacao(conta, -2000);
        //TransacaoBancaria.realizarTransacao(conta, 3000);

    }
}
