package src.exercicios02.exercicio02;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

//import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
//import javax.swing.SwingUtilities;

public class Cachorro extends Animal {

    public String latir() throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
        /*  try {
        File audioFile = new File("..\\exercicio02\\cachorro.wav"); // Substitua pelo
        caminho do seu arquivo de áudio
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Thread.sleep(5000);
        clip.close();
        } catch (UnsupportedAudioFileException | LineUnavailableException |
        IOException | InterruptedException e) {
        e.printStackTrace();
        } */
        String resource = "./cachorro.wav";
        InputStream input = getClass().getResourceAsStream(resource);
        Clip oClip = AudioSystem.getClip();
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
        oClip.open(audioInput);

        oClip.loop(0); // Toca uma vez
        // oClip.loop(Clip.LOOP_CONTINUOUSLY);  Toca continuamente (para o caso de músicas)
        Thread.sleep(5000);


        // Para a execução (senão o programa termina antes de você ouvir o som)
        return "Ele ta sem zap... AUAUAUAUARGARAU ";
    }

     @Override
     public String emitirSons() throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
         return latir();
     }
}
