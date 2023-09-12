package src.exercicios01.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    // (1,0) Crie uma classe Empresa que contenha atributos como nomeEmpresa e uma lista de funcionarios. Encapsule adequadamente esses atributos. Implemente um método adicionarFuncionario(Funcionario funcionario) para adicionar um funcionário à empresa. Além disso, crie um método calcularTotalSalarios() que calcula e retorna o total de salários de todos os funcionários na empresa.
    private String nomeEmpresa;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public double calcularTotalSalarios(){
        double totalSalario = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalario+= funcionario.getSalario();
        }
        return totalSalario;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    

    
}
