package src;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
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
