package exercicios3;

public class Pessoa {
    // (0,5) Crie uma classe chamada Pessoa com um atributo nome (private). Forneça métodos públicos getNome e setNome para acessar e modificar o atributo. Altere o toString para exibir o nome completo em letras maiúsculas.

    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome.toUpperCase() + "]";
    }

    
}
