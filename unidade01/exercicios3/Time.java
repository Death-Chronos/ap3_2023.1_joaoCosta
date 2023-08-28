package exercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Time {
    Scanner teclado = new Scanner(System.in);

    private String nomeTime;
    List<Jogador> jogadores;

    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<Jogador>(11);
    }

    public void cadastrarJogador() {
        System.out.println("Digite o nome do jogador: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite a altura: Exemplo: 1,89");
        float altura = teclado.nextFloat();
        teclado.nextLine();
        Jogador jogador = new Jogador(nome, idade, altura);
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.printf("Jogadores do time %s: \n",this.nomeTime);
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

}
