package src.exercicios02.exercicio02;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
    private String nome;
    private int idade;

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

    public String emitirSons() throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException{
        return "Vozes do além";
    }

    
}
