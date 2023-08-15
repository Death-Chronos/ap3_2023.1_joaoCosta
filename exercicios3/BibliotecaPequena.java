package exercicios3;

// (1,0) Crie uma classe BibliotecaPequena com atributos nome (private) e livros[6] (protected). A classe Biblioteca deve conter um método listarLivros de visibilidade public que exibe os nomes dos livros cadastrados. 
public class BibliotecaPequena {
    private String nome;
    protected String[] livros = new String[6];

    public BibliotecaPequena(String nome, String[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public void listarLivros() {
        int i = 0;
        System.out.println("Livros da Biblioteca "+ this.nome+":");
        for (String livro : livros) {
            System.out.printf("%d° livro: %s \n", ++i, livro);
            
        }
    }
}
