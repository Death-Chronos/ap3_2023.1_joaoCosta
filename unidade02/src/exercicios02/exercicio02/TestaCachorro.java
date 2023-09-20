package src.exercicios02.exercicio02;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TestaCachorro {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
        Cachorro cachorro = new Cachorro();
        cachorro.latir();
    }
}
