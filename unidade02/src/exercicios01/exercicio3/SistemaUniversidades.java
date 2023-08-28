package src.exercicios01.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class SistemaUniversidades {
    private List<Universidade> universidades = new ArrayList<Universidade>();

    public void adicionarUniversidade(Universidade un) {
        universidades.add(un);
    }

    public String encontrarUniversidadeComMaisAlunos() {
        Universidade uni = universidades.get(0);
        for (Universidade universidade : universidades) {
            if (uni.calcularQuantidadeAlunos() < universidade.calcularQuantidadeAlunos()) {
                uni = universidade;
            }
        }
        return uni.getNome();
    }
}
