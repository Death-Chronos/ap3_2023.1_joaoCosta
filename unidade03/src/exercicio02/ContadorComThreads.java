package exercicio02;

import java.util.Random;

public class ContadorComThreads implements Runnable {

    private Random gerador = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
            try {
                Thread.sleep(gerador.nextLong(1000, 10000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
