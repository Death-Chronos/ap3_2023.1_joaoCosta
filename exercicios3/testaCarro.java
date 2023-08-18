package exercicios3;

import java.util.ArrayList;
import java.util.Scanner;

public class testaCarro {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<Carro>();

        for (int index = 0; index < 4; index++) {
            System.out.println("Por favor, digite a marca, modelo e ano do carro. Exemplo: Fiat Palio 2020");
            Carro carro = new Carro(teclado.next(), teclado.next(), teclado.nextInt());
            carros.add(carro);
        }
        
        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }
    }
}
