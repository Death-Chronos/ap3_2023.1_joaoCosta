// Crie uma classe chamada "Pessoa" que tenha os atributos nome, idade e altura. Implemente os seguintes métodos:
// Substitua o método toString() padrão da classe Object. O método toString() deve retornar uma string contendo as informações completas da pessoa, incluindo nome, idade e altura. Certifique-se de anotar o método com a anotação @Override.
// Crie um método chamado fazerAniversario() que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
// Crie um método chamado ehMaiorDeIdade() que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar true se for maior de idade ou false caso contrário.
public class Pessoa {
    String nome;
    int idade;
    int altura;

    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.printf("Feliz aniversário! Agora você tem %d anos.", idade);
    }

    public boolean ehMaiorDeIdade() {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

}

/* ...: 100098201595?

    É um código secreto que usaremos mais tarde... Hehe
    - Mickey Xico Mouse 

*/ 
