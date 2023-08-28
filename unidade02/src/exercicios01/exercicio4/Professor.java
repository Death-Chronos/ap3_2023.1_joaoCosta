package src.exercicios01.exercicio4;

import src.exercicios01.exercicio1.Disciplina;

public class Professor {
    private String nome;
    private Disciplina disciplina;
    private String dataNascimento;

    public Professor(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public void vincularDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", disciplina=" + disciplina + ", dataNascimento=" + dataNascimento + "]";
    }

    
}
