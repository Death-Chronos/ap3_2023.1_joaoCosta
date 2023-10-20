package exercicio02;

public class TestaRunnable {
    public static void main(String[] args) {

        ContadorComThreads c1 = new ContadorComThreads();
        ContadorComThreads c2 = new ContadorComThreads();

        Thread t0 = new Thread(c1);
        Thread t1 = new Thread(c2);
        t0.start();
        t1.start();
    }
}
