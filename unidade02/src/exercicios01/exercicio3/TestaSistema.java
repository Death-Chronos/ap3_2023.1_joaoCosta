package src.exercicios01.exercicio3;

import src.exercicios01.exercicio1.Curso;

public class TestaSistema {
    public static void main(String[] args) {
        Curso curso1 = new Curso("fgdh",45);
        Curso curso2 = new Curso("tfk",30);
        Curso curso3 = new Curso("hgv",22);

        Universidade universidade1 = new Universidade("Uni1");
        universidade1.adicionarCurso(curso1);
        universidade1.adicionarCurso(curso3);
        Universidade universidade2 = new Universidade("Uni2");
        universidade2.adicionarCurso(curso1);
        universidade2.adicionarCurso(curso2);

        SistemaUniversidades  sistema= new SistemaUniversidades();
        sistema.adicionarUniversidade(universidade1);
        sistema.adicionarUniversidade(universidade2);

        System.out.println(sistema.encontrarUniversidadeComMaisAlunos());
    }
}
