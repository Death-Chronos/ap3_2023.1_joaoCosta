package exercicio01.exceptions;

public class SaldoInsuficienteException extends RuntimeException {
    
    public SaldoInsuficienteException(){
        super("Saldo Insuficiente para a Operação.");
    }

}
