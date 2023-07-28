public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        

        for (int i = 0; i < 30; i++) {
            ContaBancaria conta = new ContaBancaria(i*100,"Pessoa "+i,i*250);
            banco.adicionarConta(conta);
        }

        System.out.println(banco);
    }
}
