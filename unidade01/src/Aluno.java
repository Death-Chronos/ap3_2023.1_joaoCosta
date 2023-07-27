public class Aluno {
    private String nome;
    private int matricula;
    private double nota1Uni;
    private double nota2Uni;
    private double nota3Uni;

    public Aluno(String nome, int matricula, double nota1Uni, double nota2Uni, double nota3Uni) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1Uni = nota1Uni;
        this.nota2Uni = nota2Uni;
        this.nota3Uni = nota3Uni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1Uni() {
        return nota1Uni;
    }

    public void setNota1Uni(double nota1Uni) {
        this.nota1Uni = nota1Uni;
    }

    public double getNota2Uni() {
        return nota2Uni;
    }

    public void setNota2Uni(double nota2Uni) {
        this.nota2Uni = nota2Uni;
    }

    public double getNota3Uni() {
        return nota3Uni;
    }

    public void setNota3Uni(double nota3Uni) {
        this.nota3Uni = nota3Uni;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1Uni=" + nota1Uni + ", nota2Uni=" + nota2Uni
                + ", nota3Uni=" + nota3Uni + "]";
    }

    public String calcularAprovacao() {
        double media = (nota1Uni + nota2Uni + nota3Uni) / 3;
        if (media >= 7) {
            return "Aluno Aprovado";
        }
        return "Aluno Reprovado";
    }

}
