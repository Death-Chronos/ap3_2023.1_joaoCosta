package exercicios3;

import java.util.Scanner;

// Faça uma classe TestaBibliotecaPequena com o cadastro de 6 livros. Armazene o nome dos livros no array e use a classe Scanner para ler o nome de cada livro.
public class TestaBibliotecaPequena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] livros = new String[6];

        for (int index = 0; index < livros.length; index++) {
            livros[index] = teclado.nextLine();
        }

        // String[] livros = {
        // "João e Maria",
        // "Como fazer um bolo sem leite e sem ovos e outras façanhas culinárias",
        // "Seja um orador",
        // "Como programadar em Java: Xico Edition",
        // "O Diário de Um Banana" };


        BibliotecaPequena biblioteca = new BibliotecaPequena("Santa Maria", livros);
        biblioteca.listarLivros();
    }

}