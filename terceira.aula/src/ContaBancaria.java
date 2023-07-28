public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
    }
}
