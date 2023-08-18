package exercicios3;

import java.util.Random;

public class Jogador {
    private static final Random gerador = new Random();
    private long codigo;
    private String nome;
    private int idade;
    private float altura;

    public Jogador(String nome, int idade, float altura) {
        this.codigo = gerador.nextLong();
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jogador [codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    } 

    

    



}
