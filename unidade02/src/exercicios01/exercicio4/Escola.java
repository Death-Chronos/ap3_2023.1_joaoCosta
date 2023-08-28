package src.exercicios01.exercicio4;

import java.util.ArrayList;

import src.exercicios01.exercicio1.Disciplina;

public class Escola {
    // Crie uma classe Escola com os atributos nomeEscola, endereco (do tipo Endereco com atributos logradouro, cidade e cep) e um array de Professor (cada um com atributos nome, data de nascimento e disciplina). Certifique-se de encapsular corretamente esses atributos. Utilize a classe Disciplina do exercício 1, usando-a via importação de um pacote externo. Implemente um método contratarProfessor(Professor professor, Disciplina disciplina) para adicionar um professor à escola e associá-lo a uma disciplina. Crie também um método listarProfessores() para exibir os dados da escola e os nomes dos professores e suas disciplinas.
    private String nomeEscola;
    private Endereco Endereco;
    private ArrayList<Professor> professores = new ArrayList<Professor>(100);

    public void contratarProfessor(Professor prof, Disciplina dis){
        prof.vincularDisciplina(dis);
        professores.add(prof);
    }
    public void listarProfessores(){
        for (Professor professor : professores) {
            System.out.println(professor.toString());
        }
    }
}
