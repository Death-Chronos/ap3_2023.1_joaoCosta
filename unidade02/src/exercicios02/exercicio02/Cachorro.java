package src.exercicios02.exercicio02;

import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class Cachorro extends Animal {

    public String latir() {

        return "Ele ta sem zap... AUAUAUAUARGARAU ";
    }

    @Override
    public String emitirSons() {
        return latir();
    }
}
