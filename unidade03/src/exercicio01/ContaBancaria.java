package exercicio01;

import exercicio01.exceptions.SaldoInsuficienteException;

public class ContaBancaria {
//     (7,0) Exceptions em Java - faça as seguintes classes:

// Classe ContaBancaria:

// Atributo saldo.
// Método sacar(valor) lança SaldoInsuficienteException se saldo < valor.
// Método depositar(valor) lança IllegalArgumentException se valor negativo.

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor invalido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
