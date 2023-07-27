// Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.
public class Produto {
    String nome;
    double preco;
    int qntEstoque;

    

    public Produto(String nome, double preco, int qntEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQntEstoque() {
        return qntEstoque;
    }
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preço = " + preco + ", Quantidade no Estoque = " + qntEstoque + "]";
    }
}
