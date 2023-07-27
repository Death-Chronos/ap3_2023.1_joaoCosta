public class TestaContaBancaria {
    public static void main(String[] args) {
        Conta conta1 = new Conta(4357761, "Carlos",2000);
        Conta conta2 = new Conta(5927592, "Antony",3500);
        Conta conta3 = new Conta(86713945, "Vitor",4200);

        conta1.depositar(200);
        conta2.sacar(500);
        conta3.depositar(1340);

        System.out.println(conta1.verificarSaldo());
        System.out.println(conta2.verificarSaldo());
        System.out.println(conta3.verificarSaldo());





    }
}
