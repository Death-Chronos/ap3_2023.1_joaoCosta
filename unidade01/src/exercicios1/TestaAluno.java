public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jose", 2022031028, 7.0, 3.1, 8.0);
        Aluno aluna = new Aluno("livia", 202208254, 9.0, 5.2, 7.4);

        System.out.println(aluno.calcularAprovacao());
        System.out.println(aluna.calcularAprovacao());

    }
}
