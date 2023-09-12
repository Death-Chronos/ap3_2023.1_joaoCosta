package src.exercicios01.exercicio1;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private int quantidadeAlunos; // para o exercício 3

    public Curso(String nome, int quantidade) {
        this.nome = nome;
        this.quantidadeAlunos =  quantidade;
    }
    public Curso(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        texto.append("Curso: ").append(this.nome).append("\n");

        for (Disciplina disciplina : disciplinas) {
            texto.append(disciplina.toString()).append("\n");
        }
        return texto.toString();
    }

}
