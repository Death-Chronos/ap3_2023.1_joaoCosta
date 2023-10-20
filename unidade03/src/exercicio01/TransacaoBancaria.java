package exercicio01;

import exercicio01.exceptions.SaldoInsuficienteException;

public class TransacaoBancaria {
    // Classe TransacaoBancaria:

    // Método estático realizarTransacao(conta, valor) saca valor da conta.
    // Captura (catch) SaldoInsuficienteException, imprime "Saldo insuficiente."
    // Captura (catch) IllegalArgumentException, imprime "Valor inválido." e imprime
    // a stack de erro.
    

    public static void realizarTransacao(ContaBancaria conta, double valor) {
        try {
            conta.sacar(valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
