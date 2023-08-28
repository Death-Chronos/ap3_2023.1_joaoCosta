package exercicios3;

import java.util.Scanner;

public class TestaTime {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Time: ");
        Time time = new Time(teclado.nextLine());
        teclado.reset();
        for (int i = 0; i < 11; i++) {
            time.cadastrarJogador();
        }
        System.out.println("Digite o nome do outro Time: ");
        Time time2 = new Time(teclado.nextLine());
        teclado.reset();
        for (int i = 0; i < 11; i++) {
            time.cadastrarJogador();
        }
        teclado.close();
        time.listarJogadores();
        time2.listarJogadores();
    }
}
