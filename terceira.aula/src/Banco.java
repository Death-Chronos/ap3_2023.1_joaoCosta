import java.util.LinkedList;
import java.util.List;

public class Banco {
    String nome;
    List<ContaBancaria> contas = new LinkedList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<ContaBancaria> getContas() {
        return contas;
    }
    

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta){
        contas.remove(conta);
    }
    
    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", contas=" + contas + "]";
    }
    
}
