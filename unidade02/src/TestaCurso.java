package src;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Desenvolvimento de Games");
        try {
            Disciplina programacao = new Disciplina("Programação",80);
            Disciplina graficos = new Disciplina("Design Grafico", 40);
            curso.adicionarDisciplina(graficos);
            curso.adicionarDisciplina(programacao);
            System.out.println(curso.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
