package src.exercicios01.exercicio1;
// (1,0) Crie uma classe Disciplina com os atributos nomeDisciplina e cargaHoraria. Encapsule corretamente os atributos. A classe Curso deve conter um nome e uma lista de Disciplina como parte de sua composição. No método toString() exiba todas as informações do Curso e das Disciplinas. Implemente corretamente a visibilidade de cada método e cada atributo. Opcionalmente, trate como "IllegalArgumentException" se a carga horária for menor que 0.
public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        if(cargaHoraria==0){
            throw new IllegalArgumentException("Carga horária deve ser maior que zero");
        }
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Disciplina: "+ nomeDisciplina + "\nCarga Horaria:" + cargaHoraria;
    }
    
}
