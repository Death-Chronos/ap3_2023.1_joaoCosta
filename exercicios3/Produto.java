package exercicios3;

public class Produto {
    // 0,5) Crie uma classe chamada Produto com um atributo descricao de visibilidade private. Crie um construtor público para a classe Produto que aceite um parâmetro descricao para inicializar o atributo. Forneça um método público chamado exibirDescricao para exibir a descrição do produto.

    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }
    
    public void exibirDescricao(){
        System.out.printf("Descrição do Produto %s",descricao);
    }
}
