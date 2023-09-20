package src.exercicios01.exercicio3;

import java.util.ArrayList;
import java.util.List;

import src.exercicios01.exercicio1.Curso;

public class Universidade {
    private String nome;
    private List<Curso> cursos = new ArrayList<Curso>();
    

    public Universidade(String nome) {
        this.nome = nome;
    }
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }


    public long calcularQuantidadeAlunos() {
        long quantidade = 0;
        for (Curso curso : cursos) {
            quantidade += curso.getQuantidadeAlunos();
        }
        return quantidade;
    }


    public String getNome() {
        return nome;
    }
    
}
